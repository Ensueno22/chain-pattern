package com.ensueno.pattern.protocol;

import com.ensueno.pattern.chain.ChainAssembler;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

@Data
public abstract class AbstractFieldProcessor implements Processor {

    @Autowired
    protected Sender sender;

    @Autowired
    protected Sender2 sender2;

    protected ChainAssembler<Map<String, Object>> chainAssembler;

    @Override
    public boolean fieldProcessing(Map<String, Object> o) {
        return chainAssembler.passableRegister(o);
    }
}

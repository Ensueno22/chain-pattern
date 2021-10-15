package com.ensueno.pattern.protocol;

import com.ensueno.pattern.chain.ChainOfResponsibility;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Map;

//@Component
//@Scope("prototype")
public class Sender2 extends ChainOfResponsibility<Map<String, Object>> {

    @Override
    protected boolean isPassableRegister(Map<String, Object> o) {
        System.out.println("sender2 type=" + o.get("type"));
        return true;
    }
}

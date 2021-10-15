package com.ensueno.pattern.protocol;

import java.util.Map;

public class SenderProcessor extends AbstractFieldProcessor implements Processor {

    public void init(){
        chainAssembler = sender;
        chainAssembler.setNextChecker(sender2);
    }

    @Override
    public boolean fieldProcessing(Map<String, Object> o) {
        return super.fieldProcessing(o);
    }

}

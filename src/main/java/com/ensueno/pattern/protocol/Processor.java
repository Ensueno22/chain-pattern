package com.ensueno.pattern.protocol;

import java.util.Map;

public interface Processor {
    boolean fieldProcessing(Map<String, Object> o);
}

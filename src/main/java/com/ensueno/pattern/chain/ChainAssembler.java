package com.ensueno.pattern.chain;

public interface ChainAssembler<T> {
    ChainAssembler<?> nextChecker();
    ChainAssembler<?> setNextChecker(ChainAssembler<?> nextChecker);
    boolean passableRegister(T t);
}

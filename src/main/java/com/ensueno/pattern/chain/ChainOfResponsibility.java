package com.ensueno.pattern.chain;

public abstract class ChainOfResponsibility<T> implements ChainAssembler<T> {

    private ChainAssembler<T> registerChecker;

    @Override
    public ChainAssembler<T> nextChecker() {
        return this.registerChecker;
    }

    @Override
    public ChainAssembler<T> setNextChecker(
            @SuppressWarnings("rawtypes")
                    ChainAssembler nextChecker) {
        this.registerChecker = nextChecker;
        return registerChecker;
    }

    @Override
    public boolean passableRegister(T t) {
        if(isPassableRegister(t)){
            if(nextChecker() == null)
                return true;

            return nextChecker().passableRegister(t);
        }
        return false;
    }

    protected abstract boolean isPassableRegister(T t);
}

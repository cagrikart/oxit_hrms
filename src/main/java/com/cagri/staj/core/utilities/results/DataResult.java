package com.cagri.staj.core.utilities.results;

public class DataResult<T> extends Result{

    private  T data;

    public DataResult( T data ,boolean success, String messeage) {
        super(success, messeage);
        this.data = data;
    }

    public DataResult(T data, boolean success) {
        super(success);
        this.data = data;
    }
    public T getData() {
        return this.data;
    }
}

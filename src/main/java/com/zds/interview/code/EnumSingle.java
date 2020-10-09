package com.zds.interview.code;

public enum EnumSingle {
    INSTANCE;

    private EnumSingle(){}
    public int add(int a,int b){

        return a+b;
    }

}

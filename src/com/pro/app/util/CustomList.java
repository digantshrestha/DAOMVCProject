package com.pro.app.util;

public class CustomList<T>{
    private Object[] data=new Object[0];

    public void add(T val){
        if(data.length==0){
            data=new Object[1];
            data[0]=val;
        }else{
            Object[] temp=new Object[data.length+1];
            for(int i=0;i<data.length;i++){
                temp[i]=data[i];
            }
            temp[data.length]=val;
            data=temp;
        }
    }

    public Object[] getAll(){
        return (Object[])data;
    }
}
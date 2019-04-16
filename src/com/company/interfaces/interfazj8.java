package com.company.interfaces;

public interface interfazj8 {

    String AbstractMethod(String nombre);

    default String DefaultMethod(String name){

        return name;
    }
}

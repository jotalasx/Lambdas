package com.company;

import com.company.implement.implClass;
import com.company.implement.implClass2;
import com.company.interfaces.interfazj8;
import com.company.interfaces.interfazj9;

public class Main {

    public static void main(String[] args) {

        /*
        // Primera opción
        // Declaramos la implementacion
        String name;
        implClass implclass = new implClass();
        name = implclass.DefaultMethod("Jose");
        System.out.println(name);

        // Segunda opción
        // Declaramos la interfaz
        // Definimos el metodo abstracto de la interfaz.
        String name2;
        interfazj8 interfazj8 = (s) -> (s.concat(";"));
        name2 = interfazj8.AbstractMethod("Jose");
        System.out.println(name2);

        //interfazj8 interfazj8 = (s)(parametro de entrada)
        // ->(modificador lambda) (s.concat(";"))(haz esto con
        // lo que te estoy pasando);
        //El codigo anterior es igual a este:
        interfazj8 inter = new interfazj8() {
            @Override
            public String AbstractMethod(String name) {
                return name.concat(";");
            }
        };

        name2 = inter.AbstractMethod("Josele");
        System.out.println(inter.AbstractMethod("Josele"));*/

        String name3;
        interfazj9 interfazj9 = (s) -> ("Hello, " + s);
        name3 = interfazj9.salute("Helen");
        System.out.println(name3);









    }
}

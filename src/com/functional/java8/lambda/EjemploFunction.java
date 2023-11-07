package com.functional.java8.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {

//Representa una función donde el 1er argumento es el de entrada y el 2do es el resultado de salida.
//Esta es una interfaz funcional cuyo método funcional es apply(Object).
        Function<String, String> f1 = param -> "Hola que tal! " + param;
        String resultado = f1.apply("lucia");
        System.out.println(resultado);

        Function<String, String> f2 = String::toUpperCase;//param -> param.toUpperCase();
        System.out.println(f2.apply("santiago"));

//Representa una funcion donde el 1er y 2do argumento son de entrada y el 3ero, el tipo de resultado de salida
        BiFunction<String, String, String> f3 = (a, b) -> a.toUpperCase().concat(b.toUpperCase());
        String r2 = f3.apply("andres", "jose");
        System.out.println(r2);

        BiFunction<String, String, Integer> f4 = String::compareTo;// (a, b) -> a.compareTo(b);
        System.out.println(f4.apply("ximena", "ximena"));

        BiFunction<String, String, String> f5 = String::concat;// (a, b) -> a.concat(b);
        System.out.println(f5.apply("Gaston", "jose"));
    }
}

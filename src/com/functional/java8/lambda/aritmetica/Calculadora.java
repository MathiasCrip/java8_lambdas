package com.functional.java8.lambda.aritmetica;

import java.util.function.BiFunction;

public class Calculadora {

    //método que recibe dos parametros de tipo double (a,b) y uno de tipo de la interfaz 'Aritmetica'
    public double computar(double a, double b, Aritmetica lambda) {
        //se invoca el método de la interfaz y se pasan los argumentos  a + b
        return lambda.operacion(a, b);
    }

    //Misma finalidad que el método computar, solo que aqui, se pasa un BiFunction<Entrada,Entrada,Salida>
    public double computarConBiFunction(double a, double b, BiFunction<Double, Double, Double> lambda) {
//        se invoca el metodo de la BiFunction apply() y se le pasan los dos valores double por parametro
        return lambda.apply(a, b);
    }
}

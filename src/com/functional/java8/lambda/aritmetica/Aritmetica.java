package com.functional.java8.lambda.aritmetica;

//Esta anotación es meramente semántica, no aplica ninguna funcionalidad extra
@FunctionalInterface
public interface Aritmetica {
    double operacion(double a, double b);
}

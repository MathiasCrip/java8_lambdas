package com.functional.java8.lambda;

import com.functional.java8.lambda.aritmetica.Aritmetica;
import com.functional.java8.lambda.aritmetica.Calculadora;

public class EjemploInterfaceFunctional {
    public static void main(String[] args) {
//      Invocamos la interfaz Aritmética e implementamos al vuelo la operación
        Aritmetica suma = Double::sum; // (a,b) -> a + b
        Aritmetica resta = (a, b) -> a - b;


//        Se instancia la clase Calculadora
        Calculadora cal = new Calculadora();


//        Mediante la instacia de calculadora, ejecutamos el metodo computar y pasamos dos numeros + la interfaz declarada anteriormente
        System.out.println(cal.computar(10, 5, suma));
        System.out.println(cal.computar(10, 5, resta));
        System.out.println(cal.computar(10, 5, (a, b) -> a * b));
//         Podemos tambien implementarla al vuelo ☝️


        System.out.println(cal.computarConBiFunction(10, 5, Double::sum));
//   Mismo ejemplo, pero ejecutada mediante la @InterfazFunctional BiFunction☝️
    }
}

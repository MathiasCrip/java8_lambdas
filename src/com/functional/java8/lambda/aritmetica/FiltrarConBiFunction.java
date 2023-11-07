package com.functional.java8.lambda.aritmetica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FiltrarConBiFunction {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, -1, 2, -2, 5, 8, 66, 44,55, 0, -25, -73, 66, 3);

        BiFunction<List<Integer>, Predicate<Integer>, List<Integer>> filtrar;

        filtrar = (lista, predicado) -> {
            List<Integer> resultados = new ArrayList<>();
            for (Integer i : lista) {
                if (predicado.test(i)) {
                    resultados.add(i);
                }
            }
            return resultados;
        };

        System.out.println(filtrar.apply(numeros, numero -> numero % 2 == 0));

//        Consumer<Integer> consumer = s -> System.out.println(s + " ");
//        Predicate<Integer> filtro = x -> (x % 2 == 0);
//
//
//        Stream<Integer> listadoStream = numeros.stream();
//        listadoStream.filter(filtro).distinct()
//                .forEach(consumer);
    }

}

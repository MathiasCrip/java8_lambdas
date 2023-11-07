package com.functional.java8.lambda;

import com.functional.java8.lambda.models.Usuario;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {

//        Predicate es una interfaz funcional que retorna un boolean y recibe un argumento de algun tipo de objecto
//        Esta es una interfaz funcional cuyo método funcional es test(Object)
        Predicate<Integer> predicado1 = num -> num > 10;
        boolean r = predicado1.test(11);
        System.out.println("predicado1 = " + r);


        Predicate<String> predicado2 = rol -> rol.equals("ROLE_ADMIN");
        System.out.println("predicado2 = " + predicado2.test("ROLE_ADMIN"));

//        BiPredicate es una interfaz funcional que retorna un boolean y recibe dos argumento de algun tipo de objecto
//        Esta es una interfaz funcional cuyo método funcional es test(Object)
        BiPredicate<String, String> predicado3 = String::equals;// (a, b) -> a.equals(b);
        System.out.println("predicado3 = " + predicado3.test("joaquin", "joaquin"));

        BiPredicate<Integer, Integer> predicado4 = (i, j) -> j > i;
        boolean r2 = predicado4.test(5, 10);
        System.out.println("predicado4 = " + r2);

//      Creamos dos usuarios y seteamos sus nombres
        Usuario a = new Usuario();
        Usuario b = new Usuario();
        a.setNombre("maria");
        b.setNombre("cata");

//      Comparamos con equals -> recordar siempre que se compara por atributos sobreescribir el metodo equals en la clase Usuario
        BiPredicate<Usuario, Usuario> predicado5 = (ua, ub) -> ua.getNombre().equals(ub.getNombre());
        System.out.println("predicado5 = " + predicado5.test(a, b));
    }
}

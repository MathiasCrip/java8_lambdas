package com.functional.java8.lambda;

import com.functional.java8.lambda.models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploConsumer {
    public static void main(String[] args) {

//Representa una operación que acepta un único argumento de entrada y no devuelve ningún resultado.
        Consumer<Date> consumidor = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));
        };
        consumidor.accept(new Date());

//Esta interfaz representa una función que acepta dos argumentos de entrada y no devuelve ningún resultado .
        BiConsumer<String, Integer> consumidorBi = (nombre, edad) -> System.out.println(nombre + ", tiene " + edad + " años!");

        consumidorBi.accept("pepe", 20);

        Consumer<String> consumidor2 = s -> System.out.println(s); //System.out::println; <- método por referencia

        List<String> nombres = Arrays.asList("andres", "pepe", "luz", "paco");
        nombres.forEach(consumidor2);//nombres.forEach(s-> System.out.println(s));
        //se le pasa el consumidor2 como parametro al forEach

/*Representa un proveedor de resultados. Esta es una interfaz funcional cuyo método funcional es get().*/
        Supplier<Usuario> creaUsuario = Usuario::new;// ()-> new Usuario()
        Usuario usuario = creaUsuario.get();

//Representa una operación que acepta dos argumentos de entrada y no devuelve ningún resultado.
        BiConsumer<Usuario, String> asignarNombre = Usuario::setNombre;//(usu, nom) -> usu.setNombre(nom);
        asignarNombre.accept(usuario, "Gastón");
        System.out.println("Nombre usuario: " + usuario.getNombre());


        Supplier<String> proveedor = () -> "Hola mundo lambda supplier";
        System.out.println(proveedor.get());

    }
}

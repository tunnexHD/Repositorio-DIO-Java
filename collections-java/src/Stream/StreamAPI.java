package stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPI {

    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista de String: ");
            numerosAleatorios.forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set:");
            numerosAleatorios.stream()
                    .limit(5)
                    .collect(Collectors.toSet())
                    .forEach(System.out::println);

            Set<String> numerosAleatorios5Primeiros = numerosAleatorios.stream()
                    .limit(5)
                    .collect(Collectors.toSet());
            System.out.println(numerosAleatorios5Primeiros);

        System.out.println("Transforme esta lista de String em uma lista de números inteiros.");
            List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt).collect(Collectors.toList());
                

        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista: ");
            numerosAleatorios.stream().map(Integer::parseInt).filter(i -> i % 2 == 0 && i > 2)
            .collect(Collectors.toList()).forEach(System.out::println);
        
        System.out.print("Pegue os números pares e maiores que 2 e coloque em uma lista: ");
            List<Integer> listParesMaioresQue2 = numerosAleatorios.stream().map(Integer::parseInt)
                .filter(i -> (i % 2 == 0 && i > 2)).collect(Collectors.toList());

                System.out.println(listParesMaioresQue2);

        System.out.print("Mostre a média dos números: ");
            numerosAleatorios.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out::println);

        System.out.print("Remova os valores ímpares: ");
            numerosAleatoriosInteger.removeIf(i -> (i % 2 != 0));
            System.out.println(numerosAleatoriosInteger);

    }
}
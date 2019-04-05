package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class RetornaArrayDePares {
    public static void main(String[] args) {
        Integer[] arrayNumeros = {24,65,2,40};

        System.out.println(somaNumeros(arrayNumeros));
    }
    private static List<Integer> somaNumeros(Integer[] arrayNumeros){
        List<Integer> arrayPares = new ArrayList<>();
        for(int i=0;i<arrayNumeros.length;i++){
            if (arrayNumeros[i] % 2 == 0) {
                arrayPares.add(arrayNumeros[i]);
            }
        }
        return arrayPares;
    }
}

package br.com.digitalhouse;

public class Exercicio4 {
    public static void main(String[] args) {
        Integer[] arrayNumeros = {23,65,2,82};

        System.out.println(somaNumeros(arrayNumeros));
    }
    public static Integer somaNumeros(Integer[] arrayNumeros){
        Integer soma = 0;
        for (int i=0;i<arrayNumeros.length;i++){
            soma = soma + arrayNumeros[i];
        }
        return soma;
    }
}

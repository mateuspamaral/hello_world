package br.com.digitalhouse;

public class MaiorDeTresNumeros {
    public static void main(String[] args) {
        System.out.println(maiorDeTresNumeros(33,-2,10));
    }
    private static Integer maiorDeTresNumeros(Integer umNumeroA, Integer umNumeroB, Integer umNumeroC) {
        Integer maior = 0;
        if (maior < umNumeroA){
            maior = umNumeroA;
        }
        if (maior < umNumeroB){
            maior = umNumeroB;
        }
        if (maior < umNumeroC) {
            maior = umNumeroC;
        }
        return maior;
    }
}

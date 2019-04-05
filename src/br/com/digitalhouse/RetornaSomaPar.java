package br.com.digitalhouse;

public class RetornaSomaPar {
    public static void main(String[] args) {
        Integer[] arrayNumeros = {24,65,2,35};

        System.out.println(somaNumeros(arrayNumeros));
    }
    private static Integer somaNumeros(Integer[] arrayNumeros){
        Integer soma = 0;
        for(int i=0;i<arrayNumeros.length;i++){
            if (arrayNumeros[i] % 2 == 0) {
                soma = soma + arrayNumeros[i];
            }
        }
        return soma;
    }
}

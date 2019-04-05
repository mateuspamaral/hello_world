package br.com.digitalhouse;

public class NumeroEPar {
    public static void main(String[] args) {
        System.out.println(par(5));
    }
    private static Boolean par(Integer umNumero) {
        return umNumero%2==0;
    }
}

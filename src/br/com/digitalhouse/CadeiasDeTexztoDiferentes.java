package br.com.digitalhouse;

public class CadeiasDeTexztoDiferentes {
    public static void main(String[] args) {
        System.out.println(cadeiasDeTextoDiferentes("qualquer coisa","qualquer coisa"));
    }

    private static Boolean cadeiasDeTextoDiferentes(String umTextoA, String umTextoB) {
        return umTextoA != umTextoB;
    }
}

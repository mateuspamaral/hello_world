package br.com.digitalhouse;

public class AlgumMaior {

    public static void main(String[] args) {
        System.out.println(algumMaior(1,20,6,8));
    }

    private static Boolean algumMaior(Integer umNumeroA, Integer umNumeroB, Integer umNumeroC, Integer umNumeroD) {
        Boolean numeroAMaior;
        Boolean numeroBMaior;

        if (umNumeroA > umNumeroC && umNumeroA > umNumeroD) {
            numeroAMaior = true;
        } else {
            numeroAMaior = false;
        }

        if (umNumeroB > umNumeroC && umNumeroB > umNumeroD) {
            numeroBMaior = true;
        } else {
            numeroBMaior = false;
        }

        return numeroAMaior && numeroBMaior;
    }

}

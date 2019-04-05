package br.com.digitalhouse;

public class Exercicio3 {
    public static boolean analisaNumInt(Integer num){
        return (num%2!=0) && (num>10);
    }

    public static void main(String[] args) {
        System.out.println(analisaNumInt(15));
    }
}

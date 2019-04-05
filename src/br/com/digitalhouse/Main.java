package br.com.digitalhouse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Integer umNumeroA;
        Double umNumeroB;
        String umaCadeiaDeTexto;

        umNumeroA = 10;
        umNumeroB = 20.0d;
        umaCadeiaDeTexto = "Cadeia de Texto do Mateus, por falta de criatividade no momento";

        System.out.println(umNumeroA);
        System.out.println(umNumeroB);
        System.out.println(umaCadeiaDeTexto);

        System.out.println("Soma de A + B = " + (umNumeroA + umNumeroB));
        System.out.println("Subtração de A - B = " + (umNumeroA - umNumeroB));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        umNumeroA = scanner.nextInt();

        System.out.println("Recebi " + umNumeroA);
    }
}
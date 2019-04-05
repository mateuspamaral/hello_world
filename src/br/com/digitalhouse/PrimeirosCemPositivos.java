package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class PrimeirosCemPositivos {
    public static void main(String[] args) {
        System.out.println(listaDePrimeirosCemPositivos());
    }

    private static List<Integer> listaDePrimeirosCemPositivos() {
        List<Integer> cemPrimeiros = new ArrayList<>();

        for(int i=1;i<=100;i++){
            cemPrimeiros.add(i);
        }

        return cemPrimeiros;
    }
}

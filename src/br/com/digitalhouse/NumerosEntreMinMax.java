package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class NumerosEntreMinMax {
    public static void main(String[] args) {
        System.out.println(listaDeNumerosEntre(4,90));
    }

    private static List<Integer> listaDeNumerosEntre(Integer min, Integer max) {
        List<Integer> numerosEntreMinMax = new ArrayList<>();

        for (int i=min+1;i<max;i++){
            numerosEntreMinMax.add(i);
        }

        return numerosEntreMinMax;
    }
}

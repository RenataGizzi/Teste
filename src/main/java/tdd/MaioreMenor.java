package tdd;

import java.util.Arrays;

public class MaioreMenor {
    public double verificarMaior(double vet[]) {
        double maior = 0;   
        Arrays.sort(vet); 
        for (int i = 0; i < vet.length; i++) {
            if ( vet[i] > maior ) {
            maior = vet[i];
            }
        }
        return maior;
    }
    
    public double verificarMenor(double vet[]) {
        double menor = Double.MAX_VALUE;;   
        Arrays.sort(vet); 
        for (int i = 0; i < vet.length; i++) {
            if ( vet[i] < menor ) {
            menor = vet[i];
            }
        }
        return menor;
    }
}
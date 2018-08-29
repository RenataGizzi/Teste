package tdd;

import java.util.Arrays;

public class Media {
    int i;
    double res = 0;
    
    public double calcularMedia(double vet[]) {
        double soma=0;
        
            if(vet.length <= 0) {
                return 0;
            }
            for (i = 0; i < vet.length; i++) {
            soma = vet[i] + soma;
        }
            double resultado = soma/vet.length;
            return resultado;
    }
}

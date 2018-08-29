package tdd;

import java.util.Arrays;

public class Media {

    int i;

    public double calcularMedia(double vet[]) {
        double soma = 0;

        if (vet.length <= 0) {
            return 0;
        }
        for (i = 0; i < vet.length; i++) {
            soma = vet[i] + soma;
        }
        double resultado = soma / vet.length;
        return resultado;
    }

    public double verificarMaior(double vet[]) {
        double maior = 0;
        Arrays.sort(vet);
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] > maior) {
                maior = vet[i];
            }
        }
        return maior;
    }

    public double verificarMenor(double vet[]) {
        double menor = Double.MAX_VALUE;;
        Arrays.sort(vet);
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] < menor) {
                menor = vet[i];
            }
        }
        return menor;
    }
}
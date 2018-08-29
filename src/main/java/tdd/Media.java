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

        if (vet.length <= 0) {
            return 0;
        }
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] > maior) {
                maior = vet[i];
            }
        }
        return maior;
    }

    public double verificarMenor(double vet[]) {
        double menor = Double.MAX_VALUE;;

        if (vet.length <= 0) {
            return 0;
        }
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] < menor) {
                menor = vet[i];
            }
        }
        return menor;
    }

    public double verificarAcimaMedia(double vet[]) {
        double maior = calcularMedia(vet);
        double total = 0;

        if (vet.length <= 0) {
            return 0;
        }
        for (int i = 0; i < vet.length; i++) {
            if (maior < vet[i]) {
                total = total + 1;
            }
        }
        return total;
    }

    public double verificarAbaixoMedia(double vet[]) {
        double menor = calcularMedia(vet);
        double total = 0;

        if (vet.length <= 0) {
            return 0;
        }
        for (int i = 0; i < vet.length; i++) {
            if (menor > vet[i]) {
                total = total + 1;
            }
        }
        return total;
    }
}

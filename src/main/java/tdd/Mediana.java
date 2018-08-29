package tdd;

import java.util.Arrays;

public class Mediana {
    int i;
    double res = 0;
    
    public double calcularMediana(double vet[]) {
            Arrays.sort(vet); //ordenar
            if(vet.length <= 0) {
                return 0;
            }
            int tipo = vet.length % 2;
            if (tipo == 1) {
                  return vet[((vet.length + 1) / 2) - 1];
            } else {
                  int m = vet.length / 2;
                  return (vet[m - 1] + vet[m]) / 2;
            }
    }
}
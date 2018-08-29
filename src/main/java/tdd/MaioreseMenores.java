package tdd;

import java.util.Arrays;

public class MaioreseMenores {
    public double[] verificarNMaiores(double[] vet, int n) {
        double[] maiores = new double[n];
        Arrays.sort(vet); 
        int j = 0;
        for (int i = (vet.length -1 ) ; n > 0; n--) {
            
            maiores[j] = vet[i];
            i--;
            j++;
        }
       
        return maiores;
    }
    
   public double[] verificarNMenores(double[] vet, int n) {
        double[] menores = new double[n];

        for (int i = 0; n > 0; n--) {
            menores[i] = vet[i];
            i++;
        }
        Arrays.sort(menores);
        return menores;
    }
}
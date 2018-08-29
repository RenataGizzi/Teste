/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

/**
 *
 * @author renat
 */
public class DesvioPadrao {

    public double calcularDesvioPadrao(double vet[]) {
        if (vet.length <= 0) {
            return 0;
        } else {
            Media media = new Media();
            double mediaaritmetica = media.calcularMedia(vet);
            double soma = 0l;
            for (int i = 0; i < vet.length; i++) {
                double resultado = vet[i] - mediaaritmetica;
                soma = soma + resultado * resultado;
            }
            double calculo = Math.sqrt(((double) 1 / (vet.length - 1)) * soma);
            return calculo;
        }
    }
}

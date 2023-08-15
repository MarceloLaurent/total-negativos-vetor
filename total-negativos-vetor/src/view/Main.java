package view;

import controller.TotalNegativosController;

public class Main {
    public static void main(String[] args) {

        int []vetor = {-2, 3, 0, 7, -5, 13, -7};
        int tamanhoVetor = vetor.length;

        TotalNegativosController tn = new TotalNegativosController();

        int resultado = tn.totalNegativosVetor(vetor, tamanhoVetor);

        System.out.println(resultado);
    }
}
//Exercicio4
package controller;

public class TotalNegativosController {

    public TotalNegativosController() {
        super();
    }

    public int totalNegativosVetor(int []vetor, int tamanhoVetor){
        if(tamanhoVetor == 1){
            return vetor[0] < 0 ? 1 : 0; //Condição de parada: ter um vetor com tamanho 1
        } else {
            return vetor[tamanhoVetor - 1] < 0 ? 1 + totalNegativosVetor(vetor, tamanhoVetor - 1)
                                                   : totalNegativosVetor(vetor, tamanhoVetor - 1);
        } //Chamada da função: testar o índice da última posição do vetor e retornar o resultado da condicional ternária
          //na qual há uma nova chamada da função desconsiderando o índice já testado.
    }
}

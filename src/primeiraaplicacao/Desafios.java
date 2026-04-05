package primeiraaplicacao;

public class Desafios {

    public static void main(String[] args) {
    //1.Crie um programa que realize a média de duas notas decimais e exiba o resultado.
    double nota1 = 1.3;
    double nota2 = 5.3;

    double media = (nota1 + nota2) / 2;
    System.out.println("Exercício 1: " + media);

    //2.Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.
    double tipoDouble = 6.878;
    int tipoInt = 10; 
    System.out.println("Exercício 2: " + (int)tipoDouble + tipoInt);

    //3.Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). 
    // Atribua valores a essas variáveis e concatene-as em uma mensagem.

    char letra = 'B';
    String palavra = "escrito";
    System.out.println("Exercício 3: Variável de letra: " + letra + " Variável de palavra: " + palavra);

    //4. Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). 
    // Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.

    double precoProduto = 4.79;
    int quantidade = 6;
    int resultado = (int) (precoProduto * quantidade);
    System.out.println("Exercício 4: Preço do produto multiplicado pela quantidade de produto: " + resultado);

//5.Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é 
// equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.

    double valorEmDolares = 75.350000;
    double conversao =  valorEmDolares * 4.94;
    System.out.println("Exercício 5: " + valorEmDolares + " dólares" + " é equivalente a " + conversao + " em real");

//6.Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de 
// um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto 
// (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.

        double precoOriginal = 30;
        double percentualDesconto = 0.2;
        double desconto = precoOriginal * percentualDesconto;
        double precoFinal = precoOriginal - desconto;

        System.out.println("Exercícico 6: " + "Valor do desconto: " + desconto + " Preço final: " + precoFinal);


    }
}

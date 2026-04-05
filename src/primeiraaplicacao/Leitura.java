package primeiraaplicacao;

import java.util.Scanner; // Importação para usar o Scanner


public class Leitura {

    public static void main(String[] args) {
    	
    	Scanner leitura = new Scanner(System.in); //System.in, standard input stream (usually the keyboard).
    	System.out.println("Digite seu filme favorito:");
    	String filme = leitura.nextLine(); //nextLine para ler uma linha de texto
    	System.out.println("Qual o ano de lançamento?");
    	int anoDeLancamento = leitura.nextInt(); //nextInt para ler um número inteiro
    	System.out.println("De 0 a 10, como vc avalia o filme?");
    	double avaliacao = leitura.nextDouble(); //nextDouble para ler uma número decimal
    	
    	System.out.println(filme);
    	System.out.println(anoDeLancamento);
    	System.out.println(avaliacao);
    }
}

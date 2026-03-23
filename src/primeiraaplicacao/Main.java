package primeiraaplicacao;

public class Main {

	public static void main(String[] args) {
		System.out.println("Esse é o Screen Match");
		System.out.println("Filme: Top Gun: Maverick");
		
		// Declarando uma variável
		int anoDeLancamento = 2022;
		System.out.println("Ano de lançamento: " + anoDeLancamento);
		boolean incluidoNoPlano = false;
		double notaDoFilme = 8.1;
		
		double media = (9.8 + 6.3 + 8.0) / 3;
		System.out.println(media);
		
		String sinopse;
		sinopse = """
				Filme Top Gun
				Filme de aventura com galã dos anos 80
				Muito bom!
				Ano de lançamento
				""" + anoDeLancamento;
		System.out.println(sinopse);
		
		String nome = "João";
		int aulas = 4;
		
		String mensagem = """
		                  Olá, %s!
		                  Boas vindas ao curso de Java.
		                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
		                  """.formatted(nome, aulas);

		System.out.println(mensagem);
		
		/* esse código está errado, porque o resultado
		seria double e a classificacao está para números inteiros.*/
		int classificacao;
		// cast to(casting)
		classificacao = (int) (media / 2);
		System.out.println(classificacao);
	}

}

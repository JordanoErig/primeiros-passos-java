package primeiraaplicacao;

public class Condicional {

    public static void main(String[] args) {
        int anoDeLancamento = 1990;
        boolean incluidoNoPlano = false;
		double notaDoFilme = 8.1;
        String tipoPlano = "smart";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamentos que os clientes estão curtindo");
        } else {
            System.out.println("Filme retrô que vale apena assistir");
        }

        if (incluidoNoPlano == true || tipoPlano.equals("plus")){
            System.out.println("Filme liberado!");
        } else {
            System.out.println("Deve pagar a locação!");
        }


    } 

}

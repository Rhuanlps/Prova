import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int quantCarros;
        double notaCarro;
        double soma = 0;
        System.out.println("Informe a quantidade de carros: ");
        quantCarros = sc.nextInt();

        for (int i = 0; i < quantCarros; i++) {
            System.out.println("Informe a nota para o carro: ");
            notaCarro = sc.nextInt();
            double[] notaCarros = new double[quantCarros];
            soma += notaCarro;
        }

        double media = soma / quantCarros;
        System.out.println("A media dos carros é: " + media );


    }
}
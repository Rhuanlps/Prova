import java.util.Scanner;

public class Prova {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nVotos;
        int votos;
        String nome = "80 - Taffe";
        String nome2 = "70 - Rodrigo";
        String nome3 = "60 - Lucas";
        String nome4 = "50 - Alessandro";


        System.out.println("Informe o numero de participantes que irão votar: ");
        nVotos = sc.nextInt();
        System.out.println("Qual você deseja votar? " );
        System.out.println(nome);
        System.out.println(nome2);
        System.out.println(nome3);
        System.out.println(nome4);


    }
}

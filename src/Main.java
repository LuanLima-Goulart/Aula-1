// 1. O import deve vir ANTES da declaração da classe
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!\n"); // (Adicionei \n para quebrar a linha)

        // Suas variáveis
        int inteiro = 1;
        String uff = "quero goza";
        double milhao = 13.14;

        // 2. A lógica do ArrayList deve ficar aqui, dentro do main principal
        ArrayList<String> listaDeNomes = new ArrayList<>();

        // 3. Agora 'uff' está no mesmo escopo e pode ser adicionada
        listaDeNomes.add(uff);

        System.out.println("Lista nomes:" + listaDeNomes);

        Scanner entrada = new Scanner(System.in);

        int g;
        System.out.print("Digite um valor para 'g':");
        g= entrada.nextInt();
        System.out.println("O valor de 'g' é: " + g);
    }
}
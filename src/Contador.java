package src;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = scan.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = scan.nextInt();

        try {
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        int contagem = parametroDois - parametroUm;

        if (contagem < 0) {
            throw new ParametrosInvalidosException();
        }

        for (int i = 0; i < contagem; i++) {
            int num = i + 1;
            System.out.println("Imprimindo o número " + num + ".");
        }
    }
}
package com.dio.exercicios;

public class aula01_Loops {
    public static void main(String[] args) {

        System.out.println("De 0 até 9: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("O valor de i é: " + i);
        }

        System.out.println("De 10 até 0: ");
        for (int i = 10; i >= 0; i--) {
            System.out.println("O valor de i é: " + i);
        }

        boolean variavel = true;
        while (variavel) {
            System.out.println("Executando while uma vez...");
            variavel = false;
        }

        int tentativas = 1, limiteTentativas = 3;
        while (tentativas <= limiteTentativas) {
            System.out.println("Tentando " + tentativas + " vez(es).");
            tentativas++;
        }

        tentativas = 1;
        limiteTentativas = 3;
        do {
            System.out.println("Tentando " + tentativas + " vez(es)");
            tentativas++;
        } while (tentativas <= limiteTentativas);

        System.out.println("De 3 até 11. Opção 1.");
        for (int i = 1; i <= 11; i = i+2) {
            if (i >= 3 && i <= 11) {
                if (i != 7) {
                    System.out.println("Valor de i " + i);
                }
            }
        }

        System.out.println("De 3 até 11. Opção 2.");
        for (int i = 3; i <= 11; i = i+2) {
            if (i != 7) {
                System.out.println("Valor de i " + i);
            }
        }

        System.out.println("Texto 5 vezes. Opção 1.");
        int vez = 1;
        while(vez <= 5) {
            System.out.println("Exibindo o texto a " + vez + "ª vez.");
            vez++;
        }

        System.out.println("Texto 5 vezes. Opção 2.");
        vez = 1;
        boolean continuar = true;
        while(continuar) {
            System.out.println("Exibindo o texto a " + vez + "ª vez.");
            vez++;
            if (vez > 5) {
                continuar = false;
            }
        }
    }
}

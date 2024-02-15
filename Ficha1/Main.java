package Ficha1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um ano (1900-2100): ");
        int ano = scanner.nextInt();
        while (ano < 1900 || ano > 2100) {
            System.out.print("Insira um ano válido: ");
            ano = scanner.nextInt();
        }

        System.out.print("Insira um mes (1-12): ");
        int mes = scanner.nextInt();
        while (mes < 1 || mes > 12) {
            System.out.print("Insira um mês válido: ");
            mes = scanner.nextInt();
        }

        System.out.print("Insira um dia (1-31): ");
        int dia = scanner.nextInt();
        while (dia < 1 || dia > diasPorMes[mes - 1]) {
            System.out.print("Insira um dia válido: ");
            dia = scanner.nextInt();
        }

        int numeroDeDias = (ano - 1900) * 365 + (ano - 1900) / 4;
        if (ano % 4 == 0 && (mes == 1 || mes == 2)) {
            numeroDeDias--;
        }

        for (int i = 0; i < mes - 1; i++) {
            numeroDeDias += diasPorMes[i];
        }

        numeroDeDias += dia;

        int diaDaSemana = numeroDeDias % 7;

        switch (diaDaSemana) {
            case 0:
                System.out.println("Domingo");
                break;
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
        }
    }
}

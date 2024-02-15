package Ficha1;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Scanner;

public class TestePrograma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ficha1 f = new Ficha1();

        System.out.print("Insira uma temperatura em ºC: ");
        double temperaturaEmCelsius = scanner.nextDouble();
        double temperaturaEmFarenheit = f.celsiusParaFarenheit(temperaturaEmCelsius);
        System.out.println(temperaturaEmFarenheit + "ºF");

        System.out.print("Insira um valor: ");
        int valor1 = scanner.nextInt();
        System.out.print("Insira outro valor: ");
        int valor2 = scanner.nextInt();
        int maior = f.maximoNumeros(valor1,valor2);
        System.out.println("O maior valor é: " + maior);

        System.out.print("Insira o seu nome: ");
        String nome = scanner.next();
        System.out.print("Insira o seu saldo: ");
        float saldo = scanner.nextFloat();
        String resposta = f.criaDescricaoConta(nome, saldo);
        System.out.println(resposta);

        System.out.print("Insira o montante em € a converter: ");
        double montante = scanner.nextDouble();
        System.out.print("Insira uma taxa de conversão: ");
        double taxac = scanner.nextDouble();
        double convertido = f.eurosParaLibras(montante,taxac);
        System.out.println(convertido + "£");

        System.out.print("Insira um valor: ");
        valor1 = scanner.nextInt();
        System.out.print("Insira outro valor: ");
        valor2 = scanner.nextInt();
        resposta = f.descrescente(valor1, valor2);
        System.out.println(resposta);

        int num = Integer.parseInt(args[0]);
        BigInteger factorial = f.factorial(num);
        System.out.println(factorial);

        System.out.println ("Temp de execução para o fatorial de 5000: " + f.tempoGasto() + "ms");
    }
}

package Ficha1;

import java.time.Duration;
import java.time.Instant;
import java.math.BigInteger;

public class Ficha1 {
    // Exercício 1
    public double celsiusParaFarenheit(double graus) {
        return graus * 1.8 + 32;
    }

    // Exercicio 2
    public int maximoNumeros(int a, int b) {
        return Math.max(a, b);
    }

    // Exercicio 3
    public String criaDescricaoConta(String nome, double saldo) {
        return "Estimado/a cliente " + nome + ", até à data tem um saldo disponível de: " + saldo + "€";
    }

    // Exercicio 4
    public double eurosParaLibras(double valor, double taxaConversao) {
        return valor * taxaConversao;
    }

    // Exercicio 5
    public String descrescente(int a, int b) {
        if (a > b) {
            return a +", " + b + "\nMédia: " + (a + b) / 2.0;
        } else {
            return b +", " + a + "\nMédia: " + (a + b) / 2.0;
        }
    }

    // Exercicio 6
    public BigInteger factorial(int num) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }


    // Exercicio 7
    public long tempoGasto() {
        Instant antes = Instant.now();
        factorial(5000);
        Instant depois = Instant.now();
        return Duration.between(antes, depois).toMillis();
    }
}

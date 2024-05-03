package ParametroExecao;

import java.util.Scanner;

public class ParametrosExcessao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoAtual = scanner.nextDouble();
        double valorDeposito = scanner.nextDouble();
        double valorRetirada = scanner.nextDouble();
        
        
       double SaldoFinal = saldoAtual + valorDeposito - valorRetirada;

       if (valorRetirada > SaldoFinal){
           System.out.println("Saldo insuficiente");
       }


        System.out.println("Saldo atualizado na conta: " + SaldoFinal);
    }
}

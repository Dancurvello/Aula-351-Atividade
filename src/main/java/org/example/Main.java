package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int nomeVariavel;

        String nomeString = "Soul ON";

        int numeroInteiro = 10;
        double numeroDecimal = 2.5;
        boolean status = true;

        int numeroUsuario;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um numero");
        numeroUsuario = leitura.nextInt();
        System.out.println("Vc digitou o numero: " + numeroUsuario);

        String nomeSobrenome;
        Scanner resposta = new Scanner(System.in);
        System.out.println("Digite seu nome e sobrenome");
        nomeSobrenome = resposta.next();
        System.out.println("Seu nome completo é: " + nomeSobrenome );


    }
}
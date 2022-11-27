/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.inversorletras;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author 55649
 */
public class InversorLetras {

    public static void main(String[] args) {

        Stack<Character> letras = new Stack<>();
        Stack<String> palavras = new Stack<>();

        String texto;
        try (
            Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite a palavra que terá a ordem das letras invertidas: ");
            texto = scanner.nextLine();
        }

        for (int i = 0; i < texto.length(); i++) {
            letras.push(texto.charAt(i));
        }

        
        String palavra = "";
        while (!letras.isEmpty()) {
            Character letra = letras.pop();
            if (letra == ' ') {
                if (palavra.length() > 0) {
                    palavras.push(palavra);
                    palavra = "";
                }
            } else {
                palavra += letra;
            }
        }

        if (palavra.length() > 0) {
            palavras.push(palavra);
        }
        System.out.println();


        while (!palavras.isEmpty()) {
            System.out.print(palavras.pop() + " ");
        }
       System.out.println();

    }
}

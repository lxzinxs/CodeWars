package kyu8;

import java.util.Scanner;

//CodeWars
class Kata {
    public static String solution(String str) {
        String reversed = "";
        for (int i = 0; i < str.length(); i++) {
            reversed = str.charAt(i) + reversed;
        }
        return reversed;
    }
}

//IDE
public class Reversed_Strings {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite sua palavra: ");
        String palavra = teclado.nextLine();

        String reverso = "";

        for (int i = 0; i < palavra.length(); i++) {
            reverso = palavra.charAt(i) + reverso;
        }
        System.out.println("Sua palavra: " + reverso);
    }
}
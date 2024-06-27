package fr.hetic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Entrez un nombre à convertir en chiffres romains (ou tapez 'exit' pour quitter) : ");
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                String roman = RomanNumerals.toRoman(number);
                System.out.println("Résultat : " + roman);
            } catch (NumberFormatException e) {
                System.out.println("Erreur : veuillez entrer un nombre valide.");
            } catch (IllegalArgumentException e) {
                System.out.println("Erreur : " + e.getMessage());
            }
        }
        scanner.close();
    }
}

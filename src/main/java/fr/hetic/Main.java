package fr.hetic;

import java.util.Scanner;

public class Main {

    private static final String EXIT_COMMAND = "exit";
    private static final String PROMPT_MESSAGE = "Entrez un nombre à convertir en chiffres romains (ou tapez 'exit' pour quitter) : ";
    private static final String ERROR_INVALID_NUMBER = "Erreur : veuillez entrer un nombre valide.";
    private static final String RESULT_PREFIX = "Résultat : ";

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println(PROMPT_MESSAGE);
                String input = scanner.nextLine().trim();

                if (input.equalsIgnoreCase(EXIT_COMMAND)) {
                    break;
                }

                processInput(input);
            }
        }
    }

    private static void processInput(String input) {
        try {
            int number = Integer.parseInt(input);
            String roman = RomanNumerals.toRoman(number);
            System.out.println(RESULT_PREFIX + roman);
        } catch (NumberFormatException e) {
            System.out.println(ERROR_INVALID_NUMBER);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}

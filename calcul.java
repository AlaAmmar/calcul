import java.util.Scanner;

class Calculatrice {
    // Méthode pour l'addition
    public static double addition(double a, double b) {
        return a + b;
    }

    // Méthode pour la soustraction
    public static double soustraction(double a, double b) {
        return a - b;
    }

    // Méthode pour la multiplication
    public static double multiplication(double a, double b) {
        return a * b;
    }

    // Méthode pour la division
    public static double division(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division par zéro est impossible.");
        }
        return a / b;
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bienvenue dans la calculatrice !");
        System.out.println("Veuillez entrer une opération (+, -, *, /) :");
        String operation = scanner.nextLine();

        System.out.println("Veuillez entrer le premier nombre :");
        double nombre1 = scanner.nextDouble();

        System.out.println("Veuillez entrer le deuxième nombre :");
        double nombre2 = scanner.nextDouble();

        double resultat = 0;

        switch (operation) {
            case "+":
                resultat = Calculatrice.addition(nombre1, nombre2);
                break;
            case "-":
                resultat = Calculatrice.soustraction(nombre1, nombre2);
                break;
            case "*":
                resultat = Calculatrice.multiplication(nombre1, nombre2);
                break;
            case "/":
                try {
                    resultat = Calculatrice.division(nombre1, nombre2);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    return;
                }
                break;
            default:
                System.out.println("Opération invalide.");
                return;
        }

        System.out.println("Le résultat de l'opération est : " + resultat);
    }
}

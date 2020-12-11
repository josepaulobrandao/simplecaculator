package PasteExercice.Teste;
import PasteExercice.Calculator;
import java.util.Locale;
import java.util.Scanner;

public class teste {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Enter for numbers: ");
        System.out.println();
        System.out.println("Enter for number 1");
        calculator.num1 = scanner.nextDouble();
        System.out.println("Enter for number 2");
        calculator.num2 = scanner.nextDouble();
        System.out.println("Operations");
        System.out.println();
        System.out.println("Operation sum");
        System.out.println(calculator.Operacao(calculator.num1, calculator.num2));
        System.out.println("Operation subtration");
        System.out.println(calculator.Operacao2(calculator.num1, calculator.num2));
        System.out.println("Operation multiple");
        System.out.println(calculator.Operacao3(calculator.num1, calculator.num2));
        System.out.println("Operation Division");
        System.out.println(calculator.Operacao4(calculator.num1, calculator.num2));
        System.out.println("Operation mudule");
        System.out.println(calculator.Operacao5(calculator.num1, calculator.num2));
        System.out.println("Fim");

        scanner.close();
    }
}

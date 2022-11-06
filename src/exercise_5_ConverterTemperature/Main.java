package exercise_5_ConverterTemperature;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть темературу по Цельсію :");
        double temp=scanner.nextDouble();
        ConverterTemperature.convert(temp);

    }
}

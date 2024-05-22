import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<String> A = new ArrayList<>();
        List<String> B = new ArrayList<>();

        // b) Считывание 5 строк и сохранение их в список A
        System.out.println("Введите 5 строк для списка A:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            A.add(scanner.nextLine());
        }

        // c) Отображение списка A
        System.out.println("Список A: " + A);

        // d) Считывание еще 5 строк и сохранение их в список B
        System.out.println("Введите 5 строк для списка B:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            B.add(scanner.nextLine());
        }
    }
}

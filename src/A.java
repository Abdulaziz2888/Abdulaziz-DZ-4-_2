public class A {
    System.out.println("Список A: " + A);

    // d) Считывание еще 5 строк и сохранение их в список B
        System.out.println("Введите 5 строк для списка B:");
        for (int i = 0; i < 5; i++) {
        System.out.print("Строка " + (i + 1) + ": ");
        B.add(scanner.nextLine());
    }
}

public class B {
     System.out.println("Список B: " + B);

    // e) Объединение списков A и B в новый список C в указанном порядке
    List<String> C = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
        C.add(A.get(i));
        C.add(B.get(4 - i));
    }
}

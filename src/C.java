public class C {
      System.out.println("Список C: "+C);

    // g) Сортировка списка C по длине строк и отображение отсортированного списка
        Collections.sort(C,Comparator.comparingInt(String::length));
        System.out.println("Отсортированный список C: "+C);
      }
}

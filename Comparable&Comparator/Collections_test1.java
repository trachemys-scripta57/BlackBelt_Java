import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections_test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Zaur");
        list.add("Ivan");
        list.add("Mariya");

        System.out.println("Before sorting: ");
        System.out.println(list);
        /* ���������� �� ������������� ������� (���������������)
        * ��� � �������� �� � �� � */
        Collections.sort(list);

        System.out.println("After sorting: ");
        System.out.println(list);
    }
}

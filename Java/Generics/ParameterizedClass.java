package Generics;

public class ParameterizedClass {
    public static void main(String[] args) {
        info<String> info1 = new info<>("poops");
        System.out.println(info1);
        String s = info1.getValue();
        System.out.println(s);

        info<Integer> info2 = new info<>(18);
        System.out.println(info2);
        Integer i1 = info2.getValue();
        System.out.println(i1);
    }
}
// выводим в консоль значение value в скобках
class info <T> {
    private final T value;

    // параметризованный конструктор
    public info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{[" + value +
                "]}";
    }

    // параметризованный метод
    public T getValue() {
        return value;
    }
}

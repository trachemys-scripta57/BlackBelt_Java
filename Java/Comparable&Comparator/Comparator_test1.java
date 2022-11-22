import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator_test1 {
    public static void main(String[] args) {
        List<Employee1> list = new ArrayList<>();
        Employee1 emp1 = new Employee1(100, "Zaur", "Tregulov", 12345);
        Employee1 emp2 = new Employee1(15, "Ivan", "Petrov", 6542);
        Employee1 emp3 = new Employee1(123, "Ivan", "Sidorov", 8543);

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        System.out.println("Before sorting \n" + list);


        /* Collections.sort(list) знает как работать со String, int... Но не знает
         * по каким критериям сортировать Employee.
         * Сравниваем по id */
        Collections.sort(list, new IdComparator());
        System.out.println("After sorting \n" + list);
    }
}

class Employee1 {
        //        implements Comparable<Employee1> {
        int id;
        String name;
        String surname;
        int salary;

        public Employee1(int id, String name, String surname, int salary) {
            this.id = id;
            this.name = name;
            this.surname = surname;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee1{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", salary=" + salary +
                    '}';
        }

//    @Override
//    public int compareTo(Employee1 anotherEmp) {
////        return Integer.compare(this.id, anotherEmp.id);
////        return this.salary - anotherEmp.salary; // результат тот же
////        return this.name.compareTo(anotherEmp.name); // для String
//        int res = this.name.compareTo(anotherEmp.name);
//        if (res == 0) {
//            res = this.surname.compareTo(anotherEmp.surname);
//        }
//        return res;
//    }
}

class IdComparator implements Comparator<Employee1> {
    @Override
    public int compare(Employee1 emp1, Employee1 emp2) {
        /* в отличие от compareTo где сравнивался текущий объект и
         * объект в параметрах, compare сравнивает объекты в параметрах */
        if (emp1.id == emp2.id) {
            return 0;
        } else if (emp1.id < emp2.id) {
            return -1;
        } else {
            return 1;
        }
    }
}
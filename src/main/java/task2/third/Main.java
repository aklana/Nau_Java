package task2.third;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<Employee> workers = new ArrayList<>();

        workers.add(new Employee("Тимоти Шаламе", 18, "ИТ", 80000.0));
        workers.add(new Employee("Том Холланд", 21, "Юридический", 50000.0));
        workers.add(new Employee("Анна Каренина", 28, "Бухгалтерия", 70000.0));
        workers.add(new Employee("Дмитрий Должанский", 60, "Юридический", 90000.0));
        workers.add(new Employee("Майкл Джексон", 49, "ИТ", 120000.0));

        List<String> convertedWorkers = workers.stream().map(e -> e.getFullName() + " - " + e.getDepartment()).toList();
        System.out.println(convertedWorkers);
    }
}
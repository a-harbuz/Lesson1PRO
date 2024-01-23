package de.telran.pro009flatMap;

import lombok.Getter;

import java.lang.constant.Constable;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class go {
    public static void main(String[] args) {

    }

//    Задача 1: Напишите метод, который принимает список списков целых чисел
//    и преобразует его в один список
    public List<Integer> flattenListOfLists(List<List<Integer>> listOfLists) {
        return listOfLists.stream()
                .flatMap(Collection::stream)
                .toList();
    }


    //Задача 4: Напишите метод, который преобразует Map в список значений.
    public List<String> flattenMap(Map<String, List<String>> map) {
        return map.entrySet().stream()
                .map(el->el.getValue().toString())
                //.flatMap(el->el.getValue().stream())
                .toList();
    }

    //Задача 5: Напишите метод, который принимает список списков и фильтрует все четные числа,
    // а затем умножает их на 2.
    public List<Integer> processAndFilter(List<List<Integer>> listOfLists) {
        return listOfLists.stream()
                .flatMap(el->el.stream())
                .filter(el->el%2==0)
                .map(el->el*2)
                .toList();
    }



   // Задача 7: Напишите метод, который принимает список списков списков чисел и преобразует его в один
    //список чисел.
    public List<Integer> flattenDeepListOfLists(List<List<List<Integer>>> deepList) {
        return deepList.stream()
                .flatMap(Collection::stream)
                .flatMap(Collection::stream)
                .toList();
    }

    //Задача 8: Напишите метод, который принимает список объектов с вложенными коллекциями,
    //сортирует вложенные элементы и возвращает отсортированный список всех элементов.
    class Project {
        private String name;
        private List<String> tasksss;

    }

    public List<String> getSortedTasks(List<Project> projects) {
        return projects.stream()
                .flatMap(el->el.tasksss.stream())
                .sorted()
                .toList();
    }

    //Задача 9: Напишите метод, который преобразует карту, где ключи - это строки, а значения -
    //списки объектов, в один список уникальных строк, извлечённых из атрибутов объектов.
    class Product {
        private String category;
        private String name;
    }

    public List<String> getUniqueProductNames(Map<String, List<Product>> categoryMap) {
        return categoryMap.entrySet().stream()
                .flatMap(el->el.getValue().stream())
                .map(el->el.category+":"+el.name)
                .distinct()
                .toList();
    }

//    //Задача 10: Напишите метод, который объединяет данные из нескольких списков и
//    //преобразует их в один список, применяя к каждому элементу определённую функцию.
    public List<String> combineAndTransform(List<Integer> list1, List<Double> list2,
                                            Function<Number, String> transformer) {
        //Concat обьеденяет 2 потока в Один
        //List<Number> list1 = Stream.concat(listA.stream(), listB.stream())
        //.collect(Collectors.toList());
        return Stream.concat(list1.stream(), list2.stream())
                .map(transformer)//=>.map(y->transformer.applay(y))
                .toList();

    }


//    Задача 11: Обработка вложенных структур с условными фильтрами
//    Задание: Напишите метод, который обрабатывает вложенные структуры данных
//    (например мапы, содержащих списки), фильтрует элементы по условию и объединяет
//    их в один список.
    class Order {
        private String customerName;
        private List<Item> items;

    public String getCustomerName() {
        return customerName;
    }

    public List<Item> getItems() {
        return items;
    }
}
    class Item {
        private String name;
        private double price;
    }
    public List<Item> getItemsByCustomerName(List<Order> orders, String customerName) {
//        return orders.stream()
//                .flatMap(el-> el.items.stream())
//                .filter(el->el.name.equals(customerName))
//                .toList();
//        return orders.stream()
//                .filter(el->el.customerName.equals(customerName))
//                .flatMap(el-> el.stream())
//                .toList();
        return null;
    }



    //Задача 12: Напишите метод, который объединяет данные из вложенных коллекций разных объектов и
    // считает сумму некоторого числового атрибута.
    class Department {
        private String name;
        private List<Employee> employees;
    }

    class Employee {
        private String name;
        @Getter
        private double salary;
    }

    public double getTotalSalaryByDepartment(List<Department> departments, String departmentName) {

        return departments.stream()
                .flatMap(el->el.employees.stream())
                .mapToDouble(x->x.getSalary())
                .sum();
    }


//    //Задача 13: Напишите метод, который принимает несколько списков различных типов данных, преобразует их и
//    объединяет в один список.
    public List<String> combineAndTransformComplex(List<Integer> integers, List<String> strings, List<Double> doubles) {
        //integers.get(0).toString()
//        return integers.stream()
//                .map(el->el.toString())
//                .collect(Collectors.toList());

        List<String> str1 = Stream.concat(integers.stream().map(Object::toString),
                        doubles.stream().map(Object::toString)).toList();

        return Stream.concat(str1.stream(),
                strings.stream()).toList();
    }


//***
    //Задача 14:  Напишите метод, который обрабатывает список объектов, содержащих другие объекты с коллекциями.
    //Ваша задача - вычислить среднее значение некоторого числового поля для каждого уникального ключа.
    class Company {
        private String name;
        private List<Department> departments;
    }

//    class Department {
//        private String name;
//        private List<Employee> employees;
//    }

//    public Map<String, Double> averageSalaryByCompany(List<Company> companies) {
//    }

    //Задача 15: Напишите метод, который анализирует данные из нескольких различных коллекций,
    //соединяет их и выводит результаты, соответствующие определённым критериям.
//    class Product {
//        private String category;
//        private double price;
//    }
//
//    class Order {
//        private String customerName;
//        private List<Product> products;
//    }

//    public Map<String, List<String>> highValueProductsByCustomer(List<Order> orders, double threshold) {
//    }



//    !!!!!
//    Задача 16:
//    Каждая школа содержит информацию о своих классах и студентах в этих классах.
//    Задача состоит в том, чтобы вычислить средний балл по каждому предмету среди студентов,
//    чей средний балл по всем предметам выше определённого порога (например, 8.0 из 10).
    class School {
        private String name;
        private Map<String, List<Student>> studentsByClass; //Ключ - название класса
    }

    class Student {
        private String name;
        private List<Subject> subjects;
    }

    class Subject {
        private String name;
        private double score;
    }

//    public Map<String, Map<String, Double>> averageScoreBySubjectForTopStudents(List<School> schools) {
//    }

} // END go

//=================================================
//=================================================
//=================================================
//=================================================


//Задача 2: Напишите метод, который преобразует список объектов с вложенными списками в
// один список всех вложенных элементов.
class User {
    private String name;
    private List<String> skills;

    public List<String> getAllElem(List<User> users){
        return users.stream()
                .flatMap(el->el.skills.stream())
                .toList();
    }
}

//    Задача 3: Напишите метод, который объединяет строки из списка объектов.
class Book {
    private String title;
    private List<String> authors;
    public List<String> getAuthorsTitles(List<Book> books) {
        return null;
    }

}

//    Задача 6: Преобразование и фильтрация объектов в списках
//    Задание: Напишите метод, который фильтрует список объектов по некоторому условию,
//    а затем извлекает и объединяет определённые атрибуты этих объектов в один список.
class Employee {
    private String department;
    private List<String> languages;
    public List<String> getLanguagesFromDepartment(List<Employee> employees, String department) {
        return employees.stream()
                //.flatMap(Collection::stream)
                .filter(el->el.department.equals(department))
                .flatMap(el->el.languages.stream())
                .toList();
    }
}

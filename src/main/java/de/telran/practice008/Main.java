package de.telran.practice008;

import com.github.javafaker.Faker;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;


public class Main {

    public static void main(String[] args) {
        //Faker FAKER = new Faker();
        //List<Employee> employee = List.of(...)
        List<Employee> employee = Arrays.asList(
                new Employee("Anna", "Manager", "Sales", 1500),
                new Employee("Iren", "Manager", "IT", 2350),
                new Employee("Maria", "Director", "Sales", 10467),
                new Employee("Paul", "Programmer", "IT", 4600),
                new Employee("Peter", "Manager", "Sales", 2050),
                new Employee("Madina", "Manager", "Finance", 3000),
                new Employee("Barb", "Manager", "Sales", 2980),
                new Employee("Anna", "HR-manager", "HR", 2800),
                new Employee("Marina", "Assistant", "HR", 1000),
                new Employee("Michael", "manager", "Marketing", 2800),
                new Employee("Johanna", "Top-manager", "Marketing", 4700)
        );

        //Вычислить среднюю зарплату всех сотрудников
        double x = employee.stream()
                .mapToDouble(key->key.getSalary())
                .average()
                .getAsDouble();
        System.out.println(x);

        Double resultDouble = employee.stream()
                .collect(averagingDouble(Employee::getSalary));
        System.out.println(resultDouble);

        //Получить список сотрудников с зп > 1000
        employee.stream()
                .filter(e -> e.getSalary()>1000)
                .forEach(System.out::println);
                //.forEach(y-> System.out.println(y.getFullName())); //!!!

        //Получить список сотрудников из отдела маркетинг и увеличить зп на 15%
        employee.stream()
                .filter(s->s.getDepartment().equals("Marketing"))
                //.map(s->s.setSalary((int) s.getSalary()*1,15))
                .forEach(s->{
                    s.setSalary((int)(s.getSalary()*1.15));
                    System.out.println(s);
                });


        //Получить сотрудника с самой низкой зп
//        employee.stream()
//                .mapToInt(Employee::getSalary)
        System.out.println("min:");
        System.out.println(employee.stream()
                .min(Comparator.comparingDouble(Employee::getSalary))
                .orElse(new Employee()));

        //6. Получить сотрудника с самой высокой зп
        System.out.println("max:");
        System.out.println(employee.stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .orElse(new Employee()));


        //7*. Получите сотрудников из всех отделов с максимальной зп
//        System.out.println(employee.stream()
//                .collect(groupingBy(Employee::getDepartment),
//                        maxBy(Comparator.comparingInt(Employee::getSalary))));


        //8*. Сгрупировать сотрудников по должности
        System.out.println("Сгрупировать сотрудников по должности:");
        System.out.println(employee.stream()
                .collect(groupingBy(Employee::getPosition)));
    }


}


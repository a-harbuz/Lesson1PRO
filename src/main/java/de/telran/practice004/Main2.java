package de.telran.practice004;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        ToDoList todolist = new ToDoList();
        todolist.taskAdd(new Task("Task1", "Meine new Task1", false));
        todolist.taskAdd(new Task("Task2", "Meine new Task2", false));
        todolist.taskAdd(new Task("Task3", "Meine new Task3", false));

        //System.out.println(todolist);
        todolist.taskShow();

        System.out.println("  ");
        todolist.taskChangeStatus("Task1");
        todolist.taskShow();
        System.out.println("  ");
        todolist.taskCompletedDelete();
        todolist.taskShow();
        System.out.println("  ");

        List<ToDoList> todolists = new ArrayList<>();//ToDoList();
        for (int i = 0; i < 3; i++) {
            ToDoList list1 = new ToDoList();
            list1.taskAdd(new Task("ToDoList"+i+" Task1", "Meine new Task21", false));
            list1.taskAdd(new Task("ToDoList"+i+" Task2", "Meine new Task22", false));
            todolists.add(list1);
            todolists.get(i).taskShow();
        }
        //new Task("ToDoList2 Task1", "Meine new Task21", false)
    }


}

    //Создайте класс ToDoList, который представляет собой список задач.
    //Каждая задача должна быть объектом класса Task, содержащим поля, такие как, название задачи,
    //описание и статус (выполнена/не выполнена). Реализуйте методы для добавления задачи, удаления задачи,
    // отметки задачи как выполненной и вывода списка задач.

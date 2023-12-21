package de.telran.practice004todolist;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<Task> tasks = new ArrayList<>();

    //public void taskAdd(ToDoList todolist, String name,
    //                    String description, boolean isMade){
    public void taskAdd(Task task){
        if (task != null && !task.getIsMade()) {
            tasks.add(task);
        }
        //new Task(name, description, getIsMade)
    }

    public void taskChangeStatus(String name){
        if (name != null) {
            for (int i = 0; i < tasks.size(); i++) {
                if (tasks.get(i).getName().equals(name)) {  //извлекли обьект и взяли его поле
                    //System.out.println(tasks.get(i).getName());
                    tasks.get(i).setIsMade(true); //извлекли обьект и установили его поле
                }
            }
        }
    }

    public void taskCompletedDelete(){
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getIsMade()){
                tasks.remove(i); // может вызвать Exception
            }
        }

    }

    public void taskShow(){
        for (Task s: tasks) {
            System.out.println(s.getName() + " , " + s.getDescription() + " , Выполнена: " + s.getIsMade());
        }
    }


}


//Создайте класс ToDoList, который представляет собой список задач.
//Каждая задача должна быть объектом класса Task, содержащим поля, такие как название задачи,
//описание и статус (выполнена/не выполнена). Реализуйте методы для добавления задачи,
// удаления задачи,
// отметки задачи как выполненной и вывода списка задач.

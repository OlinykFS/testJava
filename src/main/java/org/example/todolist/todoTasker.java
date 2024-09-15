package org.example.todolist;

import java.util.ArrayList;
import java.util.Scanner;

public class todoTasker {
    public void letsTodoTasker(){
        ArrayList<task> tasks = new ArrayList<>();
        System.out.println("Hi! its todo tasker!");
        System.out.println("Select the option");
        System.out.println("1. Add a task");
        System.out.println("2. Delete a task");
        System.out.println("3. List all tasks");
        System.out.println("4. Search a task");
        System.out.println("5. Exit");
        Scanner sc = new Scanner(System.in);
        String op = sc.nextLine();

        switch(op){
            case "1":
                System.out.println("Enter the task name");
                String taskName = sc.nextLine();
                System.out.println("Enter the task description");
                String taskDescription = sc.nextLine();
                task task = new task(taskName, taskDescription);
                tasks.add(task);
                System.out.println("add task" + taskName + "successfully");
                break;
            case "2":
                System.out.println("Select the task for delete");
                System.out.println(tasks);
                break;
            case "3":
                System.out.println("Task list");
                break;
            case "4":
                System.out.println("Enter the task name");
                break;
        }
    }
}

package org.example.todolist;

import java.util.ArrayList;
import java.util.Scanner;

public class todoTasker {
    public void letsTodoTasker(){
        ArrayList<task> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Hi! It's todo tasker!");

        while (true) {
            System.out.println("\nSelect the option:");
            System.out.println("1. Add a task");
            System.out.println("2. Delete a task");
            System.out.println("3. List all tasks");
            System.out.println("4. Search a task");
            System.out.println("5. Exit");

            String op = sc.nextLine();

            switch(op){
                case "1":

                    System.out.println("Enter the task name:");
                    String taskName = sc.nextLine();
                    System.out.println("Enter the task description:");
                    String taskDescription = sc.nextLine();
                    task task = new task(taskName, taskDescription);
                    tasks.add(task);
                    System.out.println("Task \"" + taskName + "\" added successfully.");
                    break;

                case "2":

                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to delete.");
                    } else {
                        System.out.println("Select the task number to delete:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i).getName());
                        }
                        int taskIndex = sc.nextInt() - 1;
                        sc.nextLine();
                        if (taskIndex >= 0 && taskIndex < tasks.size()) {
                            System.out.println("Task \"" + tasks.get(taskIndex).getName() + "\" deleted.");
                            tasks.remove(taskIndex);
                        } else {
                            System.out.println("Invalid task number.");
                        }
                    }
                    break;

                case "3":
                    System.out.println("Task list:");
                    if(tasks.isEmpty()){
                        System.out.println("No tasks found.");
                    } else  {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i).getName() + ": " + tasks.get(i).getDescription());
                        }
                    }
                    break;

                case "4":

                    System.out.println("Enter the task name to search:");
                    taskName = sc.nextLine();
                    boolean found = false;
                    for (task t : tasks) {
                        if (t.getName().equalsIgnoreCase(taskName)) {
                            System.out.println("Task found: " + t.getName() + ": " + t.getDescription());
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Task not found.");
                    }
                    break;

                case "5":

                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid option. Please select again.");
            }
        }
    }
}

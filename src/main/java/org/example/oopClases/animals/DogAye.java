package org.example.oopClases.animals;

import org.example.oopClases.AnimalAye;

import java.util.Scanner;

public class DogAye extends AnimalAye {
    public DogAye(String name, int age) {
        super(name, age);
    }

    public DogAye() {
        super("", 0);
    }

    public void bark() {
        System.out.println(getName() + " Gav");
        System.out.println("People are scared");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " Eat sobachi korm");
    }

    public void SozdatEblana() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Set name for your Dog:");
        String name = sc.nextLine();
        setName(name);
        System.out.println("Set age for your:" + getName());
        int age = sc.nextInt();
        setAge(age);
        System.out.println("Your Dog is " + getName() + " " + getAge() + " years old");
        System.out.println("your dog can bark on people \n type \"bark\" for scare people");
        sc.nextLine();
        String bark = sc.nextLine();
        switch (bark) {
            case "bark":
                bark();
                break;
            case "exit":
                return;
            default:
                System.out.println("Invalid bark choice");
        }
        System.out.println("Press Enter to continue");
        sc.nextLine();
        sc.nextLine();
    }
}

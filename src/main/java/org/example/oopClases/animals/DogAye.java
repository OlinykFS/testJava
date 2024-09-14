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
        System.out.println(getName() + " Gav BELA");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " Eat sobachi korm");
    }

    public void SozdatEblana() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Set name for your eblan:");
        String name = sc.nextLine();
        setName(name);
        System.out.println("Set age for your eblan:");
        int age = sc.nextInt();
        setAge(age);
        System.out.println("Your eblan is " + getName() + " " + getAge() + " years old");
        System.out.println("Press Enter to continue");
        sc.nextLine();
        sc.nextLine();
    }
}

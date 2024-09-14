package org.example.oopClases.animals;

import org.example.oopClases.AnimalAye;

public class DogAye extends AnimalAye {
    public DogAye(String name, int age) {
        super(name, age);
    }
    public void bark(){
        System.out.println(getName() + " Gav BELA");
    }
    @Override
    public void eat() {
        System.out.println(getName() + " Eat sobachi korm");
    }
}

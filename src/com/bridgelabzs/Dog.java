package com.bridgelabzs;

public class Dog {
    public String breed;
    public String colour;
    public int age;
    public Dog() {
        System.out.println(" Dog Contsructor Called");
    }
    public Dog(String breed,String colour,int age){
        this.breed = breed;
        this.colour = colour;
        this.age = age;
        System.out.println(this.breed );
        System.out.println(this.age);
        System.out.println(this.colour);
        }
    }


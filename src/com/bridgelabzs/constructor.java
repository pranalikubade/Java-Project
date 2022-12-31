package com.bridgelabzs;

public class constructor {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        System.out.println(dog1.breed); //null
        System.out.println(dog1.colour);//null
        System.out.println(dog1.age);//0
        dog1.breed="labrador";
        dog1.colour="brown";
        dog1.age=8;
        System.out.println(dog1.breed);
        System.out.println(dog1.colour);
        System.out.println(dog1.age);
        Dog dog2 = new Dog();
        System.out.println(dog2.breed);//null
        System.out.println(dog2.colour);//null
        System.out.println(dog2.age);//0
        Dog dog3 = dog1;
        System.out.println(dog3.breed);
        System.out.println(dog3.colour);
        System.out.println(dog3.age);
        Dog dog4 = dog2;
        System.out.println(dog2.breed);//null
        System.out.println(dog2.colour);//null
        System.out.println(dog2.age);//0
        Dog dog5 = new Dog("Husky", "Black",5);

    }
}

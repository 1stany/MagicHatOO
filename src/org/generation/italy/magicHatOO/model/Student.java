package org.generation.italy.magicHatOO.model;

import java.util.Random;

public class Student {
    private String name;
    private String lastname;
    private House favouriteHouse;
    private Random random;
 // private Random random = new Random();   
    
    public Student(String name, String lastname, House favouriteHouse){
        this(name, lastname);
        this.favouriteHouse = favouriteHouse;
 /*     this.name = name;
        this.lastname = lastname;
        this.favouriteHouse = favouriteHouse;
        this.random = new Random();
 */    }

    public Student(String name, String lastname){
    //   this(name, lastname, null);
         this.name = name;
         this.lastname = lastname;
         this.random = new Random();
    }

    public String getFullName() {
        return String.format("%s %s", name, lastname);
    }

    public boolean hasFavorite() {
        return favouriteHouse != null;
    }

    public boolean isLucky() {
        int result = random.nextInt(2);
        if (result == 0){
            return true;
        } else {
            return false;
        }
        
        //return random.nextInt(2) == 0;
    }

    public House getFavouriteHouse() {
        return favouriteHouse;
    }

    
}

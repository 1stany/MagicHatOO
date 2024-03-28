package org.generation.italy.magicHatOO.model;

import java.util.Random;

public class MagicHat {
    private Random random = new Random();
    //se lo studente ha una casa preferita verrà inserito con probabilità del 50% se la casa non è piena
    public House assignStudent(Student s){
        if(s.hasFavorite() && s.isLucky() && s.getFavouriteHouse().addStudent(s)){
            return s.getFavouriteHouse();
        }
        boolean assigned;
        House randomHouse;
        do{
            randomHouse = House.getRandomHouse();
            assigned = randomHouse.addStudent(s);
        }while(!assigned);
        return randomHouse;
    }

    private void announceAssignement(Student s, House randomHouse) {
        System.out.printf("%s...", s.getFullName());
        generateSuspance();
        System.out.printf("è stato inserito nella casa %s", randomHouse);
    }

    private void announceAssignement(Student s) {
        System.out.printf("%s...", s.getFullName());
        generateSuspance();
        System.out.printf("Fortunello è stato inserito nella sua casa preferita %s", s.getFavouriteHouse());
    }
    

    private void generateSuspance() {
        int millis = random.nextInt(2000, 4000);
        try {
            Thread.sleep(millis);
        } catch (Exception e) {
            //will never execute
        }
    }


    
}

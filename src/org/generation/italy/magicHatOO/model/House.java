package org.generation.italy.magicHatOO.model;

import java.util.ArrayList;
import java.util.Random;

public enum House {
    GRYFFINDOR, HUFFLEPUFF, SLYTHERIN, RAVENCLAW;

    private ArrayList<Student> members = new ArrayList<>();
    public static final int STANDARD_DIMENSION = 10;
    private int dimension = STANDARD_DIMENSION;
    private static Random random = new Random();

    /*
     * House(){
     * this.dimension = 7;
     * }
     */
    public static House getRandomHouse() {
        int pos = random.nextInt(House.values().length);
        return House.values()[pos];
    }

    // aggiungere studenti alla casa, che non arrivi alla dimensione max
    public boolean addStudent(Student s) {
        if (isFull()) {
            return false;
        }
        members.add(s);
        return true;
    }

    // () se casa è piena
    public boolean isFull() {
        return members.size() >= dimension;
    }

    public void setDimension(int d) {
        dimension = d;
    }

    public static void assignSize(int standardSize) {
        for (int i = 0; i < House.values().length; i++) {
            House h = House.values()[i];
            h.setDimension(standardSize);
        }
    }

    public Student get(int pos) {
        if (pos >= members.size()) {
            return null;
        }
        return members.get(pos);

    }

    public String getStudentName(int pos) {
        Student s = get(pos);
        return s != null ? s.getFullName() : "Nessuno Studente";
    }

}

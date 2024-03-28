package org.generation.italy.magicHatOO.model;

import java.util.ArrayList;
import java.util.Arrays;
import static org.generation.italy.magicHatOO.model.House.*;

public class HouseAssignementCerimony {
    private MagicHat hat = new MagicHat();
    private ArrayList<Student> students = new ArrayList<>(Arrays.asList(
            new Student( "Alessandro", "Rovito", GRYFFINDOR),
            new Student( "Riccardo", "Girotto", GRYFFINDOR),
            new Student( "Alessio", "Rongione", RAVENCLAW),
            new Student( "Roberto", "Pantoni"),
            new Student( "Francesco", "Aversali"),
            new Student( "Vito", "Chianese", RAVENCLAW),
            new Student( "Giulia", "Saporiti", SLYTHERIN),
            new Student( "Lorenzo", "Murra"),
            new Student( "Luca", "Mazzone", RAVENCLAW),
            new Student( "Christian", "Soru"),
            new Student( "Lorenzo", "Emiliani", GRYFFINDOR),
            new Student( "Sonia", "Mammone", HUFFLEPUFF),
            new Student( "Manuel", "Trenta", GRYFFINDOR),
            new Student( "Breno", "Scudo"),
            new Student( "Jessica", "Cardinali"),
            new Student( "Alessandra", "Bavastrelli", HUFFLEPUFF),
            new Student( "Giovanni", "Minoliti"),
            new Student( "Enrico", "Ranieri", RAVENCLAW),
            new Student( "Paolo", "Morello"),
            new Student( "Lorenzo", "Tirotta"),
            new Student( "Lorenzo", "Fioravanti", SLYTHERIN),
            new Student( "Alberto", "Pelagotti", SLYTHERIN),
            new Student( "Michele", "Coppi"),
            new Student( "Francesca", "Piccitto"),
            new Student( "Stanislao", "Tariffa", HUFFLEPUFF)
    ));

    public void start(){
        int numHouses = House.values().length;
        int numStandard = students.size()/numHouses*numHouses;
        int standardSize = students.size()/numHouses;
        House.assignSize(standardSize);
        for(int i=0; i<numStandard; i++){
            hat.assignStudent(students.get(i));
        }
    }
}

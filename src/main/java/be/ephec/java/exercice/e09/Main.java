package be.ephec.java.exercice.e09;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Animal[] testAnimaux = createTable();
        for(Animal v : testAnimaux){
            v.makeNoise();
        }
    }

    public static Animal[] createTable(){
        Animal[] animaux = new Animal[10];
        Random alea = new Random();

        for(int i = 0 ; i < animaux.length ; i++){
            if(alea.nextInt(10) < 5){
                animaux[i] = new Cat();
            }
            else animaux[i] = new Dog();
        }
        return animaux;
    }
}

package be.ephec.java.exercice.e09;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Animal[] nvtab = createTable();
        for(Animal v : nvtab){
            v.makeNoise();
        }
    }

    public static Animal[] createTable(){
        Animal[] tableauAnimal = new Animal[10];
        Random alea = new Random();

        for(int i = 0 ; i < tableauAnimal.length ; i++){
            if(alea.nextInt(10) < 5){
                tableauAnimal[i] = new Cat();
            }
            else tableauAnimal[i] = new Dog();
        }
        return tableauAnimal;
    }
}

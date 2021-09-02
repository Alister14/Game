package pl.struckture;

import java.util.Random;

public class Randomizer {

    public int getRandomMobName(int maxIndex) {//Funkcja losuje zestaw z Araylisty stringowej mobków
        int minIndex=0;
        Random random = new Random();
        return random.nextInt(maxIndex - minIndex) + minIndex;
    }
    public int getRandomHealth() {//Funkcja losuje liczbe żyć potworków
        int max=20;
        int min=15;
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
    public int getRandomMobIndex(int size) {//Funkcja losuje liczbę z opisująca pozycję danego mobka w Arrayliście
        int max=size-1;
        int min=0;
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
    public int getRandomAtackWeapon() {//Funkcja losuje liczbe żyć potworków
        int max=30;
        int min=20;
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
    public int getRandomChanceForMob() {//Funkcja liczbę która posłuży do losowania czy wyjdzie mobek czy broń
        int max=20;
        int min=1;
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
    public int getRandomChanceForWeapon() {//Funkcja liczbę która posłuży do losowania czy wyjdzie mobek czy broń
        int max=7;
        int min=1;
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
    public int getRandomMageMove() {//Funkcja liczbę która posłuży do losowania odblokowanego przycisku dla maga
        int max=7;
        int min=1;
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}
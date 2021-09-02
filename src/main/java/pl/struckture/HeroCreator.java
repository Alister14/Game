package pl.struckture;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class HeroCreator {
    public Hero createHero() {
        Knight knight = new Knight();
        Archer archer = new Archer();
        Mage mage = new Mage();
        Amazon amazon = new Amazon();
        Hero[] hero = new Hero[4];
        hero[0] = knight;
        hero[1] = amazon;
        hero[2] = mage;
        hero[3] = archer;
        return hero[2];
    }
    public ObservableList<String> createHeroList() {
        Knight knight = new Knight();
        Archer archer = new Archer();
        Mage mage = new Mage();
        Amazon amazon = new Amazon();
        Hero[] hero = new Hero[4];
        hero[0] = knight;
        hero[1] = amazon;
        hero[2] = mage;
        hero[3] = archer;
        ObservableList<String> heroes = FXCollections.observableArrayList(knight.getName(), amazon.getName(), mage.getName(), archer.getName());
        return heroes;
    }
    public Hero[] createHeroTable() {
        Knight knight = new Knight();
        Archer archer = new Archer();
        Mage mage = new Mage();
        Amazon amazon = new Amazon();
        Hero[] hero = new Hero[4];
        hero[0] = knight;
        hero[1] = amazon;
        hero[2] = mage;
        hero[3] = archer;
        return hero;

    }
}
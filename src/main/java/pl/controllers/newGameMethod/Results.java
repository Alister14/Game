package pl.controllers.newGameMethod;
import javafx.scene.control.Button;
import pl.Data.DatabaseHandling;
import pl.struckture.Hero;
import pl.utilis.DialogUtilis;

import java.sql.Date;

public class Results {
    DialogUtilis dialogUtilis=new DialogUtilis();
    Seters seters=new Seters();
    public void winner(int winnerCheck, Button[] buttons, Hero hero) {
        String name;
        String heroName = hero.getName();
        Integer points = hero.getAtack() + hero.getHealth();
        if (winnerCheck == 10) {
            System.out.println("Wygrales");
            seters.setAllButtonDisable(buttons);
            name = dialogUtilis.winnerDialog();
            DatabaseHandling.addNewRecords(name, heroName, Date.valueOf(java.time.LocalDate.now()), points);
        }
    }//Funkcja wyzwalana w momencie wygranej gry
    public void losser(boolean losserCheck, Button[] buttons) {
        if (losserCheck == true) {
            System.out.println("Przegrales");
            seters.setAllButtonDisable(buttons);
            dialogUtilis.losserDialog();
        }
    }//Funkcja wyzwalana w momencie przgranej gry
}
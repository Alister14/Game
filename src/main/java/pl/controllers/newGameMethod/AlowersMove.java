package pl.controllers.newGameMethod;
import javafx.scene.control.Button;
import pl.struckture.Hero;
import pl.struckture.Randomizer;

public class AlowersMove {
    public void moveAlloweMage(int heroPosition, Button[] buttons) {
        if (heroPosition == 5 || heroPosition == 2) {
            for (int i = 0; i < 9; i++) {
                if (heroPosition - 1 == i || heroPosition + 3 == i || heroPosition - 3 == i)
                    buttons[i].setDisable(false);
                else
                    buttons[i].setDisable(true);
            }
        }
        if (heroPosition == 6 || heroPosition == 3) {
            for (int i = 0; i < 9; i++) {
                if (heroPosition + 1 == i || heroPosition + 3 == i || heroPosition - 3 == i)
                    buttons[i].setDisable(false);
                else
                    buttons[i].setDisable(true);
            }
        }
        if (heroPosition == 0 || heroPosition == 1 || heroPosition == 4 || heroPosition == 7 || heroPosition == 8) {
            for (int i = 0; i < 9; i++) {
                if (heroPosition + 1 == i || heroPosition - 1 == i || heroPosition + 3 == i || heroPosition - 3 == i)
                    buttons[i].setDisable(false);
                else
                    buttons[i].setDisable(true);
            }
        }
        int extraMove = mageExtraMove();
        if (extraMove != heroPosition) {
            buttons[extraMove].setDisable(false);
        }

    }
    public int mageExtraMove() {
        Randomizer randomizer = new Randomizer();
        int extraMove = randomizer.getRandomMageMove();
        return extraMove;
    }
    public void moveAlloweArcher(int heroPosition, Button[] buttons) {
        if (heroPosition == 5 || heroPosition == 2) {
            for (int i = 0; i < 9; i++) {
                if (heroPosition + 1 == i || heroPosition + 2 == i || heroPosition - 2 == i || heroPosition - 4 == i || heroPosition + 4 == i || heroPosition - 5 == i || heroPosition + 5 == i || heroPosition + 6 == i)
                    buttons[i].setDisable(false);
                else
                    buttons[i].setDisable(true);
            }
        }
        if (heroPosition == 6 || heroPosition == 3) {
            for (int i = 0; i < 9; i++) {
                if (heroPosition - 1 == i || heroPosition + 2 == i || heroPosition - 2 == i || heroPosition - 4 == i || heroPosition + 4 == i || heroPosition - 5 == i || heroPosition + 5 == i || heroPosition - 6 == i)
                    buttons[i].setDisable(false);
                else
                    buttons[i].setDisable(true);
            }
        }
        if (heroPosition == 0) {
            for (int i = 0; i < 9; i++) {
                if (heroPosition + 1 == i || heroPosition + 3 == i)
                    buttons[i].setDisable(true);
                else
                    buttons[i].setDisable(false);
            }
        }
        if (heroPosition == 8) {
            for (int i = 0; i < 9; i++) {
                if (heroPosition - 1 == i || heroPosition - 3 == i)
                    buttons[i].setDisable(true);
                else
                    buttons[i].setDisable(false);
            }
        }
        if (heroPosition == 4 || heroPosition == 1 || heroPosition == 7) {
            for (int i = 0; i < 9; i++) {
                if (heroPosition - 3 == i || heroPosition - 1 == i || heroPosition + 1 == i || heroPosition + 3 == i)
                    buttons[i].setDisable(true);
                else
                    buttons[i].setDisable(false);
            }
        }

    }
    public void moveAlloweKnight(int heroPosition, Button[] buttons) {
        if (heroPosition == 5 || heroPosition == 2) {
            for (int i = 0; i < 9; i++) {
                if (heroPosition - 1 == i || heroPosition + 3 == i || heroPosition - 3 == i)
                    buttons[i].setDisable(false);
                else
                    buttons[i].setDisable(true);
            }
        }
        if (heroPosition == 6 || heroPosition == 3) {
            for (int i = 0; i < 9; i++) {
                if (heroPosition + 1 == i || heroPosition + 3 == i || heroPosition - 3 == i)
                    buttons[i].setDisable(false);
                else
                    buttons[i].setDisable(true);


            }
        }
        if (heroPosition == 0 || heroPosition == 1 || heroPosition == 4 || heroPosition == 7 || heroPosition == 8) {
            for (int i = 0; i < 9; i++) {
                if (heroPosition + 1 == i || heroPosition - 1 == i || heroPosition + 3 == i || heroPosition - 3 == i)
                    buttons[i].setDisable(false);
                else
                    buttons[i].setDisable(true);

            }
        }
    }
    public void moveAlloweAmazon(int heroPosition, Button[] buttons) {
        for (int i = 0; i < 9; i++) {
            if (heroPosition == i)
                buttons[i].setDisable(true);
            else
                buttons[i].setDisable(false);
        }
    }
    public void moveAllower(int heroPosition, Button[] buttons, Hero hero) {
        if (Integer.parseInt(hero.getId()) == 101) {
           moveAlloweAmazon(heroPosition, buttons);
        }
        if (Integer.parseInt(hero.getId()) == 103) {
            moveAlloweArcher(heroPosition, buttons);
        }
        if (Integer.parseInt(hero.getId()) == 100) {
           moveAlloweKnight(heroPosition, buttons);
        }
        if (Integer.parseInt(hero.getId()) == 102) {
           moveAlloweMage(heroPosition, buttons);
        }
    }
}
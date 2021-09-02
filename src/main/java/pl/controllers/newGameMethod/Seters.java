package pl.controllers.newGameMethod;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import pl.struckture.Hero;
import pl.struckture.Mob;
import pl.struckture.Randomizer;
import pl.struckture.Weapon;

import java.util.ArrayList;

public class Seters {
    public void setMobButton(int chooser, Button[] buttons, ArrayList<Mob> mobsWithIcon) {
        Randomizer randomizer = new Randomizer();
        int randomIndexMob = randomizer.getRandomMobIndex(mobsWithIcon.size());
        System.out.println(randomIndexMob);
        mobsWithIcon.get(chooser).setPosition(chooser);//Ustawia position danego mobka na taka jaka ma jego pozycje jego button
        buttons[chooser].setText("Name: " + mobsWithIcon.get(randomIndexMob).getName() + "\nHp: " + mobsWithIcon.get(randomIndexMob).getHealth());
        //Ustawia nazwe dla buttona moba\
        buttons[chooser].setId(mobsWithIcon.get(randomIndexMob).getId());
        //Ustawia ID dla buttona moba
        Image image = new Image(getClass().getResourceAsStream
                (mobsWithIcon.get(randomIndexMob).getImagePath()), 80, 100, false, false);
        ImageView view = new ImageView(image);
        buttons[chooser].setGraphic(view);
        //Ustawia grafike buttona
    }//Funkcja ustawiająca przycisk Moba
    public void setHeroButton(int chooser, Button[] buttons, Hero hero,ImageView heroImage) {
        for (int i = 0; i < 9; i++) {
            if (i == chooser) {
                hero.setPosition(i);//ustawiam zmeinna Position na pozycj chooser bo taki numer podany
                buttons[i].setText("Name: " + hero.getName() + "\nHp: " + hero.getHealth() + "\nAtack: " + hero.getAtack());
                //Ustawia nazwe dla buttona bohatera
                buttons[i].setId(hero.getId());
                //Ustawia ID dla buttona bohatera
                System.out.println("\nId bohatera " + buttons[i].getId() + "\n");
                //Zczytuje id Bbuttona
                Image image = new Image(getClass().getResourceAsStream
                        (hero.getImagePath()), 80, 100, false, false);
                ImageView view = new ImageView(image);
                buttons[i].setGraphic(view);
                Image image2 = new Image(getClass().getResourceAsStream
                        (hero.getImagePath()), 400, 400, false, false);
                heroImage.setImage(image2);
                //Ustawia grafike buttona
                break;
            }
        }
    }//Funkcja ustawiająca przycisk bohatera
    public void setWeaponsButton(int chooser,Button[] buttons,ArrayList<Weapon> weaponsWithIcon) {
        weaponsWithIcon.get(chooser).setPosition(chooser);//Ustawia position danej broni na taka jaka ma jego pozycje jego button
        buttons[chooser].setText("Name: " + weaponsWithIcon.get(chooser).getName() + "\nDamage: " + weaponsWithIcon.get(chooser).getDamage());
        //Ustawia nazwe dla buttona moba\
        buttons[chooser].setId(weaponsWithIcon.get(chooser).getId());
        //Ustawia ID dla buttona moba
        Image image = new Image(getClass().getResourceAsStream(weaponsWithIcon.get(chooser).getImagePath()), 80, 100, false, false);
        ImageView view = new ImageView(image);
        buttons[chooser].setGraphic(view);
        //Ustawia grafike buttona
    }//Funkcja ustawiająca przycisk Broni
    public void setMobOrWeapon(int i,Button[]buttons,ArrayList<Weapon> weaponsWithIcon,ArrayList<Mob> mobsWithIcon) {
        Randomizer randomizer = new Randomizer();
        int randomMob = randomizer.getRandomChanceForMob();
        int randomWeapon = randomizer.getRandomChanceForWeapon();
        if (randomMob <= randomWeapon) {
            setWeaponsButton(i,buttons,weaponsWithIcon);
        } else {
            setMobButton(i,buttons,mobsWithIcon);
        }
    }//Funkcja losująca czy w danym przycisku ma być Mob czy Broń
    public void setAllButtonDisable(Button[] buttons) {
        for (int i = 0; i < 9; i++) {
            buttons[i].setDisable(true);
        }
    }//Funkcja blokująca wszytkie przyciski
    public void setText(Text nameHero,Hero hero) {
        nameHero.setText("Name: " + hero.getName() + "\nHp: " + hero.getHealth() + "\nAtack: " + hero.getAtack());
    }//Funkcja ustawiająca text na dole planszy
    public void setStartMatch(Button[] buttons,Hero hero,ImageView heroImage,ArrayList<Weapon> weaponsWithIcon,ArrayList<Mob> mobsWithIcon ) {
        System.out.println("\n");
        for (int i = 0; i < 9; i++) {
            if (i == 4) {
                setHeroButton(i, buttons, hero, heroImage);
            } else {
                setMobOrWeapon(i, buttons, weaponsWithIcon, mobsWithIcon);
            }
        }
    }//Funkcja startowej ustawiająca na początku bohatera na środku planszy a mobki i bronie wokół
}
package pl.controllers.newGameMethod;
import javafx.scene.control.Button;
import pl.struckture.Hero;
import pl.struckture.Mob;
import pl.struckture.Weapon;

import java.util.ArrayList;

public class Finder {
    public int findHeroPosition(Hero hero) {
        int buttonPositionHero = 0;//Pozycja buttona pod którym szukamy bohatera
        int heroPosition = hero.getPosition();//Pozycja bohatera którego mamy
        for (int i = 0; i < 9; i++) {//pętla przelatująca po buttonach w poszukiwaniu bohatera
            buttonPositionHero = i;//Index buttona która co pętla się zmienia
            if (buttonPositionHero == heroPosition) {
                System.out.println(buttonPositionHero + "=" + heroPosition);
                //If się spełni jeśli dany button będzie miał w sobie bohatera
                //I buttonPositionHero będzie mial taki sam numer jak pozycja bohatera
                System.out.println("Znalazlem bohatera");
                break;
            }
        }
        return buttonPositionHero;
    }//Funkcja określająca pozycje przycisku BOHATERA
    public int findMobID(Button button, ArrayList<Mob> mobsWithIcon) {
        int mobID = 0;
        for (int i = 0; i < mobsWithIcon.size() - 1; i++) {//petla przelatująca po arayliscie mobów w poszukiwaniu mobka
            // o takim samym indeksie jak mobek w przycisku
            mobID = Integer.parseInt(mobsWithIcon.get(i).getId());//Ustawiam zmienna mobIDna ID mobka którego numer mam aktualnie w pętli

            if (mobID == Integer.parseInt(button.getId())) {//Jeśeli ID mobka zgra sięz ID przycisku wtedy
                //pętla robi break i mobID to ID mobka co jest w przycisku
                //if się spełni jeśli button i mobek mają to samo id
                System.out.println(mobID + "=" + Integer.parseInt(button.getId()));
                System.out.println("Znalazlem mobka jego imie to " + mobsWithIcon.get(i).getName());
                break;
            }
        }
        return mobID;
    }//Funkcja określająca ID Mobka przypisanego do przycisku
    public int findWeaponPosition(Button button,ArrayList<Weapon> weaponsWithIcon ) {
        int weaponID = 0;
        for (int i = 0; i < weaponsWithIcon.size(); i++) {//petla przelatująca po arayliscie broni w poszukiwaniu broni
            // o takim samym indeksie jak broń w przycisku
            weaponID = Integer.parseInt(weaponsWithIcon.get(i).getId());//Ustawiam zmienna mobIDna ID mobka którego numer mam aktualnie w pętli

            if (weaponID == Integer.parseInt(button.getId())) {//Jeśeli ID broni zgra sięz ID przycisku wtedy
                //pętla robi break i weaponID to ID broni co jest w przycisku
                //if się spełni jeśli button i broń mają to samo id
                System.out.println(weaponID + "=" + Integer.parseInt(button.getId()));
                System.out.println("Znalazlem broń jej nazwa  to " + weaponsWithIcon.get(i).getName());
                break;
            }
        }
        return weaponID;
    }//Funkcja określająca ID broni przypisanej do przycisku
    public int findMobInArrayList(int mobID,ArrayList<Mob> mobsWithIcon) {
        int mobSearchID;
        int mobPlaceInArrayList = 0;
        for (int i = 0; i <= mobsWithIcon.size() - 1; i++) {
            mobSearchID = Integer.parseInt(mobsWithIcon.get(i).getId());
            if (mobID == mobSearchID) {
                mobPlaceInArrayList = i;
            }
        }
        return mobPlaceInArrayList;
    }//Funkcja wyszukująca miejce Mobka na liście za pomoca jego ID
    public int findButtonPosition(Button button,Button[] buttons) {//Funkcja określająca pozycje przycisku
        int position = 0;
        for (int i = 0; i < 9; i++) {//pętla która określa w którym buttonie jesteśmy
            if (buttons[i] == button) {
                position = i;
                System.out.println("kliknales na pole numer " + position);
                break;
            }
        }
        return position;
    }//Funkcja określająca pozycje przycisku
}
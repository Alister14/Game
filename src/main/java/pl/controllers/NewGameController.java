package pl.controllers;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import pl.controllers.newGameMethod.*;
import pl.struckture.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class NewGameController implements Initializable {
    Metting metting = new Metting();
    MobCreator mobCreator = new MobCreator();
    HeroCreator heroCreator = new HeroCreator();
    WeaponCreator weaponCreator = new WeaponCreator();
    ArrayList<Weapon> weaponsWithIcon = weaponCreator.createWepon();
    Hero hero = heroCreator.createHero();
    ArrayList<Mob> mobsWithIcon = mobCreator.createMob();
    Finder finder=new Finder();
    AlowersMove alowersMove=new AlowersMove();
    Seters seters=new Seters();
    Results results=new Results();
    @FXML
    private Button Button00;
    @FXML
    private Button Button10;
    @FXML
    private Button Button20;
    @FXML
    private Button Button01;
    @FXML
    private Button Button11;
    @FXML
    private Button Button21;
    @FXML
    private Button Button02;
    @FXML
    private Button Button12;
    @FXML
    private Button Button22;
    @FXML
    private Text nameHero;
    @FXML
    private ImageView heroImage;
    int winnerCheck = 0;
    boolean losserCheck = false;
    @FXML
    void Fight00() {
        buttonClicker(Button00);
    }
    @FXML
    void Fight10() {
        buttonClicker(Button10);
    }
    @FXML
    void Fight20() {
        buttonClicker(Button20);
    }
    @FXML
    void Fight01() {
        buttonClicker(Button01);
    }
    @FXML
    void Fight11() {
        buttonClicker(Button11);
    }
    @FXML
    void Fight21() {
        buttonClicker(Button21);
    }
    @FXML
    void Fight02() {
        buttonClicker(Button02);
    }
    @FXML
    void Fight12() {
        buttonClicker(Button12);
    }
    @FXML
    void Fight22() {
        buttonClicker(Button22);
    }
    public void initialize(URL url, ResourceBundle resourceBundle) {
        HeroChooserController heroChooserController=new HeroChooserController();
        //hero=heroChooserController.grabHero();
        seters.setStartMatch(createButtonsGroup(), hero, heroImage, weaponsWithIcon, mobsWithIcon);
        int startHeroPosition=4;
        alowersMove.moveAllower(startHeroPosition, createButtonsGroup(), hero);
        seters.setText(nameHero,hero);
        System.out.println(mobsWithIcon.size());
    }
    public void heroMeetMob(int mobID, int position, int buttonPositionHero) {
        int mobPlace = finder.findMobInArrayList(mobID,mobsWithIcon);
        if (metting.heroMettMob(mobsWithIcon.get(mobPlace), hero) == 1) {
            //Je??eli bohater pokona potworka to:
            seters.setHeroButton(position, createButtonsGroup(), hero, heroImage);
            deleteMobFromArraylist(mobPlace);//Potworekzostanie wykre??lony z listy
            if (mobsWithIcon.size() < 10)
            seters.setAllButtonDisable(createButtonsGroup());
            seters.setMobOrWeapon(buttonPositionHero, createButtonsGroup(), weaponsWithIcon, mobsWithIcon);//Na jego miejsce zostanie wylosowany nowy potworek lub bro??
            winnerCheck++;//Wska??nik zwyci??st wzro??nie o 1
        } else {//Je??eli bohater przegra
            losserCheck = true;//Zostanie wywowa??a funkcja losser i gra si?? zako??czy
        }
    }//Funkcja obs??uguj??ca spotkanie mobka z bohaterem
    public void heroMeetWeapon(int mobID, int position, int buttonPositionHero) {
        metting.heroMettWeapon(weaponsWithIcon.get(mobID - 200), hero);
        seters.setHeroButton(position, createButtonsGroup(), hero, heroImage);// Bohater zostanie przeniesiony na pozycj?? pokonanego potworka
        seters.setMobOrWeapon(buttonPositionHero, createButtonsGroup(), weaponsWithIcon, mobsWithIcon);//Na jego miejsce zostanie wylosowany nowy potworek lub bro??
    }//Funkcja opisuj??ca co si?? dziej?? jak bohater spotka bro??
    public void deleteMobFromArraylist(int mobPlaceInArrayList) {
        mobsWithIcon.remove(mobPlaceInArrayList);
    }//Funkcja kasuj??ca wybranego mobka z listy
    public void buttonClicker(Button button) {
        int position =finder.findButtonPosition(button,createButtonsGroup());
        int buttonPositionHero = finder.findHeroPosition(hero);
        if (Integer.parseInt(button.getId()) < 100) {
            int mobID = finder.findMobID(button,mobsWithIcon);
            heroMeetMob(mobID, position, buttonPositionHero);
        } else {
            int weaponID = finder.findWeaponPosition(button,weaponsWithIcon);
            heroMeetWeapon(weaponID, position, buttonPositionHero);
        }
        alowersMove.moveAllower(position, createButtonsGroup(), hero);
        seters.setText(nameHero,hero);
        results.winner(winnerCheck,createButtonsGroup(),hero);
        results.losser(losserCheck,createButtonsGroup());
    }//Funkcja obs??uguj??ca klikni??cia na przycisk
    public Button[] createButtonsGroup() {
        return new Button[]{Button00, Button10, Button20, Button01, Button11, Button21, Button02, Button12, Button22};
    }//Funkcja zbieraj??ca przyciski w jedn?? tablice
}
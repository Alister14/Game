package pl.controllers;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import pl.struckture.Hero;
import pl.struckture.HeroCreator;

import java.net.URL;
import java.util.ResourceBundle;

public class HeroChooserController implements Initializable {
    HeroCreator heroCreator = new HeroCreator();
    ObservableList<String> heroesName = heroCreator.createHeroList();
    Hero[] heroes=heroCreator.createHeroTable();
    Hero hero=new Hero();
    @FXML
    private ListView<String> heroList;
    @FXML
    private Text nameText;
    @FXML
    private Text classText;
    @FXML
    private Text hpText;
    @FXML
    private Text atackText;
    @FXML
    private Text desciptionText;
    @FXML
    private ImageView imageHero;
    @FXML
    public void confirmChooseHeroAction() {
        System.out.println(hero.getName()+" zostal");
    }
public void grabHeroName(){
    System.out.println(hero.getName());
}
    @FXML
    void test() {
        nameText.setText(heroList.getSelectionModel().getSelectedItem());
        for(int i=0;i<heroes.length;i++){
            if(heroList.getSelectionModel().getSelectedItem().equals(heroes[i].getName())){
                atackText.setText(String.valueOf(heroes[i].getAtack()));
                hpText.setText(String.valueOf(heroes[i].getHealth()));
                classText.setText(heroes[i].getClasses());
                desciptionText.setText(heroes[i].getDescitpion());
                Image image = new Image(getClass().getResourceAsStream
                        (heroes[i].getImagePath()), 400, 400, false, false);
                imageHero.setImage(image);
                hero=heroes[i];
            }
        }

    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        heroList.setItems(heroesName);
    }
}
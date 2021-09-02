package pl.controllers;

import javafx.fxml.FXML;
import pl.controllers.MainController;

public class TopMenuButtonsController {
    public static final String HERO_CHOOSER_FXML = "/fxml/HeroChooser.fxml";//Rafaktoryzacja kodu
    public static final String READ_RECORD_FXML = "/fxml/ReadRecord.fxml";//Rafaktoryzacja kodu
    public static final String NEW_GAME_FXML = "/fxml/NewGame.fxml";//Rafaktoryzacja kodu
    @FXML
    void choseHero()  {
        mainController.setCenter(HERO_CHOOSER_FXML);//Ustawia centralnie formatke Wybierz bohatera w border painie
    }
    @FXML
    void newGame()   {
        mainController.setCenter(NEW_GAME_FXML);//Ustawia centralnie formatke Wybierz bohatera w border painie
    }
    @FXML
    void readRecord()  {
        mainController.setCenter(READ_RECORD_FXML);//Ustawia centralnie formatke Wybierz bohatera w border painie
    }
    @FXML
    private MainController mainController;
    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
}
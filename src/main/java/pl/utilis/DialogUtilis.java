package pl.utilis;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextInputDialog;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Optional;

public class DialogUtilis {
    public void losserDialog() {
        Alert informationAlert = new Alert(Alert.AlertType.INFORMATION);//Tworzy okienko dialogowe
        informationAlert.setTitle("Message");//Ustawiam tytuł okna i korzystam z gotowych Stringów
        informationAlert.setHeaderText("You Die");//Ustawia głowny tekst
        informationAlert.setContentText("Hahahahahahaha");//Ustawia Tekst opisowy
        informationAlert.showAndWait();
    }
    public String winnerDialog() {
        TextInputDialog dialog = new TextInputDialog("Zgredek");
        dialog.setTitle("Message");
        dialog.setHeaderText("You Win");
        dialog.setContentText("Please enter your name:");
// Traditional way to get the response value.
        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()){
            System.out.println("Your name: " + result.get());
        }else {result= Optional.of("Niesmialek");}
return result.get();
    }
    public boolean removeRecordsDialog(){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation Dialog");
        alert.setHeaderText("Look, a Confirmation Dialog");
        alert.setContentText("Are you ok with this?");
        boolean kaboom;
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK){
            kaboom=true;
        } else {
            kaboom=false;
        }
        return kaboom;
    }
    public void dialogApplicatio() {
        Alert informationAlert = new Alert(Alert.AlertType.INFORMATION);//Tworzy okienko dialogowe
        informationAlert.setTitle("O nas");//Ustawiam tytuł okna i korzystam z gotowych Stringów
        informationAlert.setHeaderText("Twórcą tej aplikacji jest");//Ustawia głowny tekst
        informationAlert.setContentText("Patryk Zielewski");//Ustawia Tekst opisowy
        Image image = new Image(getClass().getResourceAsStream("/icons/zombi.png"), 80, 100, false, false);
        ImageView view = new ImageView(image);
        informationAlert.setGraphic(view);        informationAlert.showAndWait();
    }
    public static Optional<ButtonType> confirmationDialog() {
        Alert confirmationDialog = new Alert(Alert.AlertType.CONFIRMATION);//Tworzy okienko które będzie pytało czy
        //napewno chcesz wyjśc z aplikacji
        confirmationDialog.setTitle("EXIT");//Ustawiam tytuł okna i korzystam z gotowych Stringów
        confirmationDialog.setHeaderText("Czy napewno chcesz nas opuścić, będzie nam z tego powodu przykro");
        Optional<ButtonType> result = confirmationDialog.showAndWait();// Ta metoda pokazuję który przycisk został kliknięty
        //
        return result;
    }
}
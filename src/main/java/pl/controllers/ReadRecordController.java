package pl.controllers;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import pl.Data.DatabaseHandling;
import pl.struckture.Records;
import pl.utilis.DialogUtilis;

import java.net.URL;
import java.sql.Date;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ReadRecordController implements Initializable {
    @FXML
    private TableView<Records> recordsTableView;
    @FXML
    private TableColumn<Records, String> NameColumn;
    @FXML
    private TableColumn<Records, String> HeroColumn;
    @FXML
    private TableColumn<Records, Integer> PointsColumn;
    @FXML
    private TableColumn<Records, Date> DataColumn;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        writeRecordsTabel();
    }
    private void writeRecordsTabel() {
        ArrayList<Records> records = DatabaseHandling.readRecordsFromDatabase();
        NameColumn.setCellValueFactory(new PropertyValueFactory<Records, String>("FirstName"));
        HeroColumn.setCellValueFactory(new PropertyValueFactory<Records, String>("HeroName"));
        PointsColumn.setCellValueFactory(new PropertyValueFactory<Records, Integer>("Points"));
        DataColumn.setCellValueFactory(new PropertyValueFactory<Records, Date>("RecordData"));
        recordsTableView.getItems().setAll(records);
        PointsColumn.setSortType(TableColumn.SortType.DESCENDING);//Funkcja ustawia sortowanie kolumny Point od największego w dół
        recordsTableView.getSortOrder().add(PointsColumn);//Funkcja sortuje tablice według kolumny Points
    }
    @FXML
    void RemoweList() {
        DialogUtilis dialogUtilis=new DialogUtilis();
        boolean delete=dialogUtilis.removeRecordsDialog();
        if (delete==true){
            DatabaseHandling.deleteRecords();
        }else System.out.println("Mieczak");
        writeRecordsTabel();
    }
}
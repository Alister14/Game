package pl.Data;

import pl.struckture.Records;

import java.sql.*;
import java.util.ArrayList;

public class DatabaseHandling {
    private static final String databaseURL = "jdbc:ucanaccess://src/main/resources/database/Records.accdb";
    ArrayList<Records> records = DatabaseHandling.readRecordsFromDatabase();

    public static ArrayList<Records> readRecordsFromDatabase() {
        ArrayList<Records> records = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(databaseURL)) {
            String sql = "SELECT * FROM Records";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while (result.next()) {
                Integer id = result.getInt("RecordId");
                String name = result.getString("FirstName");
                String heroName = result.getString("HeroName");
                Date recordData = result.getDate("RecordData");
                Integer points = result.getInt("Points");
                records.add(new Records(id, name, heroName, recordData, points));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return records;
    }//Funckja zczytująca z bazy danych rekordy gry

    public static void addNewRecords(String FirstName, String HeroName, Date RecordData, int Points) {
        try (Connection connection = DriverManager.getConnection(databaseURL)) {
            String sql = "INSERT INTO Records (FirstName, HeroName,RecordData,Points) VALUES ( ?, ?, ?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, FirstName);
            preparedStatement.setString(2, HeroName);
            preparedStatement.setDate(3, RecordData);
            preparedStatement.setInt(4, Points);
            int row = preparedStatement.executeUpdate();
            if (row > 0) {
                System.out.println("A row has in Records been inserted successfully.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static void deleteRecords() {
        try (Connection con = DriverManager.getConnection(databaseURL)) {
            Statement stmt = con.createStatement();
            String query = "Truncate table Records";
            stmt.execute(query);
            System.out.println(stmt.executeUpdate(query));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
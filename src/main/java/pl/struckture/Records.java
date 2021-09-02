package pl.struckture;
import java.util.Date;

public class Records {
    protected int RecordID;
    protected String FirstName;
    protected String HeroName;
    protected Date RecordData;
    protected int Points;
    public Records(int recordID, String firstName, String heroName, Date recordData, int points) {
        RecordID = recordID;
        FirstName = firstName;
        HeroName = heroName;
        RecordData = recordData;
        Points = points;
    }
    public String getFirstName() {
        return FirstName;
    }
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }
    public String getHeroName() {
        return HeroName;
    }
    public void setHeroName(String heroName) {
        HeroName = heroName;
    }
    public int getPoints() {
        return Points;
    }
    public void setPoints(int points) {
        Points = points;
    }
    public Date getRecordData() {
        return RecordData;
    }
    public void setRecordData(Date recordData) {
        this.RecordData = recordData;
    }
    public int getRecordID() {
        return RecordID;
    }
    public void setRecordID(int recordID) {
        RecordID = recordID;
    }
    @Override
    public String toString() {
        return "Records{" +
                "FirstName='" + FirstName + '\'' +
                ", HeroName='" + HeroName + '\'' +
                ", Points=" + Points +
                ", dateRecords=" + RecordData +
                ", RecordData=" + RecordID +
                '}';
    }
}
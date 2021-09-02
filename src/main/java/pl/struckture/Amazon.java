package pl.struckture;
public class Amazon extends Hero{
    private static final String magePath = "/icons/Amazon03.png";
    public Amazon() {
        setHealth(50);
        setName("Roksi");
        setId("101");
        setPosition(1);
        setImagePath(magePath);
        setClasses("Amazonka");
        setAtack(100);
        setDescitpion("Amazonka nie ma moze za duzo zycia, ale dzieki swojej zwinnosci, jest w stanie atakowac wszytko co znajduje się na planszy, nie zwracajac uwagi na odleglosc");
    }
}
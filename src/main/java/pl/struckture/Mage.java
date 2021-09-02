package pl.struckture;
public class Mage extends Hero{
    public static final String magePath = "/icons/Mage (1).png";
    public Mage() {
        setHealth(50);
        setName("Igor");
        setId("102");
        setPosition(1);
        setClasses("Mag");
        setImagePath(magePath);
        setAtack(150);
        setDescitpion("Mag nie podsiada za duzo zycia, za to nadrabia to moca ataku,w dodatku jego magia sprawia, ze co jakis czas ma mozliwosc przezligniecia sie na pole nie dostepne w normalnym ruchu");
    }
}
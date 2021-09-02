package pl.struckture;
public class Knight extends Hero{
    public static final String knightPath = "/icons/knight.png";
    public Knight() {
        setHealth(100);
        setName("Artur");
        setId("100");
        setPosition(1);
        setImagePath(knightPath);
        setAtack(100);
        setClasses("Rycerz");
        setDescitpion("Rycerz jest posiada duze poklady zdrowia jak i ataku, niestety jego wielkosc sprawia, ze moze atakowac tylko najblizszych przeciwnikow");
    }
    @Override
    public String toString() {
        return "Knight{}"+getName()+getId();
    }
}
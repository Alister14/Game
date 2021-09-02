package pl.struckture;
public class Archer extends Hero{
    private static final String magePath = "/icons/Archer.png";
    public Archer() {
        setHealth(75);
        setName("Patryk");
        setId("103");
        setPosition(1);
        setClasses("Łócznik");
        setImagePath(magePath);
        setAtack(125);
        setDescitpion("Lucznik nie jest dobry w bliskich starciach dlatego moze atakowac tylko przeciwnikow oddalonych od niego o jedno pole lub tych na skos");
    }
}
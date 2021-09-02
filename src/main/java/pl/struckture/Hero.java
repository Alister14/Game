package pl.struckture;
public class Hero extends Creature {
    private int atack;
    private String descitpion;
    private String classes;
    public String getClasses() {
        return classes;
    }
    public void setClasses(String classes) {
        this.classes = classes;
    }
    public Hero(int health, String name, String id, int position, String imagePath, int atack) {
        super(health, name, id, position, imagePath);
        this.atack = atack;
    }

    public Hero() {
    }
    public int getAtack() {
        return atack;
    }
    public void setAtack(int atack) {
        this.atack = atack;
    }
    public String getDescitpion() {
        return descitpion;
    }
    public void setDescitpion(String descitpion) {
        this.descitpion = descitpion;
    }
    @Override    public String toString() {
        return "\n" + "Hero " + getName() + " Hp " + getHealth() + " Atack " + getAtack();
    }
}
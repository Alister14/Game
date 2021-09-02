package pl.struckture;

public class Weapon {
    private int damage;
    private String name;
    private String id;
    private int position;
    private String imagePath;
    public Weapon(int damage, String name, String id, int position, String imagePath) {
        this.damage = damage;
        this.name = name;
        this.id = id;
        this.position = position;
        this.imagePath = imagePath;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public int getPosition() {
        return position;
    }
    public void setPosition(int position) {
        this.position = position;
    }
    public String getImagePath() {
        return imagePath;
    }
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
    @Override
    public String toString() {
        return "\n"+" name="+name+
                " damage=" + damage;
    }
}
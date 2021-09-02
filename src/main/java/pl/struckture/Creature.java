package pl.struckture;
public class Creature {
    private int health;
    private String name;
    private String id;
    private int position;
    private String imagePath;
    public Creature(int health, String name, String id, int position, String imagePath) {
        this.health = health;
        this.name = name;
        this.id = id;
        this.position = position;
        this.imagePath = imagePath;
    }
    public Creature() {
    }
    public int getPosition() {
        return position;
    }
    public void setPosition(int position) {
        this.position = position;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
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
    public String getImagePath() {
        return imagePath;
    }
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
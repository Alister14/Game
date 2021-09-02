package pl.struckture;

public class Mob extends Creature {
    boolean life;
    public Mob(int health, String name, String id, int position, String imagePath, boolean life) {
        super(health, name, id, position, imagePath);
        this.life = life;
    }
    public boolean isLife() {
        return life;
    }
    public void setLife(boolean life) {
        this.life = life;
    }
    @Override
    public String toString() {
        return "\n" + getName() + " hp " + getHealth();
    }
}
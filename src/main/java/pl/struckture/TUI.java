package pl.struckture;

import java.util.ArrayList;
public class TUI {
    MobCreator mobCreator=new MobCreator();
    HeroCreator heroCreator=new HeroCreator();
    WeaponCreator weaponCreator=new WeaponCreator();
    public void startTUI() {
        Randomizer randomizer = new Randomizer();
        ArrayList<Mob> mobs = mobCreator.createMob();
        ArrayList<Weapon> weapons = weaponCreator.createWepon();
        Hero hero = heroCreator.createHero();
        Metting metting = new Metting();
        System.out.println("In this dungeon you may meet:");
        System.out.println(mobs);
        System.out.println("\n");
        int death = 0;
        for (; ; ) {
            int randomMobIndex = randomizer.getRandomMobName(mobs.size());
            if (mobs.get(randomMobIndex).getHealth() != 0) {
                System.out.println("You meet " + mobs.get(randomMobIndex));
                int gameOver = metting.heroMettMob(mobs.get(randomMobIndex), hero);
                death++;
                if (gameOver == 0) {
                    System.out.println("YOU DIE");
                    break;
                }
            }
            if (randomizer.getRandomHealth() < 10) {
                metting.heroMettWeapon(weapons.get(randomizer.getRandomMobName(weapons.size())), hero);
            }
            if (death == mobs.size()) {
                System.out.println("You Winner");
                break;
            }
        }
        System.out.println("In the end you have " + hero);
        System.out.println("Monster left in dungeon");
        for (int i = 0; i < mobs.size(); i++) {
            if (mobs.get(i).getHealth() != 0)
                System.out.println(mobs.get(i));
        }
    }
}

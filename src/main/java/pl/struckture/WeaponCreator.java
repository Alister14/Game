package pl.struckture;

import java.util.ArrayList;

public class WeaponCreator {
    public static final String bowPath = "/icons/bow.png";
    public static final String axePath = "/icons/axe.png";
    public static final String woodenClubPath = "/icons/woodenCub.png";
    public static final String knifePath = "/icons/knife.png";
    public static final String swordPath = "/icons/sword.png";
    public static final String hamerPath = "/icons/hamer.png";
    public static final String stickWithPooPath = "/icons/StickWithPoo.png";
    public static final String lancePath = "/icons/lance.png";
    int examplePosition = 1;
    public int setSizeArrayListMob() {
        int sizeArrayList = 20;
        return sizeArrayList;
    }
    public ArrayList createWepon() {
        Randomizer randomizer = new Randomizer();
        ArrayList<String> nameWeapon = new ArrayList<>();//Pierwsza Arraylista która ma baze nazw broni
        nameWeapon.add("Bow");
        nameWeapon.add("Axe");
        nameWeapon.add("Wooden Club");
        nameWeapon.add("Knife");
        nameWeapon.add("Sword");
        nameWeapon.add("Hamer");
        nameWeapon.add("Stick with poo");
        nameWeapon.add("Lance");
        ArrayList<Weapon> weapons = new ArrayList<>();//Druga Araylista która z bazy nazw broni losuje te wybrane
        for (int i = 0; i < setSizeArrayListMob(); i++) {
            weapons.add(new Weapon(randomizer.getRandomAtackWeapon(), nameWeapon.get(randomizer.getRandomMobName(nameWeapon.size())), String.valueOf(i), examplePosition, stickWithPooPath));
        }
        String iconPath = null;
        ArrayList<Weapon> weaponWithIcon = new ArrayList<>();//Ostateczna Araylista z brońmi która na
        // podstawie tego jak broń się nazywa przypisuje jej odpowiednią ikone
        for (int i = 0; i < setSizeArrayListMob(); i++) {
            if (weapons.get(i).getName().equals("Bow"))
                iconPath = bowPath;
            if (weapons.get(i).getName().equals("Axe"))
                iconPath = axePath;
            if (weapons.get(i).getName().equals("Wooden"))
                iconPath = woodenClubPath;
            if (weapons.get(i).getName().equals("Knife"))
                iconPath = knifePath;
            if (weapons.get(i).getName().equals("Sword"))
                iconPath = swordPath;
            if (weapons.get(i).getName().equals("Hamer"))
                iconPath = hamerPath;
            if (weapons.get(i).getName().equals("Stick with poo"))
                iconPath = stickWithPooPath;
            if (weapons.get(i).getName().equals("Lance"))
                iconPath = lancePath;
            weaponWithIcon.add(new Weapon(randomizer.getRandomAtackWeapon(), weapons.get(i).getName(), String.valueOf(200 + i), examplePosition, iconPath));
        }
        return weaponWithIcon;
    }
}
package pl.struckture;
import java.util.ArrayList;
public class MobCreator {
    public static final String Orcpath = "/icons/orc.png";
    public static final String Goblinpath = "/icons/goblin.png";
    public static final String Skeletonpath = "/icons/skeleton.png";
    public static final String Litchpath = "/icons/lich.png";
    public static final String Magepath = "/icons/mage.png";
    public static final String Ratpath = "/icons/rat.png";
    public static final String Batpath = "/icons/bat.png";
    public static final String zombiPath = "/icons/zombi.png";
    public static final String ghostPath = "/icons/Ghost.png";
    public int setSizeArrayListMob(){
        int sizeArrayList = 100;
        return sizeArrayList;
    }
    public ArrayList createMob() {
        boolean life = true;
        Randomizer randomizer = new Randomizer();
        ArrayList<String> nameMob = new ArrayList<>();//Najpierw Tworze arayliste z nazwami potworów
        nameMob.add("Orc");
        nameMob.add("Goblin");
        nameMob.add("Skeleton");
        nameMob.add("Litch");
        nameMob.add("Mage");
        nameMob.add("Rat");
        nameMob.add("Bat");
        nameMob.add("Zombi");
        nameMob.add("Ghost");
        String iconPath = "/icons/monkey.png";//Zmienna która ma posłużyć że jak coś pójdzie źle z obrazkami to wywali małpke
        int examplePosition = 1;
        ArrayList<Mob> mobs = new ArrayList<>();//Następnie losuje z poprzedniej listy nazwy potworów i dodaje im życie
        for (int i = 0; i < setSizeArrayListMob(); i++) {
            mobs.add(new Mob(randomizer.getRandomHealth(), nameMob.get(randomizer.getRandomMobName(nameMob.size())), "1", examplePosition, iconPath, life));
        }
        ArrayList<Mob> mobsWithIcon = new ArrayList<>();//Ostateczna Araylista z potworami która na
        // podstawie tego jak potwór się nazywa przypisuje mu odpowiednią ikone
        for (int i = 0; i < setSizeArrayListMob(); i++) {
            if (mobs.get(i).getName().equals("Orc"))
                iconPath = Orcpath;
            if (mobs.get(i).getName().equals("Goblin"))
                iconPath = Goblinpath;
            if (mobs.get(i).getName().equals("Skeleton"))
                iconPath = Skeletonpath;
            if (mobs.get(i).getName().equals("Litch"))
                iconPath = Litchpath;
            if (mobs.get(i).getName().equals("Mage"))
                iconPath = Magepath;
            if (mobs.get(i).getName().equals("Rat"))
                iconPath = Ratpath;
            if (mobs.get(i).getName().equals("Bat"))
                iconPath = Batpath;
            if (mobs.get(i).getName().equals("Zombi"))
                iconPath = zombiPath;
            if (mobs.get(i).getName().equals("Ghost"))
                iconPath = ghostPath;
            mobsWithIcon.add(new Mob(mobs.get(i).getHealth(), mobs.get(i).getName(), String.valueOf(i), examplePosition, iconPath, life));
        }
        return mobsWithIcon;
    }
}
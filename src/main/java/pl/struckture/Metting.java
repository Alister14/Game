package pl.struckture;
public class Metting {
    public int heroMettMob(Mob mob, Hero hero) {
        if (mob.getHealth() < (hero.getAtack() + hero.getHealth())) {
            if (hero.getAtack() < mob.getHealth()) {
                int handler = hero.getAtack();
                hero.setAtack(0);
                mob.setHealth(mob.getHealth() - handler);
            }
            if (mob.getHealth()<= hero.getAtack()) {
                System.out.println(" Kill " + mob.getName()+"\n");
              int handler= mob.getHealth();
              mob.setHealth(0);
              hero.setAtack(hero.getAtack()-handler);
              mob.setName("Dead "+mob.getName());
              mob.setLife(false);
            }
            if((mob.getHealth()< hero.getHealth())&&mob.getHealth()!=0){
                System.out.println(" Kill " + mob.getName()+"\n");
                int handler= mob.getHealth();
                mob.setHealth(0);
                hero.setHealth(hero.getHealth()-handler);
                mob.setName("Dead "+mob.getName());
                mob.setLife(false);
            }
return 1;
        }
        else{
            System.out.println(mob.getName()+" kill hero "+hero.getName()+"\n");
            hero.setHealth(0);
            return 0;
        }
    }
    public void heroMettWeapon(Weapon weapon,Hero hero){
        System.out.println(" You found "+weapon.getName()+" they give you " + weapon.getDamage()+ " damage\n");
        hero.setAtack(hero.getAtack()+weapon.getDamage());
        System.out.println("Now you atack have "+hero.getAtack());
    }
}
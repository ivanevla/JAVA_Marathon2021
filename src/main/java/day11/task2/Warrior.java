package day11.task2;

public class Warrior extends Hero implements PhysAttack {
    public Warrior() {
        super.setHealth(MAXHEALTH);
        super.setPhysAtt(30);
        super.setMagicAtt(0);
        super.setPhysDef(0.8);
        super.setMagicDef(0);
        super.setHealHimself(0);
        super.setHealTeammate(0);
    }

    @Override
    public void physicalAttack(Hero hero) {
        int heroHealth = hero.getHealth();
        double heroPhysDef = hero.getPhysDef();
        int damage = (int) (super.getPhysAtt() - (super.getPhysAtt() * heroPhysDef));
        int newHeroHealth = heroHealth - damage;

        if (newHeroHealth > 0) {
            hero.setHealth(newHeroHealth);
        } else {
            hero.setHealth(MINHEALTH);
        }
    }
}

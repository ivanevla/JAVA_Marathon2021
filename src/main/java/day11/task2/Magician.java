package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {
    public Magician() {
        super.setHealth(MAXHEALTH);
        super.setPhysAtt(5);
        super.setMagicAtt(20);
        super.setPhysDef(0);
        super.setMagicDef(0.8);
        super.setHealHimself(0);
        super.setHealTeammate(0);
    }

    @Override
    public void magicalAttack(Hero hero) {
        int heroHealth = hero.getHealth();
        double heroMagicDef = hero.getMagicDef();
        int damage = (int) (super.getMagicAtt() - (super.getMagicAtt() * heroMagicDef));
        int newHeroHealth = heroHealth - damage;

        if (newHeroHealth > 0) {
            hero.setHealth(newHeroHealth);
        } else {
            hero.setHealth(MINHEALTH);
        }
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

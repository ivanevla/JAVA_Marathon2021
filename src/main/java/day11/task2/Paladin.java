package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {
    public Paladin() {
        super.setHealth(MAXHEALTH);
        super.setPhysAtt(15);
        super.setMagicAtt(0);
        super.setPhysDef(0.5);
        super.setMagicDef(0.2);
        super.setHealHimself(25);
        super.setHealTeammate(10);
    }

    @Override
    public void healHimself() {
        int newHealth = super.getHealth() + super.getHealHimself();

        if (newHealth < 100) {
            super.setHealth(newHealth);
        } else {
            super.setHealth(MAXHEALTH);
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        int heroHealth = hero.getHealth();
        int newHealth = heroHealth + super.getHealTeammate();

        if (newHealth < 100) {
            hero.setHealth(newHealth);
        } else {
            hero.setHealth(MAXHEALTH);
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

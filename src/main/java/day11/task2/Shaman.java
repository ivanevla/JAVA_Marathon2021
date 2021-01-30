package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer {
    public Shaman() {
        super.setHealth(MAXHEALTH);
        super.setPhysAtt(10);
        super.setMagicAtt(15);
        super.setPhysDef(0.2);
        super.setMagicDef(0.2);
        super.setHealHimself(50);
        super.setHealTeammate(30);
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

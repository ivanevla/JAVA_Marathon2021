package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {
    private static final int HEAL_HIMSELF_AMOUNT = 25;
    private static final int HEAL_TEAMMATE_AMOUNT = 10;

    public Paladin() {
        super.setPhysAtt(15);
        super.setPhysDef(0.5);
        super.setMagicDef(0.2);
    }

    @Override
    public void healHimself() {
        int newHealth = super.getHealth() + HEAL_HIMSELF_AMOUNT;

        if (newHealth < MAXHEALTH) {
            super.setHealth(newHealth);
        } else {
            super.setHealth(MAXHEALTH);
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        int heroHealth = hero.getHealth();
        int newHealth = heroHealth + HEAL_TEAMMATE_AMOUNT;

        if (newHealth < MAXHEALTH) {
            hero.setHealth(newHealth);
        } else {
            hero.setHealth(MAXHEALTH);
        }
    }
}

package day11.task2;

public class Shaman extends Hero implements MagicAttack, Healer {

    private static final int HEAL_HIMSELF_AMOUNT = 50;
    private static final int HEAL_TEAMMATE_AMOUNT = 30;

    private final int magicAtt = 15;

    public Shaman() {
        super.setPhysAtt(10);
        super.setPhysDef(0.2);
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

    @Override
    public void magicalAttack(Hero hero) {
        int heroHealth = hero.getHealth();
        double heroMagicDef = hero.getMagicDef();
        int damage = (int) (this.magicAtt - (this.magicAtt * heroMagicDef));
        int newHeroHealth = heroHealth - damage;

        if (newHeroHealth > MINHEALTH) {
            hero.setHealth(newHeroHealth);
        } else {
            hero.setHealth(MINHEALTH);
        }
    }
}

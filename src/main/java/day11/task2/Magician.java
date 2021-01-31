package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {

    private int magicAtt = 20;

    public Magician() {
        super.setPhysAtt(5);
        super.setPhysDef(0);
        super.setMagicDef(0.8);
    }

    @Override
    public void magicalAttack(Hero hero) {
        int heroHealth = hero.getHealth();
        double heroMagicDef = hero.getMagicDef();
        int damage = (int) (this.magicAtt - (this.magicAtt * heroMagicDef));
        int newHeroHealth = heroHealth - damage;

        if (newHeroHealth > 0) {
            hero.setHealth(newHeroHealth);
        } else {
            hero.setHealth(MINHEALTH);
        }
    }
}

package day11.task2;

public abstract class Hero implements PhysAttack {
    public static final int MAXHEALTH = 100;
    public static final int MINHEALTH = 0;

    private int health;
    private int physAtt;
    private double physDef;
    private double magicDef;

    public Hero() {
        this.health = MAXHEALTH;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPhysAtt() {
        return physAtt;
    }

    public void setPhysAtt(int physAtt) {
        this.physAtt = physAtt;
    }

    public double getPhysDef() {
        return physDef;
    }

    public void setPhysDef(double physDef) {
        this.physDef = physDef;
    }

    public double getMagicDef() {
        return magicDef;
    }

    public void setMagicDef(double magicDef) {
        this.magicDef = magicDef;
    }

    @Override
    public void physicalAttack(Hero hero) {
        int heroHealth = hero.getHealth();
        double heroPhysDef = hero.getPhysDef();
        int damage = (int) (this.getPhysAtt() - (this.getPhysAtt() * heroPhysDef));
        int newHeroHealth = heroHealth - damage;

        if (newHeroHealth > MINHEALTH) {
            hero.setHealth(newHeroHealth);
        } else {
            hero.setHealth(MINHEALTH);
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "health=" + health +
                '}';
    }
}

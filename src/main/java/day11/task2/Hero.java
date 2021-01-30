package day11.task2;

public abstract class Hero {
    public static final int MAXHEALTH = 100;
    public static final int MINHEALTH = 0;
    private int health;
    private int physAtt;
    private int magicAtt;
    private double physDef;
    private double magicDef;
    private int healHimself;
    private int healTeammate;

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

    public int getMagicAtt() {
        return magicAtt;
    }

    public void setMagicAtt(int magicAtt) {
        this.magicAtt = magicAtt;
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

    public int getHealHimself() {
        return healHimself;
    }

    public void setHealHimself(int healHimself) {
        this.healHimself = healHimself;
    }

    public int getHealTeammate() {
        return healTeammate;
    }

    public void setHealTeammate(int healTeammate) {
        this.healTeammate = healTeammate;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "health=" + health +
                '}';
    }
}

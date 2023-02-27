package Unit;

public abstract class Hero implements GameInterface {

    private static int manCnt = 10;

    public static int getManCnt() {
        return manCnt;
    }

    private float hp;

    public void setHp(float hp) {
        if (hp >= 0)
            this.hp = hp;
    }

    public float getHp() {
        return hp;
    }

    public int damage, att, def, maxHp;
    public String name;

    public Hero(float hp, int maxHp, int damage, int att, int def) {
        this.hp = hp;
        this.maxHp = maxHp;
        this.damage = damage;
        this.att = att;
        this.def = def;
        manCnt++;
    }

    public Hero() {
    }

    @Override
    public void step(int a) {
    }

    @Override
    public String getInfo() {
        return "Я Герой";
    }

}
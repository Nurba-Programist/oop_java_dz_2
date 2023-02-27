package Unit;

public class Sniper extends Archer {

    public Sniper() {
        super(580, 700, 52, 1, 3, 5, 15, 5);
        super.name = name;
    }

    public Sniper(String string) {
    }

    @Override
    public void step(int a) {

    }

    @Override
    public String getInfo() {
        return "Я Снайпер!";
    }
}

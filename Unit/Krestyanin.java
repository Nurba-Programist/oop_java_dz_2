package Unit;

public class Krestyanin extends Hero {

    public Krestyanin() {
        super(500, 600, 30, 1, 2);

    }

    public Krestyanin(String string) {
    }

    @Override
    public String getInfo() {
        return "Я Крестьянин!";
    }
}

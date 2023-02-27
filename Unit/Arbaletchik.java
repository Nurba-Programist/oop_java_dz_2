package Unit;

public class Arbaletchik extends Archer {

    public Arbaletchik() {
        super(700, 800, 35, 6, 5, 5, 17, 6);
        super.name = name;
    };

    public Arbaletchik(String string) {
    }

    @Override
    public String getInfo() {
        return "Я Арбалетчик!";
    }
}

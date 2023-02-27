package Unit;

public class Razboinik extends Hero {

    public Razboinik() {
        super(400, 480, 25, 3, 4);
        super.name = name;
    }

    public Razboinik(String string) {
    }

    @Override
    public String getInfo() {
        return "Я Разбойник!";
    }

}

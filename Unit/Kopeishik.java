package Unit;

public class Kopeishik extends Hero {

    public Kopeishik() {
        super(550, 620, 28, 5, 5);
        super.name = name;
    }

    public Kopeishik(String string) {
    }

    @Override
    public String getInfo() {
        return "Я Копейщик!";
    }

}

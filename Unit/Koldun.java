package Unit;

public class Koldun extends Hero {

    public Koldun() {
        super(400, 500, 24, 4, 3);
        super.name = name;
    }

    public Koldun(String string) {
    }

    @Override
    public String getInfo() {
        return "Я Колдун!";
    }

}

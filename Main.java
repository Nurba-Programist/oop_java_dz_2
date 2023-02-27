
import java.util.ArrayList;
import java.util.Random;
import Unit.Arbaletchik;
import Unit.Hero;
import Unit.Koldun;
import Unit.Kopeishik;
import Unit.Krestyanin;
import Unit.Names;
import Unit.Razboinik;
import Unit.Sniper;

public class Main {

    public static void main(String[] args) {

        Krestyanin hero1 = new Krestyanin("Крестьянин");
        Sniper hero2 = new Sniper("Снайпер");
        Koldun hero3 = new Koldun("Колдун");
        Arbaletchik hero4 = new Arbaletchik("Арбалетчик");
        Kopeishik hero5 = new Kopeishik("Копейщик");
        Razboinik hero6 = new Razboinik("Разбойник");

        System.out.println(hero1.getInfo());
        System.out.println(hero2.getInfo());
        System.out.println(hero3.getInfo());
        System.out.println(hero4.getInfo());
        System.out.println(hero5.getInfo());
        System.out.println(hero6.getInfo());

        ArrayList<Hero> list = new ArrayList<>();
        list.add(new Arbaletchik(getName()));
        list.add(new Sniper(getName()));
        list.add(new Koldun(getName()));
        list.add(new Razboinik(getName()));
        list.add(new Kopeishik(getName()));
        list.add(new Krestyanin(getName()));

        list.get(0).getInfo();
        list.get(1).getInfo();
        list.get(2).getInfo();
        list.get(3).getInfo();
        list.get(4).getInfo();
        list.get(5).getInfo();

        for (int i = 0; i < 10; i++) {
            System.out.println("Случайный герой: " + getName());

        }
    }

    private static String getName() {
        String name = java.lang.String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
        return name;
    }

}

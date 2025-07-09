import java.util.ArrayList;
public class GameMaster {
    public static void main(String[] args) {
        ArrayList<Character> party = new ArrayList<Character>();
        Hero h = new Hero("勇者", 100, "剣"); party.add(h);
        Wizard w = new Wizard("魔法使い", 60, 30); party.add(w);
        Thief t = new Thief("盗賊", 70); party.add(t);

        ArrayList<Monster> monsters = new ArrayList<Monster>();
        monsters.add(new Matango('A', 45));
    }
}

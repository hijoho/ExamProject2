import java.util.ArrayList;
public class GameMaster {
    public static void main(String[] args) {
        ArrayList<Character> party = new ArrayList<Character>();
        Hero hero = new Hero("勇者", 100, "剣"); party.add(hero);
        Wizard wizard = new Wizard("魔法使い", 60, 30); party.add(wizard);
        Thief thief = new Thief("盗賊", 70); party.add(thief);

        ArrayList<Monster> monsters = new ArrayList<Monster>();
        Matango matango = new Matango('A', 45); monsters.add(matango);
        Goblin goblin = new Goblin('A', 50); monsters.add(goblin);
        Slime slime = new Slime('A', 40); monsters.add(slime);

        System.out.println("---味方パーティ---");
        for(Character c : party){
            c.showStatus();
        }
        System.out.println("---敵グループ---");
        for(Monster m : monsters){
            m.showStatus();
        }
        System.out.println("\n味方の総攻撃！");
        for(Character c : party){
            for(Monster m : monsters){
                c.attack(m);
            }
        }
        System.out.println("\n敵の総攻撃！");
        for(Monster m : monsters){
            for(Character c : party){
                m.attack(c);
            }
        }
        System.out.println("\nダメージを受けた勇者が突然光だした！");
        party.set(0, new SuperHero(hero));
        System.out.println("勇者はスーパーヒーローに進化した！");
        for(Monster m : monsters){
            party.get(0).attack(m);
        }
        System.out.println("\n---味方パーティ最終ステータス---");
        for(Character c : party){
            c.showStatus();
            if(c.isAlive()){
                System.out.println("生存状況：生存");
            }else{
                System.out.println("生存状況：死亡");
            }
        }
        System.out.println("\n---敵グループ最終ステータス---");
        for(Monster m : monsters){
            m.showStatus();
            if(m.isAlive()){
                System.out.println("生存状況：生存");
            }else{
                System.out.println("生存状況：討伐済み");
            }
        }
    }
}

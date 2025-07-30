import creature.Character;
import creature.Monster;
import creature.character.Hero;
import creature.character.SuperHero;
import creature.character.Thief;
import creature.character.Wizard;
import creature.monster.Goblin;
import creature.monster.Matango;
import creature.monster.Slime;
import weapon.Dagger;
import weapon.Sword;
import weapon.Wand;
import weapon.Weapon;

import java.util.ArrayList;
public class GameMaster {
    public static void main(String[] args) {
        ArrayList<creature.Character> party = new ArrayList<creature.Character>();
        Hero hero = new Hero("勇者", 100, new Sword()); party.add(hero);
        Wizard wizard = new Wizard("魔法使い", 60, 30, new Wand()); party.add(wizard);
        Thief thief = new Thief("盗賊", 70, new Dagger()); party.add(thief);

        ArrayList<Monster> monsters = new ArrayList<Monster>();
        Matango matango = new Matango('A', 45); monsters.add(matango);
        Goblin goblin = new Goblin('A', 50); monsters.add(goblin);
        Slime slime = new Slime('A', 40); monsters.add(slime);

        System.out.println("---味方パーティ---");
        for(creature.Character character : party){
            character.showStatus();
        }
        System.out.println("---敵グループ---");
        for(Monster monster : monsters){
            monster.showStatus();
        }
        System.out.println("\n味方の総攻撃！");
        for(creature.Character character : party){
            for(Monster m : monsters){
                character.attack(m);
            }
        }
        System.out.println("\n敵の総攻撃！");
        for(Monster monster : monsters){
            for(creature.Character c : party){
                monster.attack(c);
            }
        }
        System.out.println("\nダメージを受けた勇者が突然光だした！");
        party.set(0, new SuperHero(hero));
        System.out.println("勇者はスーパーヒーローに進化した！");
        for(Monster monster : monsters){
            party.get(0).attack(monster);
        }
        System.out.println("\n---味方パーティ最終ステータス---");
        for(Character character : party){
            character.showStatus();
            if(character.isAlive()){
                System.out.println("生存状況：生存");
            }else{
                System.out.println("生存状況：死亡");
            }
        }
        System.out.println("\n---敵グループ最終ステータス---");
        for(Monster monster : monsters){
            monster.showStatus();
            if(monster.isAlive()){
                System.out.println("生存状況：生存");
            }else{
                System.out.println("生存状況：討伐済み");
            }
        }
    }
}

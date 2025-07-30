package creature.character;

import creature.Character;
import creature.Creature;
import weapon.Weapon;

public class Wizard extends Character {
    private int mp;
    public Wizard(String name, int hp, int mp, Weapon weapon) {
        super(name, hp, weapon);
        this.setMp(mp);
    }

    public int getMp() {
        return this.mp;
    }
    public void setMp(int mp) {
        this.mp = mp;
    }

    public void magic(Creature target) {
        if(this.getMp()<=0){
            System.out.println("MPが足りない！");
        }else{
            System.out.println(this.getName()+"は"+this.getWeapon().getName()+this.getWeapon().attackMessage()+target.getName()+"に3のダメージを与えた！");
            target.setHp(target.getHp()-this.getWeapon().getDamage());
            this.setMp(this.getMp()-this.getWeapon().getCost());
        }
    }
    public void attack(Creature target) {
        System.out.println(this.getName()+"は石を投げた！"+target.getName()+"に３のダメージを与えた！");
        target.setHp(target.getHp()-3);
    }
    public void showStatus(){
        System.out.println(this.getName()+"：HP"+this.getHp()+"/"+"MP"+this.getMp());
    }
}

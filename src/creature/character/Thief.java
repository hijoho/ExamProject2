package creature.character;

import creature.Character;
import creature.Creature;
import weapon.Weapon;

public class Thief extends Character {
    private boolean guard;
    public Thief(String name, int hp, Weapon weapon){
        super(name, hp, weapon);
    }

    public boolean isGuard() {
        return guard;
    }
    public void setGuard(boolean guard) {
        this.guard = guard;
    }

    public void attack(Creature target) {
        System.out.println(this.getName()+"は"+this.getWeapon()+this.getWeapon().attackMessage()+target.getName()+"に5のダメージを与えた！");
        target.setHp(target.getHp() - this.getWeapon().getDamage()*2);
    }

    public void guard() {
        guard = true;
    }
    public void setHp(int damage){
        if(guard){
            guard = false;
            System.out.println("しかし、"+ this.getName() +"は攻撃を回避し、ダメージが入らなかった！");
        }else{
            super.setHp(this.getHp() - damage);
        }
    }
}

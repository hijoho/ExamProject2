package creature.character;

import creature.Creature;

public class SuperHero extends Hero {
    public SuperHero(Hero hero) {
        super(hero.getName(), hero.getHp(), hero.getWeapon());
        this.setHp(this.getHp()-30);
    }

    public void attack(Creature target) {
        System.out.println(this.getName()+"は"+this.getWeapon()+this.getWeapon().attackMessage()+target.getName()+"に25のダメージを与えた！");
        target.setHp(target.getHp() - (int)(this.getWeapon().getDamage()*2.5));
    }
}

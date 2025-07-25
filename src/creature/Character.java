package creature;

import weapon.Weapon;

public abstract class Character implements Creature {
    private String name;
    private int hp;
    private Weapon weapon;

    public Character(String name, int hp, Weapon weapon) {
        if(hp<0){
            throw new IllegalArgumentException("初期設定に誤りがあるため、キャラクターを作成できませんでした");
        }
        this.setName(name);
        this.setHp(hp);
        this.setWeapon(weapon);
    }

    public void setHp(int hp) {
        if(hp<0){
            hp = 0;
        }
        this.hp = hp;
    }
    public int getHp(){
        return this.hp;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public Weapon getWeapon() {
        return weapon;
    }
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public final boolean isAlive(){
        return this.getHp()>0;
    }
    public void showStatus(){
        System.out.println(this.getName()+"：HP"+this.getHp());
    }
    public void die(){
        System.out.println(this.getName()+"は死んでしまった！");
    }
}

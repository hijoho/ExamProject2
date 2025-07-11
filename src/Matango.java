public class Matango extends Monster{
    public Matango(char suffix, int hp) {
        super(suffix, hp);
        setName("お化けキノコ");
    }

    public void attack(Creature target) {
        System.out.println(this.getName()+"お化けキノコ"+this.getSuffix()+"は体当たり攻撃！"+target.getName()+"に6のダメージを与えた！");
        target.setHp(target.getHp()-6);
    }
}

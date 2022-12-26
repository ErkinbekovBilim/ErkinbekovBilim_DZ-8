public class Magic extends Hero {

    private int attackBoost;
    public Magic(int health, int damage,int attackBoost, String name) {
        super(health, damage, name, SuperAbility.BOOST);
        this.attackBoost = attackBoost;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
                heroes[i].setDamage(heroes[i].getDamage() + this.attackBoost);
        }
    }
}

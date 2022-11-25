package kg.geektech.game.players;

public class Magic extends Hero {
    public Magic(int health, int damage, String name) {
        super(health, damage, SuperAbility.BOOST, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int Boost = 20;
        for (int i = 0; i < heroes.length; i++) {
            if (this.getHealth() > 0 && heroes[i].getHealth() > 0) {
                heroes[i].setDamage(heroes[i].getDamage()+ Boost);
                break;
            }
        }
        System.out.println("Урон увеличен");

    }
}

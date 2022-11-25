package kg.geektech.game.players;

public class Berserk extends Hero {
    private int savedDamage;

    public Berserk(int health, int damage, String name) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT, name);
    }

    public void setSavedDamage(int savedDamage) {
        this.savedDamage = savedDamage;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        setSavedDamage(boss.getDamage() / 5 );
        for (int i = 0; i < heroes.length; i++) {
            if(this.getHealth() > 0 && boss.getHealth() > 0){
                boss.setHealth(boss.getHealth() - (this.getDamage()+ getDamage()));
                break;
            }
        }
        System.out.println("Берсерк ударил босса");


    }
}

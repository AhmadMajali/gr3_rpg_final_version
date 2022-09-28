package kg.geektech.game.players;

public class Thor extends Hero{
    public Thor(int health, int damage, String name) {
        super(health, damage, name,SuperAbility.TUNDECLUP);
    }


    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        boolean thorHamer=RPG_Game.random.nextBoolean();
        if (thorHamer){
            boss.setDamage(0);
            System.out.println("Boss got baned for one round");
        }else{
            boss.setDamage(50);
        }
    }
}
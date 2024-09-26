package chp08.ex8_9;

public class Monster {
    private String name;
    private int hp;
    private static int maxHp = 30;

    public Monster(String name) {
        this.name = name;
        this.hp = maxHp;
    }

    public void attack(Monster m){
        m.setHp(m.getHp()-10);
        System.out.printf("[%s]의 공격 -> [%s]의 채력: %d/%d\n",this.name,m.name,m.hp,maxHp);

    }

    public static void battle(Monster a, Monster b) {
        while (a.hp >0 && b.hp > 0) {
            Monster attacker = (Math.random() < 0.5) ? a : b;
            Monster defender = (attacker == a) ? b : a;
            attacker.attack(defender);
        }
        System.out.printf("[%s]의 승리!",(a.hp >0?a.name:b.name));
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}

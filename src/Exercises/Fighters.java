package Exercises;

class Fighter {
    private String name;
    private int health;
    private int damagePerAttack;

    public void setInfo(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamagePerAttack() {
        return damagePerAttack;
    }
}

class FightSimulator {

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        Fighter[] fighters = {fighter1, fighter2};
        int turn = 0;

        while (fighter1.getHealth() > 0 && fighter2.getHealth() > 0) {
            Fighter attacker = fighters[turn];
            Fighter opponent = fighters[1 - turn]; // switch


            opponent.setInfo(opponent.getName(), opponent.getHealth() - attacker.getDamagePerAttack(), opponent.getDamagePerAttack());


            turn = 1 - turn;
        }

        // Determine the winner
        String winnerName = (fighter1.getHealth() <= 0) ? fighter2.getName() : fighter1.getName();
        return winnerName + " wins";
    }

    public static void main(String[] args) {
        Fighter tom = new Fighter();
        tom.setInfo("Tom", 10, 2);

        Fighter harry = new Fighter();
        harry.setInfo("Harry", 5, 4);

        String result = declareWinner(tom, harry, "Tom");
        System.out.println(result);
    }
}
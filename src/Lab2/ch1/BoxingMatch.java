package Lab2.ch1;

public class BoxingMatch {
    private Fighter fighter1;
    private Fighter fighter2;

    public BoxingMatch(Fighter fighter1, Fighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }

    public String fight() {
        int i = 0;

        while(fighter1.getHealth() > 0 && fighter2.getHealth() > 0) {
            if(i == 0) {
                fighter1.attack(fighter2);
                i = 1;
            }
            else {
                fighter2.attack(fighter1);
                i = 0;
            }
        }

        if(fighter1.getHealth() < 0) {
            return fighter2.getName();
        }
        else {
            return fighter1.getName();
        }

    }
}

package Lab2.ch2;

import java.util.ArrayList;

public class Film {
    private int anAparitie;
    private String nume;
    private Actor[] actori;

    public Film(int anAparitie, String nume, Actor[] actori) {
        this.anAparitie = anAparitie;
        this.nume = nume;
        this.actori = actori;
    }

    public Actor[] getActori() {
        return actori;
    }

    public String getNume() {
        return nume;
    }

    public Actor getActorByName(String name) {
        for(Actor actor : getActori()) {
            if(actor.getNume().equals(name)) {
                return actor;
            }
        }
        return null;
    }
}

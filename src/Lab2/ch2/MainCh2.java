package Lab2.ch2;

public class MainCh2 {
    public static void main(String[] args) {
        //instances of classes
        Premiu oscar1990 = new Premiu("oscar", 1990);
        Premiu oscar2000 = new Premiu("oscar", 2000);
        Premiu oscar2010 = new Premiu("oscar", 2010);
        Premiu oscar2018 = new Premiu("oscar", 2018);

        Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35, new Premiu[]{oscar1990, oscar2000});
        Actor actorOscar2010 = new Actor("actor cu oscar din 2000", 55, new Premiu[]{oscar2010});
        Actor actorOscar2018 = new Actor("actor cu oscar din 2018", 23, new Premiu[]{oscar2018});
        Actor actorFaraPremii01 = new Actor("actor fara oscar 01", 33, new Premiu[]{});
        Actor actorFaraPremii02 = new Actor("actor fara oscar 02", 60, new Premiu[]{});
        Actor actorFaraPremii03 = new Actor("actor fara oscar 03", 20, new Premiu[]{});

        Film film1 = new Film(1990, "film cu actori de oscar", new Actor[]{actorOscar1990, actorFaraPremii01});
        Film film2 = new Film(2010, "film cu actori fara premii2", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film3 = new Film(2010, "film cu actori fara premii3", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film4 = new Film(2018, "film cu actori de oscar", new Actor[]{actorOscar2010, actorOscar2018, actorFaraPremii02});
        Film film5 = new Film(2018, "film cu actori fara premii", new Actor[]{actorFaraPremii02, actorFaraPremii03});

        Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
        Studio studio2 = new Studio("Disney", new Film[]{film3, film4, film5});

        Studio[] studioDatabase = new Studio[]{studio1, studio2};

        //all studio names that have published more than 2 movies
        System.out.println("Studios with more than 2 movies: ");
        for(Studio currStudio : studioDatabase) {
            if (currStudio.getFilme().length > 2) {
                System.out.println(currStudio.getNume());
            }
        }
        System.out.println("-------\n");
        //studio names in which plays the actor with the name "actor cu 2 oscaruri"
        System.out.println("Studios with the wanted actor:");

//        old method
//        for(Studio currStudio : studioDatabase) {
//            int count = 0;
//            for(Film currFilm : currStudio.getFilme()) {
//                for(Actor currActor : currFilm.getActori()) {
//                    if(currActor.getNume() == "actor cu 2 oscaruri") {
//                        if(count == 0) {
//                            System.out.println(currStudio.getNume());
//                            count = 1;
//                        }
//                    }
//                }
//            }
//        }

        for(Studio currStudio : studioDatabase) {
            if(currStudio.getFilmByActor("actor cu 2 oscaruri") != null) {
                System.out.println(currStudio.getNume());
            }
        }

        System.out.println("-------\n");

        //movie names in which plays at least an actor with age above 50
        System.out.println("Movie names in which plays at least an actor with age above 50");
        for(Studio currStudio : studioDatabase) {
            for(Film currFilm : currStudio.getFilme()) {
                Boolean found = false;
                for(Actor currActor : currFilm.getActori()) {
                    if(currActor.getVarsta() > 50) {
                        found = true;
                    }
                }
                if(found) {
                    System.out.println(currFilm.getNume());
                }
            }
        }
    }
}

package Lab2.ch2;
public class Studio {
    private String nume;
    Film[] filme;

    public Studio(String nume, Film[] filme) {
        this.nume = nume;
        this.filme = filme;
    }

    public Film[] getFilme() {
        return filme;
    }

    public String getNume() {
        return nume;
    }

    public Film getFilmByActor(String s) {
        for(Film film : filme) {
            if(film.getActorByName(s) != null) {
                return film;
            }
        }
        return null;
    }
}

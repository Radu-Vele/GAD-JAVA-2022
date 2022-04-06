package Lab3.visitor;

public class Movie implements Element{

    private int time;

    public Movie(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}

package Lab3.visitor;

public class TimeVisitor implements Visitor{

    private int totalTime;

    public TimeVisitor() {
        this.totalTime = 0;
    }

    @Override
    public void visit(Song song) {
        totalTime += song.getTime();
    }

    @Override
    public void visit(Movie movie) {
        totalTime += movie.getTime();
    }

    @Override
    public void visit(Book book) {
        totalTime += book.getPageNr() * 10;
    }

    public int getTotalTime() {
        return totalTime;
    }
}

package Lab3.visitor;

public interface Visitor {
    void visit(Song song);
    void visit(Movie movie);
    void visit(Book book);
}

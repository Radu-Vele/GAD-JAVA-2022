package Lab3.visitor;

public class Book implements Element{
    private int pageNr;
    private String title;

    public Book(int pageNr, String title) {
        this.pageNr = pageNr;
        this.title = title;
    }

    public int getPageNr() {
        return pageNr;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}

package Lab3.prototype;

public class Leash implements Cloneable{
    private String color;
    private int size;

    public Leash(String color, int size) {
        this.color = color;
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Leash{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }

    @Override
    public Leash clone() throws CloneNotSupportedException {
        return (Leash)super.clone();
    }
}

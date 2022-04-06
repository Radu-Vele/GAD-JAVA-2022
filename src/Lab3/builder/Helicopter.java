//package Lab3.builder;
//
//public class Helicopter {
//    private String ID;
//    private int maxHeight;
//    private HelicopterTypes type;
//    private String color;
//    private int weight;
//    private int maxSpeed;
//
//
//}
//
//public class Builder {
//    private String ID;
//    private int maxHeight;
//    private HelicopterTypes type;
//    private String color;
//    private int weight;
//    private int maxSpeed;
//
//    public Builder(String ID) {
//        this.ID = ID;
//    }
//
//    public static Helicopter build() {
//        Helicopter instance = new Helicopter();
//        instance.ID = this.ID;
//        instance.type = this.type;
//        instance.maxHeight = this.maxHeight;
//        instance.color = this.color;
//        instance.weight = this.weight;
//        instance.maxSpeed = this.maxSpeed;
//    }
//}
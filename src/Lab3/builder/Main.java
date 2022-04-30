package Lab3.builder;

public class Main {
    public static void main(String[] args) {
        Helicopter.Builder builder = new Helicopter.Builder("H123");
        builder.setColor("Red");
        builder.setMaxHight(22)
                .setMaxSpeed(33)
                .setType(HelicopterTypes.ATTACK)
                .setWeight(34);
        Helicopter helicopter = builder.build();

        System.out.println(helicopter);
        builder.setWeight(88);
        Helicopter helicopter2 = builder.build();
        System.out.println(helicopter2);

        Helicopter helicopter3 = new Helicopter.Builder("A23").setWeight(102).setColor("Gray").setType(HelicopterTypes.MEDICAL).build();
        System.out.println(helicopter3);

    }
}

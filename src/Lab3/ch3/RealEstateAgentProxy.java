package Lab3.ch3;

import java.util.ArrayList;

public class RealEstateAgentProxy {

    private ArrayList<Apartment> representedApartments;

    public RealEstateAgentProxy() {
        this.representedApartments = new ArrayList<Apartment>();
    }

    void represent(Apartment apartment) {
        representedApartments.add(apartment);
    }

    Apartment rent(Student student) {
        Apartment toReturn = null;
        if(student.getName().trim().startsWith("P")) {
            return null;
        } else {
            int minPrice = 1000;
            if(representedApartments.size() > 0)
                minPrice = representedApartments.get(0).getMonthlyRentCost();

            for (Apartment apartment : representedApartments) {
                if(student.getMoney() >= apartment.getMonthlyRentCost()) {
                    if(minPrice > apartment.getMonthlyRentCost())
                        toReturn = apartment;
                }
            }
        }
        return toReturn;
    }
}

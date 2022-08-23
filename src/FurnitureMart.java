public class FurnitureMart {
    int furnitureCode;
    String furnitureType;
    String gradeOfFurniture;
    String colour;
    String furnitureUsage;
    double price;

    FurnitureMart() {

        furnitureCode = 1234;
        furnitureType = "Table";
        gradeOfFurniture = "grade1";
        colour = "green";
        furnitureUsage = "outdoor";
        price = 100.0;
    }

    public double FurnitureItem() {
        double discount = 5.0;
        if (furnitureUsage.equalsIgnoreCase("outdoor"))
            price = price - (price * discount / 100);
        return price;
    }
}

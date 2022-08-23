import java.util.Scanner;

public class FurnitureMartImpl {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        FurnitureMart obj = new FurnitureMart();


        System.out.println("Please select the type of the furniture,1.Tables,2.chairs,3.cupboards,4.stools");
        obj.furnitureType = scanner.nextLine();
        System.out.println("please select the grade of the furniture,1.Grade1,2.Grade2,3.Grade3");
        obj.gradeOfFurniture = scanner.nextLine();
        System.out.println("please select the colour of the furniture,1.red,2.blue,3.green");
        obj.colour = scanner.nextLine();
        System.out.println("please select the usage of the furniture,1.indoor,2.outdoor");
        obj.furnitureUsage = scanner.nextLine();
        System.out.println("please enter the price of the product");
        obj.price = scanner.nextDouble();
        System.out.println("please enter the product Code");
        obj.furnitureCode = scanner.nextInt();

        double price = obj.FurnitureItem();
        System.out.println("price = " + price);
        System.out.println("furnitureType = " + obj.furnitureType);
        System.out.println("Grade = " + obj.gradeOfFurniture);
        System.out.println("code = " + obj.furnitureCode);
        System.out.println("Colour = " + obj.colour);
        System.out.println("Usage = " + obj.furnitureUsage);


    }
}

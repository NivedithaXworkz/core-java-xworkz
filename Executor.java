import grocery.Grocery;
import shopping.Shopping;

import java.util.Scanner;

public class Executor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Grocery to be added");
        int size = sc.nextInt();
        Shopping shopping = new Shopping(size);

        for (int index = 0; index < size; index++) {
            Grocery grocery = new Grocery();
            //System.out.println("Enter the product Id");//
           // grocery.setProductId(sc.nextInt());//
            System.out.println("Enter the Name ");
            grocery.setName(sc.next());
            System.out.println("Enter the Released Date");
            grocery.setReleasedDate(sc.next());
            System.out.println("Enter the ExpiryDate");
            grocery.setExpiryDate(sc.next());
            System.out.println("Enter the Price");
            grocery.setPrice(sc.nextInt());
            System.out.println("Enter the ingredients");
            grocery.setIngredients(sc.next());
            System.out.println("Enter the Net Content");
            grocery.setNetContent(sc.next());
            System.out.println("Enter the Company Name");
            grocery.setCompanyName(sc.next());
            shopping.addGrocery(grocery);
        }
        String input = null;
        do {
            System.out.println("press 1 : to get All Grocery");
            System.out.println("press 2 : to get NameById ");
            System.out.println("press 3 : to get GroceryCompanyNameByName");
            System.out.println("press 4 : to get IngredientsByCompanyName");
            System.out.println("press 5 : to get NetContentById");

            int options = sc.nextInt();

            switch (options) {
                case 1:
                    System.out.println("enter all Grocery");
                    shopping.getAllGrocery();
                    break;
                case 2:
                    System.out.println("enter  get NameById");
                    shopping.getNameById(sc.nextInt());
                    break;
                case 3:
                    System.out.println("enter get GroceryCompanyNameByName");
                    shopping.getGroceryCompanyNameByName(sc.next());
                    break;
                case 4:
                    System.out.println("enter get IngredientsByCompanyName");
                    shopping.getIngredientsByCompanyName(sc.next());
                    break;
                case 5:
                    System.out.println("enter get NetContentById");
                    shopping.getNetContentById(sc.nextInt());
                    break;
            }
            System.out.println("do u want to continue Y/N");
            input = sc.next();
        }
        while (input.equals("Y"));
        System.out.println("Thank you for Shopping");
    }
}








package shopping;

import grocery.Grocery;

import java.util.Arrays;

public class Shopping {
    Grocery grocery[];
    int id;

    public Shopping(int size) {
        grocery = new Grocery[size];
    }

    int index;

    public boolean addGrocery(Grocery grocery) {
        System.out.println("invoked add grocery");
        boolean isAdded = false;
        if (grocery != null) {
            grocery.setProductId(id++);
            this.grocery[index] = grocery;
            index++;
            isAdded = true;
        }
        return isAdded;
    }

    public void getAllGrocery() {
        System.out.println("Grocery lists are");
        for (int index = 0; index < grocery.length; index++) {
            System.out.println(grocery[index].getProductId() + " " + grocery[index].getName() + " " + grocery[index].getReleasedDate() + " " + grocery[index].getExpiryDate() + " " + grocery[index].getPrice() + "" + grocery[index].getIngredients() + " " + grocery[index].getNetContent() + " " + grocery[index].getCompanyName());
        }
    }

    public String getNameById(int id) {
        String name = null;
        for (int groceryIndex = 0; groceryIndex < this.grocery.length; groceryIndex++) {
            if (grocery[groceryIndex].getProductId() == id) {
                name = grocery[groceryIndex].getName();
                System.out.println("Grocery  name found.... please collect it in executor");
            }
        }
        return name;
    }

    public String getGroceryCompanyNameByName(String groceryName) {
        String CompanyName = null;
        for (int groceryIndex = 0; groceryIndex < this.grocery.length; groceryIndex++) {
            if (grocery[groceryIndex].getName() == groceryName) {
                CompanyName = grocery[groceryIndex].getCompanyName();
                System.out.println("Grocery found.... please collect it in executor");
            }
        }
        return CompanyName;
    }

    public String getIngredientsByCompanyName(String CompanyName) {
        String Ingredients = null;
        for (int groceryIndex = 0; groceryIndex < this.grocery.length; groceryIndex++) {
            if (grocery[groceryIndex].getName() == CompanyName) {
                Ingredients = grocery[groceryIndex].getIngredients();
                System.out.println("Grocery found.... please collect it in executor");
            }
        }
        return Ingredients;
    }

    public String getNetContentById(int Id) {
        String NetContent = null;
        for (int groceryIndex = 0; groceryIndex < this.grocery.length; groceryIndex++) {
            if (grocery[groceryIndex].getProductId() == Id) {
                NetContent = grocery[groceryIndex].getNetContent();
                System.out.println("Grocery found.... please collect it in executor");
            }
        }
        return NetContent;
    }

    public boolean updateNetContentByCompanyName(String updatedNetContent, String exisistingCompanyName) {
        boolean isNetContentUpdated = false;
        for (int groceryIndex = 0; groceryIndex < this.grocery.length; groceryIndex++) {
            if (grocery[groceryIndex].getCompanyName() == exisistingCompanyName) {
                grocery[groceryIndex].setNetContent(updatedNetContent);
                isNetContentUpdated = true;
            }
        }
        return isNetContentUpdated;
    }

    public void deleteNameById(int id) {
        System.out.println("invoked deleteNameById ");
        int index, newIndex;
        for (index = 0, newIndex = 0; index < this.grocery.length; index++) {
            if (grocery[index].getProductId() != id) {
                grocery[newIndex++] = grocery[index];
            } else {
                System.out.println(" Some grocery Name is been deleted from the Shopping");
            }
        }
        // java.util
        grocery = Arrays.copyOf(grocery, newIndex);
        getAllNewGrocery(grocery);
    }

    public void getAllNewGrocery(Grocery application[]) {
        System.out.println("Get all new application");
        for (int index = 0; index < application.length; index++) {
            System.out.println(grocery[index].getProductId() + " " + grocery[index].getName() + " " + grocery[index].getReleasedDate() + " " + grocery[index].getExpiryDate() + " " + grocery[index].getPrice() + " " + grocery[index].getIngredients() + " " + grocery[index].getNetContent()+""+grocery[index].getCompanyName());
        }
    }
}

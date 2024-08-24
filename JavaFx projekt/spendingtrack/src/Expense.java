public class Expense {
    private String description;
    private double amount;
    private String category ;

    /*
    Create by Eugene Coulibaly 23.08.2024
    now we are going to create a constructor for the Expesne Class

     */
    public Expense (String description, double amount, String category) {
        this.description = description;
        this.amount = amount;
        this.category = category;

    }


    /*
    get the description
     */
    public String getDescription() {
        return description;

    }


    /*
    create a description
     */
    public void setDescription(String description) {
        this.description = description;

    }


    /*
    get Amount
     */
    public double getAmount() {
        return amount;

    }

    /*
    save an amount in variable
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }


    /*
    get a category which has already been saved
     */
    public String getCategory() {
        return category;
    }


    /*
    set a new category
     */
    public void setCategory(String category) {
        this.category = category;
    }
    // toString methode for easy display

    @Override
    public String toString() {
        return "Expense [description=" + description + ", amount=" + amount + ", category=" + category + "]";

    }



}

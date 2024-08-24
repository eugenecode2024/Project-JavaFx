public class budget {
    private static  double totalBudget;
    private static  double spentAmount;

    //constructor
    public budget(double totalBudget){
        this.totalBudget = totalBudget;
        this.spentAmount = 0;
    }
    // methode to add expense
    public static void addExpense(double amount){
        spentAmount += amount ;
    }
    // getter
    public double getTotalBudget(){
        return totalBudget;
    }


    public double getSpentAmount(){
        return spentAmount;
    }

    //calculate the remaining budget
    public static double getRemainingBudget (){
        return totalBudget - spentAmount;
    }
    //toString for easy display
    @Override
    public  String toString(){
        return "Total Budget: $" + totalBudget + ", Spent: $" + spentAmount + ", Remaining: $"
                + getRemainingBudget();
    }





}

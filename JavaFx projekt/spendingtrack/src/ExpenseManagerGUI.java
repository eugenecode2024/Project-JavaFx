import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;




public class ExpenseManagerGUI extends Application {
    private List<Expense> expenses = new ArrayList<>();
    private budget Budget = new budget(20000.00);// budget is initialize to 20000 .I might do function later
    // to allow user to add budget
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Expense Manager");


        //Create UI element

        TextField descriptionField = new TextField();
        descriptionField.setPromptText("Description");

        TextField amountField = new TextField();
        amountField.setPromptText("Amount");

        TextField categoryField = new TextField();
        categoryField.setPromptText("Category");
        Button addButton = new Button ("Add Expense");
        Button viewExpenseButton = new Button ("View Expense ");
        Button viewBudgetButton = new Button("View Budget");

        TextArea outputArea = new TextArea ();
        outputArea.setEditable(false);

        addButton.setOnAction(e->{
            String  description = descriptionField.getText();
            double  amount = Double.parseDouble(amountField.getText());
            String category = categoryField.getText();
            addExpense(description, amount, category);
            descriptionField.clear();
            amountField.clear();
            categoryField.clear();

        });

        viewExpenseButton.setOnAction(e -> viewExpenses(outputArea));
        viewBudgetButton.setOnAction(e-> viewBudget(outputArea));
        VBox vbox = new VBox(descriptionField, amountField, categoryField, addButton, viewExpenseButton , viewBudgetButton, outputArea);
        Scene scene = new Scene(vbox, 400, 300);

        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private void addExpense(String description, double amount, String category) {
        Expense expense = new Expense(description, amount, category);
        expenses.add(expense);
        budget.addExpense(amount);
    }

    private void viewExpenses(TextArea outputArea) {
        outputArea.clear();
        for (Expense expense : expenses) {
            outputArea.appendText(expense.toString() + "\n");
        }
    }

    private void viewBudget(TextArea outputArea) {
        outputArea.clear();
        outputArea.appendText(Budget.toString() + "\n");

    }


}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expense_income_tracker;

/**
 *
 * @author anant
 */
public class ExpenseIncomeEntry {
    
    private String date;
    private String description;
    private double amount;
    private String type;
    private String Category;
    
    
    public ExpenseIncomeEntry(String date, String description, double amount, String type, String Category){
        this.date =date;
        this.description = description;
        this.amount = amount;
        this.type = type;
        this.Category = Category;
        
    }
    
    
    public String getDate(){ return date;}
    public String getDescription(){ return description;}
    public double getAmount(){ return amount;}
    public String getType(){ return type;}
    public String getCategory(){ return Category;}

}
      
 
      

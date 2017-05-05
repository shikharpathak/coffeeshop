/*
* This class keeps the details of the products Sold.
* In this Class variable id keeps the name of the product sold.
* sale keeps the number of units of products Sold.
* sellingPrice keeps the Selling Price per unit of the Product Sold.
* totalAmount keeps the total Amount of the Product sold i.e. number of units * selling price per piece of the products sold.
*/
package inventory;

/**
 *
 * @author Shikhar Pathak
 */
public class Sales implements Serializable{
    
    private String id;//to hold the name
    private int sale;//to hold the number of units
    private double sellingPrice;//to hold the selling proce of the priducts sold
    private double totalAmount;//total amount of product sold
    
    Sales(String id, int sale , double sellingPrice)//Constructor to initialize the variables
    {
        this.id=id;
        this.sale=sale;
        this.sellingPrice=sellingPrice;
        this.totalAmount=this.sale*this.sellingPrice;
    }
    
    
    public String getDetails()//to get all the details as a String
    {
        return "Sold Item  :  "+ this.id + "\nNumber of items Sold  :  " + this.sale + "\nPrice per unit of product sold  :  "+ this.sellingPrice  +  "\nTotal sales  :  "+this.totalAmount;
    }
    
    
    
    public void setId(Strind id)
    {
        this.id=id;
    }
    
    public void setSale(int sale)
    {
        this.sale= sale;   
    }
    
    public void setSellingPrice(double sellingPrice)
    {
        this.sellingPrice=sellingPrice;
    }
    
    public void setTotalIncome()
    {
        this.totalAmount=this.sale*this.sellingPrice;
    }
    
    
    public String getId()
    {
        return this.id;
    }
    
    public int getSale()
    {
        return this.sale;
    }
    
    public double getSellingPrice()
    {
        return this.sellingPrice;
    }
    
    public double getTotalAmount()
    {
        return this.totalAmount;
    }
    
            
}

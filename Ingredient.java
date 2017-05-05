/**
* This Class is made to keep the record of the raw materials used in our coffee Shop.
* Here Id keeps the record of the name the matrial we wish to add.
* Count keeps the number of units of the Item added.
* Price keep the price per unit cost of the material purchased.
* Total Cost calculates the total cost of the material purchased i.e price per unit * number of units purchased.
* getDetail methof returns all the values as a single String.
*/
package inventory;

/**
 *
 * @author Shikhar Pathak
 */
public class Ingredient  {

    private String id;
    private int count;
    private double price;
    private double totalCost;
    Ingredient(String id, int  count , double price)
    {
        this.id=id;
        this.count=count;
        this.price=price;
        this.totalCost=price*count;
    }
    public String getDetails()
    {
        return "  Product " +  id + " Number of items " + count + "Price  " + price;
    }
    public void setId(String id)
    {
        this.id=id;
    }
    public void setCount(int count)
    {
        this.count=count;
    }
    public void price(double price)
    {
        this.price=price;
    }
    public void settotalCost(int count , double price)
    {
        totalCost=count*price;
    }
    public double getTotalCost()
    {
        return totalCost;
    }
    public String getId()
    {
        return id;
    }
    public int getCount()
    {
        return count;
    }
    public double getPrice()
    {
       return price;
    }
    
}

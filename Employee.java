
package inventory;
/**
 *This class is developed to keep the records of the employees working in the shop.
 * Here we store their Id, and Name and Salary.
 * getDetails method returns their complete record as a single String
 * 
 * @author Shikhar Pathak
 */
class Employee 
 
{
    private String Name;//To Store the name of Employee
    private String Id;//To Store the Id of the Employee
    double Salary;//To Store the Salary of the Employee
    
Employee(String Name, String ID, double salary)//Constuctor to initialize the variables
    {
        this.Name=Name;
        this.Id=ID;
        this.Salary=salary;
    }
    
    
public String getDetails()//Method to return their complete record as a single String
    {
        return "Name : " + this.Name + " : Id: " + this.Id + "    Salary :" +this.Salary;
    }    
    

void setName(String name)
    {
        this.Name=name;    
    }

void setID()
    {
        this.Id=Id;
    }

void setSalary(double salary)
    {
        this.Salary=salary;
    }



public String getName()
    {
        return Name;
    }

public String getId()
    {
        return Id;
    }

public double getSalary()
    {
        return Salary;
    }
    
}

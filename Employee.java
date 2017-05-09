
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
    private String name;//To Store the name of Employee
    private String id;//To Store the Id of the Employee
    private Date hireDay;
    double salary;//To Store the Salary of the Employee
    
Employee(String name, String id, double salary)//Constuctor to initialize the variables
    {
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    
    
public String getDetails()//Method to return their complete record as a single String
    {
        return "Name : " + this.Name + " : Id: " + this.Id + "    Salary :" +this.Salary;
    }    
    
public void setHireDay(int year, int month , int day)
{
 Date newHireDay=new GregorianCalendar(year, month -1, day).getTime();
 hireDay.setTime(newHireDay.getTime());
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

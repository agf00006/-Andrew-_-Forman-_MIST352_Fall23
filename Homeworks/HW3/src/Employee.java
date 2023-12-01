/**
Andrew Forman
MIST 352
HW3
ChatGPT was not used
**/

import java.util.Date;

public class Employee {
    private String name;
    private String dateOfBirth;
    private String role;
    private int employeeId;
    private String email;
    private double salary;
    private boolean aboveAvg ;
    private String bar;

    // Constructor 
    /**
     * You need to code this
     * This constructor accepts one line from a text file
     * It should split it up and initialize all attributes in this class using the values from the line
     * For example, name should equal to the first portion of the splited line and dateOfBirth is second and so on.
     * Lastly, set aboveAvg to false 
     * @param line
     */
    //Splits employee data by commas, trims and sets dataparts 
    //"parse" converts string values to int, double, etc.
    public Employee(String line)   		
    		 {
    	String[] parts = line.split(",");
        name = parts[0].trim();
        dateOfBirth = parts[1].trim();
        role = parts[2].trim();
        employeeId = Integer.parseInt(parts[3].trim());
        email = parts[4].trim();
        salary = Double.parseDouble(parts[5].trim());
        setAboveAvg(salary);
    }
    
    /**
     * You need to code this
     * This method accepts the average salary from the main and decide whether this employee's salary is above average or not
     * If it is, then set aboveAvg to true
     * @param intAverage
     */
    //Sets aboveAvg to true if salary is above the average
   public void setAboveAvg(double dblAverage)
   {
	  if (aboveAvg = salary > dblAverage)
	  {aboveAvg = true;}
   }
	
   /**
	 * You need to code this.
	 * This method accepts an employee's salary and returns a bar chart of stars representation of the salary
	 * For example, 
	 * 				if the salary is 60,000, then the bar should return 6 stars:  ******
	 * 				if the salary is 95,600, then the bar should return 9 stars:  *********
	 * @param salary: the employee salary
	 * @return bar: representation in start of the salary. Each * represents $10,000
	 */
   //Repeats "*" for every 10000 salary
   public String SalaryBarChart(double salary) {
			
	   int stars = (int) (salary / 10000);
       return "*".repeat(stars);
	    	}
   
   /**
    * You need to code this.
    * This method provides a summary of each employee.
    * It returns a string formatted to include: employee name, employee ID, the bar chart of the salary, and whether salary is above average or not.
    * @return : Formatted string of employees basic information.
    */
   //Couldn't figure out case 6 :(
   public String SummerizeEmployee()
	 
	 {
	   String summary = "Name: " + name + "\n" + "Employee ID: " + employeeId + "\n" + "Salary Bar Chart: "
               + SalaryBarChart(salary) + "\n" + "Above Average: " + aboveAvg + "\n";

       return summary;
   }
	 }
	 



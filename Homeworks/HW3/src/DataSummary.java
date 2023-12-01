/**
Andrew Forman
MIST 352
HW3
ChatGPT was used
Prompt: Existing code was provided, no additional instructions were necessary
**/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * 
 *
 */
public class DataSummary {
	private String fileLocation;
	private double averageSalary;
	
	/**
	 * Keep as is
	 * Constructor. 
	 * @param file
	 * @throws FileNotFoundException 
	 */
	public DataSummary(String file) throws FileNotFoundException
	{
		this.fileLocation = file;
		this.averageSalary = getAverage();
		
	}
	
	/**
	 * You need to code this
	 * This method opens the employee data file and returns the average salary of all employees in the data
	 * @param strFile: Location of the text file from the main
	 * @return dblSum: the Average of all salaries
	 * @throws FileNotFoundException: if file is not found, this is thrown
	 */
	//getAverage method sums total salaries and divides by the count of all salaries
	public double getAverage() throws FileNotFoundException
	{ File myFile = new File(fileLocation);
    Scanner inputFile = new Scanner(myFile);
    int count = 0;
    double totalSalary = 0;

    while (inputFile.hasNextLine()) {
        String strData2Show = inputFile.nextLine();
        String[] dataParts = strData2Show.split(",");
        double salary = Double.parseDouble(dataParts[5]);
        totalSalary += salary;
        count++;
    }
    inputFile.close();

    if (count > 0) {
        return totalSalary / count;
    } else {
        return 0;
    }
	}
	

	/**
	 * You need to code this
	 * This method should printout all employees and their IDs to the console.
	 * @throws FileNotFoundException: Thrown if file is not found.
	 */
	//Scans text file to find name and ID for every employee, formats and prints
	public void ViewEmployeeAndIDs() throws FileNotFoundException
	{
	
		
		File data = new File(fileLocation);
		Scanner scnReader = new Scanner(data);
		while(scnReader.hasNext())
		{String strLine = scnReader.nextLine();
		String EmployeeAndID = String.format("Name: %s    ID:   %s", strLine.split(",")[0],
				strLine.split(",")[3]);
		System.out.println(EmployeeAndID);
		
		
	        }
	        scnReader.close();
	}

	
	/**
	 * You need to code this
	 * This method accepts an employee name (first, last, or both) and searches for all employee with that name
	 * It should printout all employee's info to a GUI, otherwise, it should printout Not Found
	 * @param strEmployee: Employee name 
	 * @throws FileNotFoundException: Thrown if file is not found.
	 */
	//Scans text file for name provided by user, Prints employee info for employees with that name
	public void SearchEmployee(String strEmployee) throws FileNotFoundException
	{
		File myFile = new File(fileLocation);
        Scanner inputFile = new Scanner(myFile);
        boolean found = false;

        while (inputFile.hasNextLine()) {
            String strData2Show = inputFile.nextLine();
            if (strData2Show.contains(strEmployee)) {
                found = true;
                String[] dataParts = strData2Show.split(",");
                String employeeInfo = String.format("%s, %s, %s, %s, %s, %s",
                        dataParts[0], dataParts[1], dataParts[2], dataParts[3], dataParts[4], dataParts[5]);
                JOptionPane.showMessageDialog(null, employeeInfo);
            }
        }

        inputFile.close();

        if (!found) {
            JOptionPane.showMessageDialog(null, "Not Found");
        }
	}
	
	/**
	 * You need to code this
	 * This method accepts an employee role (i.e., position) and views for all employee in that role
	 * It should printout all employee's info to a GUI, otherwise, it should printout Not Found
	 * @param strRole: Employee role 
	 * @throws FileNotFoundException: Thrown if file is not found.
	 */
	//Scans text file for role provided by user, Prints employee info for employees with that role
	public void ViewEmployeeForRole(String strRole) throws FileNotFoundException
	{ File myFile = new File(fileLocation);
    Scanner inputFile = new Scanner(myFile);
    boolean found = false;

    while (inputFile.hasNextLine()) {
        String strData2Show = inputFile.nextLine();
        String[] dataParts = strData2Show.split(",");
        if (dataParts[2].contains(strRole)) {
            found = true;
            String employeeInfo = String.format("%s %s %s",
                    dataParts[0], dataParts[3], dataParts[4]);
            JOptionPane.showMessageDialog(null, employeeInfo);
        }
    }

    inputFile.close();

    if (!found) {
        JOptionPane.showMessageDialog(null, "Not Found");
    }
		

		
	}
	
	/**
	 * Keep as is.
	 * This method displays the distinct roles in the text file
	 * @throws FileNotFoundException 
	 */
	public void ViewRoles() throws FileNotFoundException
	{	
		       
		        File myFile = new File(fileLocation);
		        Scanner inputFile = new Scanner(myFile);
		        Set<String> distinctRoles = new HashSet<>();

		        while(inputFile.hasNextLine()) {
		            String strData2Show = inputFile.nextLine();
		            // Splitting the line by comma
		            String[] dataParts = strData2Show.split(",");
		            // The role is the third element in the array (index 2)
		            distinctRoles.add(dataParts[2]);
		        }
		        inputFile.close();
		        String strRole="";
		        // Displaying distinct roles
		        for (String role : distinctRoles) {
		        	strRole = strRole + role + "\n";
		            //System.out.println(role);
		        }
		        JOptionPane.showMessageDialog(null, strRole);
		    }
	
}
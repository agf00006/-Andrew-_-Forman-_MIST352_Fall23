/**
Andrew Forman
MIST 352
HW3
ChatGPT was not use
**/

/**
 * @author MJ
 *
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JOptionPane;

public class HW3 {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {
	//****** Keep as is *******************
		// The location of the employee text file 
		String strDataLocation ="src/EmployeeData.txt";
		String strOutputLocation ="src/EmployeeSummary.txt";
		File myFile = new File(strDataLocation);
		Scanner inputFile = new Scanner (myFile);
		PrintWriter writer =new PrintWriter(strOutputLocation);
		int intChoice  = Integer.parseInt( JOptionPane.showInputDialog(null,  ViewOptions()));
		DataSummary myData = new DataSummary(strDataLocation);
	//*************************************
//Creates switch case for each option given by user
		
		while(intChoice !=0)
		{
			switch(intChoice)
			{ case 1:
                // View Employees and IDs
                myData.ViewEmployeeAndIDs();
                break;

            case 2:
                // Search for Employee
                String searchEmployee = JOptionPane.showInputDialog(null, "Enter employee name:");
                myData.SearchEmployee(searchEmployee);
                break;

            case 3:
                // View current roles
                myData.ViewRoles();
                break;

            case 4:
                // View employees for a certain role
                String roleToView = JOptionPane.showInputDialog(null, "Enter role to view employees:");
                myData.ViewEmployeeForRole(roleToView);
                break;

            case 5:
                // View Average Salary
                double averageSalary = myData.getAverage();
                JOptionPane.showMessageDialog(null, "Average Salary: $" + averageSalary);
                break;
                
            case 6:

            	
            	
			
			}
			intChoice  = Integer.parseInt( JOptionPane.showInputDialog(null,  ViewOptions()));	
		}


		writer.close();
		inputFile.close();	
		
	}
	/**	 
	 * Keep as is
	 * A method to display options
	 * @return : The options to display in the GUI
	 */
	
	public static String ViewOptions()
	{
		String strMessageToDisplay="Choose an option:"
				+ "\n0.\tExit"
				+ "\n1.\tView Employees and IDs"
				+ "\n2.\tSearch for Employee"
				+ "\n3.\tView current roles"
				+ "\n4.\tView employees for a certain role"
				+ "\n5.\tView Average Salary"
				+ "\n6.\tSummerize and Write data";
		return strMessageToDisplay;
	} }
	
	
	
	



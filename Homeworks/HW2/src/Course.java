/**
 * 
 */

/**
 * 
 */
public class Course {
private String courseCode;
private String courseTitle;
private String InstructorName;
private int maximumCapacity;
private int currentEnrollment;
//Constructor for Course
public Course(String cCode, String cTitle, String cName) {
	courseCode=cCode;
	courseTitle=cTitle;
	InstructorName=cName;
	maximumCapacity=30;
	currentEnrollment=29;
}
//setters and getters
public void setcourseCode(String Code)
{	courseCode=Code;
	}
public void setcourseTitle(String Title)
{	Title=courseTitle;
	}
public void setInstructorName(String Name)
{	Name=InstructorName;
	}
public String getcourseCode()
{	return courseCode;
	}
public String getcourseTitle()
{	return courseTitle;
	}
public String getInstructorName()
{	return InstructorName;
	}
public int getmaximumCapacity()
{	return maximumCapacity;
	}
public int getcurrentEnrollment()
{	return currentEnrollment;
}

//method to enroll students

public boolean enrollStudent(Student student) {
    if (currentEnrollment < maximumCapacity) {
        currentEnrollment++;    
        return true;
    } else {
        return false;}}}



	

	




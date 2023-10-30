
public class HW2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Course course1 = new Course("MIST352", "Businsess Application Programming","MJ Ahmad");
		Course course2 = new Course("CS101", "Introd. to Computer Science","Sarah Jones");
		Student student1 = new Student("Ashley Jaber");
		Student student2 = new Student("Ali June");
		
		
		//Set test scores for MIST 352 and CS101 for student1
		
		TestScores student1Course1Scores = new TestScores(68.9,89.5,91.2);
		TestScores student1Course2Scores = new TestScores(75.5,82.4,65.3);
		
		
		//Keep If statements the way they are.
		if (course1.enrollStudent(student1)) 
			{				
			System.out.println("Enrolling " + student1.getName() + " in " + course1.getcourseCode() + " successful");
			System.out.println("Current Enrollment " + course1.getcurrentEnrollment());	
			System.out.println("The current GPA is: " + student1Course1Scores.getAverageScore());
			}

		else
			{	
			System.out.println("Enrolling " + student1.getName() + " in " + course1.getcourseCode() + " not successful");			
			}
			
		if (course2.enrollStudent(student1))
			{	
			System.out.println("Enrolling " + student1.getName() + " in " + course2.getcourseCode() + " successful");
			System.out.println("Current Enrollment " + course2.getcurrentEnrollment());
			System.out.println("The current GPA is: " + student1Course2Scores.getAverageScore());
			}

		else
			{	
			System.out.println("Enrolling " + student1.getName() + " in " + course2.getcourseCode() + " not successful");			
			}
		
		
		
		if (course1.enrollStudent(student2))
			{	
			System.out.println("Enrolling " + student2.getName() + " in " + course1.getcourseCode() + " successful");
			System.out.println(course1.getcurrentEnrollment());
			
			}

		else
			{	
			System.out.println("Enrolling " + student2.getName() + " in " + course1.getcourseCode() + " not successful");			
			}
		
		if (course2.enrollStudent(student2)) 
			{
			System.out.println("Enrolling " + student2.getName() + " in " + course2.getcourseCode() + " successful");
			System.out.println(course1.getcurrentEnrollment());
			
			}
		else
			{
			System.out.println("Enrolling " + student2.getName() + " in " + course2.getcourseCode() + " not successful");	
			}
		//Add your code below for question 8

		System.out.println(student1.getName() + "'s GPA in " + course1.getcourseCode() + " is " + 
		student1Course1Scores.getAverageScore() + ", which is greater than their GPA in " + 
				course2.getcourseCode() + " of " + student1Course2Scores.getAverageScore());
	}

}

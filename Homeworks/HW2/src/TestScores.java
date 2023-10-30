/**
 * 
 */

/**
 * 
 */
public class TestScores {
private double score1;
private double score2;
private double score3;
//Constructor for TestScores
public TestScores(double sc1, double sc2, double sc3)
{
	score1=sc1;
	score2=sc2;
	score3=sc3;
	}
//setters and getters
public void setScore1(double s1)
{	s1=score1;
	}
public void setScore2(double s2)
{	s2=score2;
	}
public void setScore3(double s3)
{	s3=score3;
	}
public double getScore1()
{	return score1;
	}
public double getScore2()
{	return score2;
	}
public double getScore3()
{	return score3;
	}
//average score calculation
public double getAverageScore()
{	return (score1 + score2 + score3)/3;
	}


}

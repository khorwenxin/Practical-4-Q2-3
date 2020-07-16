
public class TestStudent {

    public static void main (String [] args) {
    	Student stud1 = new Student();
    	Student stud2 = new Student("19WMD01900", "Cat");
    	stud1.setStudentID("19WMD01888");
    	stud1.setStudentName("Sam");
    	
    	stud1.addQuiz(5);
    	stud2.addQuiz(10);
    	
    	stud1.addQuiz(10);
    	stud2.addQuiz(10);
    	
    	stud1.setContribution(20);
    	
    	System.out.println("Student ID    : " + stud1.getStudentID());
    	System.out.println("Student Name  : " + stud1.getStudentName());
    	System.out.println("Number Scored : " + stud1.getNumQuiz());
    	System.out.println("Total Score   : " + stud1.getTotalScore());
    	System.out.println("Average Score : " + stud1.getAverageScore());
    	System.out.println("Contribution  : " + stud1.getAverageScore()/10 * Student.getContribution());
    	System.out.println("");
    	System.out.println("Student ID    : " + stud2.getStudentID());
    	System.out.println("Student Name  : " + stud2.getStudentName());
    	System.out.println("Number Scored : " + stud2.getNumQuiz());
    	System.out.println("Total Score   : " + stud2.getTotalScore());
    	System.out.println("Average Score : " + stud2.getAverageScore());
    	System.out.println("Contribution  : " + stud2.getAverageScore()/10 * Student.getContribution());
    	
    }
    
    
}
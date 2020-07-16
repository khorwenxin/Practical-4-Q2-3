
public class Student {
	
	private String studentID;
	private String studentName;
	private int numQuiz;
	private int totalScore;
	private static double contribution;

/*   Q2 	
    public Student() {
    }
     public Student(String id, String name ) {
   	 studentID = id;
   	 studentName = name;
    }
    
    public Student(String id, String name ) {
    	studentID = id;
    	studentName = name;
    }
    
    public void setStudentID(String id){
    	studentID = id;
    }
    
    public String getStudentID(){
    	return studentID;
    }
    
    public void setStudentName(String name){
    	studentName = name;
    }
    
     public String getStudentName(){
    	return studentName;
    }
    
    
    public void addQuiz(int score){
     	if (score < 10 || score > 10)
     	{
     		System.out.println("Error");
     	}
     	else
     	{
     		numQuiz++;
     		totalScore += score;
     	}
    }
    
    public int getNumQuiz(){
    	return numQuiz;
    }
    
    public int getTotalScore(){
    	return totalScore;
    }
    
    public double getAverageScore(){
    	return totalScore/(double)numQuiz;
    }
    */
    
     public Student() {
     	this("","");
    }
  
    public Student(String studentID, String studentName ) {
    	this.studentID = studentID;
    	this.studentName = studentName;
    }
    
    public String getStudentID(){
    	return studentID;
    }
    
     public String getStudentName(){
    	return studentName;
    }
    
    public void setStudentID(String studentID){
    	this.studentID = studentID;
    }
    
    public void setStudentName(String studentName){
    	this.studentName = studentName;
    }
    
    public void addQuiz(int totalScore){
     	if (totalScore < 10 || totalScore > 10)
     	{
     		System.out.println("Error");
     	}
     	else
     	{
     		numQuiz++;
     		this.totalScore += totalScore;
     	}
    }
    
    public int getNumQuiz(){
    	return numQuiz;
    }
    
    public int getTotalScore(){
    	return totalScore;
    }
    
    public double getAverageScore(){
    	return totalScore/(double)numQuiz;
    }
    
    public static void setContribution (double contribution){
    	Student.contribution = contribution;
    }
    
    public static double getContribution(){
    	return contribution;
    }
}
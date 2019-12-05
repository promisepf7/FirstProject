package com.student.main;

import java.util.TreeMap;


/**
* <h1>Highest student score average</h1>
* The StudentsScore program implements an application that list
* highest average mark for a student
*
* @author  Promise Francis
* @version 1.0
* @since   11/19/2019 
*/
public class StudentsScore {
	
	public static void main(String[] args) {	
		
		//Calculate highest score
		calculateAverageScore();	
	}
	
	/**
	   * This method is used to calculate Highest student score average details
	   * 
	   */
	public static void calculateAverageScore(){	
		//Treemap to hold student details
		TreeMap<String,Student> studentMarksMap = new TreeMap<String,Student>();
		Student student = null;
		Student rankOneStudent=null;
		Float highAverage =0.0f;
		Float mark= 0.0f;
		// Setting student name and mark details
		Object[][] studMarks=studentMarks();
		
		//iterating Student object array and add the student details to studetMap
		for(int i=0;i<studMarks.length;i++){
			for(int j=0;j<studMarks[i].length;j=j+2){				
				//add new students to map if not present
					if(studentMarksMap.get(studMarks[i][j])==null){
						student = new Student();
						student.setName(studMarks[i][j].toString());
						mark =Float.parseFloat(studMarks[i][j+1].toString());
						student.setScore(mark);
						student.setSubject(1);
						studentMarksMap.put(student.getName(), student);
						
					}
					//update student details if already available in map
					else{
						student =studentMarksMap.get(studMarks[i][j]);
						mark = student.getScore();
						mark = (mark+ Float.parseFloat(studMarks[i][j+1].toString()));
						student.setScore(mark);
						student.setSubject(student.getSubject()+1);
						studentMarksMap.put(student.getName(), student);
						}				
			}
			//checking rank one student by setting highest average and student details in each iteration 
			if(rankOneStudent == null || highAverage < studentMarksMap.get(studMarks[i][0]).getScore()/studentMarksMap.get(studMarks[i][0]).getSubject()){
				highAverage = studentMarksMap.get(studMarks[i][0]).getScore()/studentMarksMap.get(studMarks[i][0]).getSubject();
				rankOneStudent = studentMarksMap.get(studMarks[i][0]);
			}			
		}
		//Display student Name and highest average score
		System.out.println(rankOneStudent.getName() +" : " + rankOneStudent.getScore()/rankOneStudent.getSubject());		
		
	}
	
	/**
	   * This method is used to set students details
	   * @return Object[][] This returns array of student name and score
	   */
	public static Object[][] studentMarks(){		
		Object[][] studMark={{"Bob",new Integer(80)},{"Charles",new Integer(85)},{"Rob",new Integer(70)},{"Bob",new Integer (100)},{"Charles",new Integer(75)}};
		return studMark;		
	}

}

/**
* <h1>Student Details</h1>
* Class to hold students details
*
* @author  Promise Francis
* @version 1.0
* @since   11/19/2019 
*/
class Student{
	
	String name;
	Float score;
	Integer subject;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getScore() {
		return score;
	}
	public void setScore(Float score) {
		this.score = score;
	}
	public Integer getSubject() {
		return subject;
	}
	public void setSubject(Integer subject) {
		this.subject = subject;
	}
	
	
}

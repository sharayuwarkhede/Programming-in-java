//Student management system using method overloading
//A university need a system where a students academic performance can be evaluated in different formats
//based on percentage based grading,letter grade,GPA
import java.util.*; 
class Student{
    private String name;//do not want anyone from outside to directly change the name concept of encapsulation
    //constructor for initialising the student name 
    //constructor must be accessible from outside the class
    public Student(String name) {
        this.name= name;
     }
    public void calculateGrade(double percentage){
        if(percentage>=90){
            System.out.println(name +" had secured Grade O");
        }
        else if(percentage>=80){
            System.out.println(name +" had secured Grade A");
        }
        else if(percentage>=70){
            System.out.println(name +" had secured Grade B");
        }
        else if(percentage>=60){
            System.out.println(name +" had secured Grade C");
        }
        else if(percentage>=50){
            System.out.println(name +" had secured Grade D");
        }
        else{
            System.out.println(name +" had failed");
        }
    }
    public void calculateGrade(char lettergrade){
        switch(lettergrade){
            case 'A':
                System.out.println(name+" has excellent performance with Grade O");
                break;
            case 'B':
                System.out.println(name+" has good performance with Grade A");
                break;
            case 'C':
                System.out.println(name+" has average performance with Grade B");
                break;
            case 'D':
                System.out.println(name+" has satisfactory performance with Grade C");
                break;
            case 'E':
                System.out.println(name+" has poor performance with Grade D");
                break;
            default:
                System.out.println(name +" has failed");
      }
    }
    public void calculateGrade(float gpa){
        if(gpa>=9){
            System.out.println(name +" has secured Grade O");
        }
        else if(gpa>=8){
            System.out.println(name +" has secured Grade A");
        }
        else if(gpa>=7){
            System.out.println(name +" has secured Grade B");
        }
        else if(gpa>=6){
            System.out.println(name +" has secured Grade C");
        }
        else if(gpa>=5){
            System.out.println(name +" has secured Grade D");
        }
        else {
            System.out.println(name +" has failed");
        }
    }
}
public class StudentManagementSystem {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Student student =new Student ("Sharayu Warkhede");
        student.calculateGrade(97.3);
        student.calculateGrade('A');
        student.calculateGrade(9.7f);
    }
    
}

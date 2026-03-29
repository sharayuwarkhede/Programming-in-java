import java.util.*;
class Student
{
int rollno;
String name;
int marks[]=new int [5];
double grade;
int i;
Student() { }//default constructor
void accept()
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Roll no:");
    rollno = sc.nextInt();//accepting rollno
    System.out.print("Name:");
    sc.nextLine();//clear buffer
    name= sc.nextLine();//accepting name
    System.out.println("Enter the marks of student out of 20.");
    //accepting marks
    for(i=0;i<5;i++){
        System.out.print("Marks in Subject "+(i+1)+":");
        marks[i]=sc.nextInt();
    }
    System.out.println("---------------------------------------");
}
double Gradecal()//calculating grade
{
    grade=0;
    for(i=0;i<5;i++){  
        grade=grade+marks[i];  
    }
    return grade/10;
}
}

public class Assignment6B {
    public static void main(String []args){
        //Scanner sc = new Scanner(System.in);
        int i;
        Student s[] = new Student[10];//array of object
        List<String>stud = new ArrayList<>();//arraylist
        //Accept details for 10 students
        for(i=0;i<10;i++){
            System.out.println("Enter the details of student "+(i+1)+":");
            s[i]=new Student();
            s[i].accept();
            s[i].grade = s[i].Gradecal(); //variable=method
        }
        //Display the student details whose grade>8
        System.out.println("-----------Top band students----------");
        for(i=0;i<10;i++){
            double avg = s[i].Gradecal(); //this stores the return value of gradecal
            if(avg>8){
                stud.add(s[i].name);
            }
        }
        System.out.print(stud);

   } 
}

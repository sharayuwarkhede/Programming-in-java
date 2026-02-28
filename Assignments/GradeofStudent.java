import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int[] marks = new int[5];
    int total=0;
    double percent;

    void accept() {
        Scanner sc = new Scanner(System.in);//creating object of scanner

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();//read an integer value from user

        sc.nextLine(); // clear buffer

        System.out.print("Enter Name: ");
        name = sc.nextLine();//reads an string value from user

        System.out.println("Enter subject wise marks:");
        for (int i = 0; i < 5; i++) 
        {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            if(marks[i]>50)
            {
                System.out.println("Invalid input:"); 
            }
        }
    }

    void display() {
        System.out.println("Student Details are:");
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);

        System.out.println("Marks:");
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
    }
    void grade()
    {
        
        for(int i=0;i<5;i++)
        {
             total = marks[i] + total;
        }
        System.out.println("Total marks:"+ total);
        percent = (total / 250.0) * 100;//for not getting any error we take 250 in float
        System.out.println("Percent:"+ percent);
        if(percent>=90)
        {
             System.out.println("Grade of student is:"+"A+");
        }
        else if(percent>=80)
        {
             System.out.println("Grade of student is:"+"A");
        }
        else if(percent>=70)
        {
             System.out.println("Grade of student is:"+"B");
        }
        else if(percent>=60)
        {
             System.out.println("Grade of student is:"+"C");
        }   
    }
}

public class GradeofStudent{
    public static void main(String[] args) {
        Student s = new Student();//creating object of student
        s.accept();//calling the accept method
        s.display();//calling the display method
        s.grade();//calling the grade method
    }
}
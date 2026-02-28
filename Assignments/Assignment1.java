import java.util.Scanner;
class MyDate {
    int day;
    int month;
    int year;
   
    void accept(Scanner sc) // pass scanner as parameter
    {
       
        day = sc.nextInt();
        month = sc.nextInt();
        year = sc.nextInt();
    }

    void display() {

    if(year >= 1000 && year <= 9999) {

        if(month >= 1 && month <= 12) {

            int maxDays = 0;

            // Months with 31 days
            if(month == 1 || month == 3 || month == 5 || 
               month == 7 || month == 8 || month == 10 || month == 12) {
                maxDays = 31;
            }

            // Months with 30 days
            else if(month == 4 || month == 6 || 
                    month == 9 || month == 11) {
                maxDays = 30;
            }

            // February
            else if(month == 2) {

                // Leap year check
                if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    maxDays = 29;
                } else {
                    maxDays = 28;
                }
            }

            if(day >= 1 && day <= maxDays) {
                System.out.println(day + "/" + month + "/" + year);
            } else {
                System.out.println("Not a valid date!");
            }

        } else {
            System.out.println("Not a valid date!");
        }

    } else {
        System.out.println("Not a valid date!");
    }
}
    }


public class Assignment1{
    public static void main(String[] args) {
        System.out.println("Enter the dates you want to display");
        Scanner sc = new Scanner(System.in);
        //creating 5 objects
        MyDate d1 = new MyDate();
        MyDate d2 = new MyDate();
        MyDate d3 = new MyDate();
        MyDate d4 = new MyDate();
        MyDate d5 = new MyDate();
        
        d1.accept(sc);//pass the parameter here also
        d2.accept(sc);
        d3.accept(sc);
        d4.accept(sc);
        d5.accept(sc);
        System.out.println("Your Input Data is:");
        d1.display();
        d2.display();
        d3.display();
        d4.display();
        d5.display();
    }
}

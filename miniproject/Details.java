import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class Details{
    ArrayList <String> name = new ArrayList <>();//to store name of passengers
    ArrayList <Integer> age = new ArrayList <>();//to store age of passengers
    ArrayList <String> contactNo = new ArrayList <>();//to store contact number of passengers
    ArrayList <String> gender = new ArrayList <>();//to store gender of passengers
    ArrayList <String> occupation = new ArrayList <>();//to store occupation of passengers
    ArrayList <String> tripType = new ArrayList <>();//to store trip type (One Way/Round Trip) for each passenger
    
    
    //method to add details of passengers in respective arraylist
    void addDetails(String n,int a,String c,String g, String o, String t){
        name.add(n);
        age.add(a);
        contactNo.add(c);
        gender.add(g);
        occupation.add(o);
        tripType.add(t);
    }

}
//class to display seat arrangement of bus,train and airway
class Transport{
    void displaySeats(){
        System.out.println("\n\n-----Below is the reference of seat arrangement-----\n");
    }
}
//class to display seat arrangement of bus
class Bus extends Transport{
    void displaySeats(){

        super.displaySeats();//to call displaySeats method of Transport class

        int busSeat [][]= new int [8][4];
        int k=0;
        //to assign seat numbers in 2D array
        for (int i=0;i<8;i++){
            for(int j=0;j<4;j++){
                busSeat [i][j]=k+1;
                k++;
            }
        }
        //to display seat arrangement in bus
        for(int i=0;i<8;i++){
            for(int j=0;j<4;j++){
                System.out.printf("%-5d",busSeat [i][j]);//to print seat numbers in 5 spaces

                if(j==1){
                    System.out.printf("%8s","");//to print 8 spaces after 2nd seat number to show aisle
                }

            }
            System.out.println();
        }

    }
    int  bookSeat(Scanner sc, String name){
        //using arraylist to store booked seat numbers

        ArrayList <Integer> bookedSeats = new ArrayList<>();//to store booked seat numbers
        while(true){

            System.out.println("Enter the seat number you want to book: ");
            int seatno=sc.nextInt();
            if(seatno<1 || seatno>32){
                System.out.println("Invalid seat number. Please select a seat number between 1 and 32.");
            }
            else if(bookedSeats.contains(seatno)){
                System.out.println("Seat number "+seatno+" is already booked.");
            }
            else{
                bookedSeats.add(seatno);
                System.out.println("Seat number "+seatno+" has been booked for "+name+".");
                return seatno;
            }
        }
    }
}
//class to display seat arrangement of airway
 class Airway extends Transport{
    void displaySeats(){

        super.displaySeats();//to call displaySeats method of Transport class

        int airwaySeat [][]= new int [10][8];

        int k=0;
        //to assign seat numbers in 2D array
        for (int i=0;i<10;i++){
            for(int j=0;j<8;j++){
                airwaySeat [i][j]=k+1;
                k++;
            }
        }

        //to display seat arrangement in airway
        for(int i=0;i<10;i++){
            for(int j=0;j<8;j++){
                System.out.printf("%-4d",airwaySeat[i][j]);//to print seat numbers in 4 spaces

                if(j==2 || j==4){
                    System.out.printf("     ");//to print 5 spaces after 3rd and 5th seat number to show aisle
                }

            }
            System.out.println();
        }

    }
    int bookSeat(Scanner sc, String name){
        //using arraylist to store booked seat numbers

        ArrayList <Integer> bookedSeats = new ArrayList<>();//to store booked seat numbers
        while(true){

            System.out.println("Enter the seat number you want to book: ");
            int seatno=sc.nextInt();
            if(seatno<1 || seatno>80){
                System.out.println("Invalid seat number. Please select a seat number between 1 and 80.");
            }
            else if(bookedSeats.contains(seatno)){
                System.out.println("Seat number "+seatno+" is already booked.");
            }
            else{
                bookedSeats.add(seatno);
                System.out.println("Seat number "+seatno+" has been booked for "+name+".");
                return seatno;
            }
        }
       
     }
}
//class to display seat arrangement of train
class Train extends Transport{
     void displaySeats(){
        super.displaySeats();//to call displaySeats method of Transport class
     }
        int bookSeat(Scanner sc, String name){
            //using arraylist to store booked seat numbers
    
            ArrayList <Integer> bookedSeats = new ArrayList<>();//to store booked seat numbers
            while(true){
    
                System.out.println("Enter the seat number you want to book: ");
                int seatno=sc.nextInt();
                if(seatno<1 || seatno>72){
                    System.out.println("Invalid seat number. Please select a seat number between 1 and 72.");
                }
                else if(bookedSeats.contains(seatno)){
                    System.out.println("Seat number "+seatno+" is already booked.");
                }
                else{
                    bookedSeats.add(seatno);
                    System.out.println("Seat number "+seatno+" has been booked for "+name+".");
                    return seatno;
                }
            }
        }
}
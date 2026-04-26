import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JavaMiniProject_3 {
     public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String passName;
        String passGender = null;
        int passAge=0;
        String passContact;

        //int detailChoice;
        Details dt=new Details();//object of Details class to store details of passengers
        FareCalculation fc=new FareCalculation();//object of FareCalculation class to calculate fare for bus,train and airway journey


        System.out.print("\n\nEnter number of passengers: ");
        int noOfPassg=sc.nextInt();
        sc.nextLine();//to consume the newline character after nextInt() method


        for(int i=0;i<noOfPassg;i++){

            System.out.println("\n\nAdd details of Passenger"+" "+ (i+1) );

            System.out.print("\nEnter Passenger Name: ");
            passName=sc.nextLine();

            System.out.print("Enter Passenger's Gender [Female/Male] : ");
            passGender=sc.nextLine();

            System.out.print("Enter Passenger's Age: ");
            passAge=sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Passenger's Contact Number: ");
            passContact=sc.nextLine();

            System.out.print("Enter Passenger's Occupation (Student/Other): ");
            String passOccupation=sc.nextLine();

            System.out.print("Trip Type (One Way/Round Trip): ");
            String passTripType=sc.nextLine();

            dt.addDetails(passName,passAge,passContact,passGender, passOccupation, passTripType);//to add details of passengers in respective arraylist

        }

        ArrayList <String> destinationList= new ArrayList<>();
        //to add destinations in destinationList arraylist using addAll() method and Arrays.asList() method
        System.out.println("\n-----Below is the list of destinations-----\n");
        destinationList.addAll(Arrays.asList("Mumbai","Nagpur","Sambhajinagar","Thane","Delhi","Ahmedabad","Surat",
            "Bhopal","Indore","Lucknow","Patna","Panaji","Bengaluru","Chennai","Hyderabad","Kolkata","Jaipur",
            "Agra","Chandigarh","Coimbatore","Gwalior","Amritsar","Dehradun","Srinagar","Udaipur","Raipur","Kanpur",
            "Satara","Kolhapur","Solapur","Nashik","Sangli","Latur","Dhule","Buldhana","Jalgaon","Jalna","Amaravati","Shimla",
            "Shillong"," Gangtok","Aizawl"));

        System.out.println("\n\n"+destinationList);

        ArrayList <String> busJourney= new ArrayList<>(); 
        //to add destinations in busJourney arraylist using addAll() method and Arrays.asList() method
        busJourney.addAll(Arrays.asList("Mumbai","Nagpur","Sambhajinagar","Thane","Ahmedabad","Surat","Indore","Lucknow",
            "Panaji","Bengaluru","Chennai","Hyderabad","Kolkata","Jaipur","Satara","Kolhapur","Solapur","Nashik","Sangli",
            "Latur","Dhule","Buldhana","Jalgaon","Jalna","Amaravati"));

        ArrayList <String> trainJourney= new ArrayList<>(); 
        //to add destinations in trainJourney arraylist using addAll() method and Arrays.asList() method
        trainJourney.addAll(Arrays.asList("Mumbai","Nagpur","Delhi","Ahmedabad","Bhopal","Lucknow","Patna",
             "Panaji","Bengaluru","Chennai"," Hyderabad","Kolkata","Jaipur","Agra","Chandigarh","Amritsar","Dehradun",
            "Srinagar","Udaipur","Jalgaon","Latur","Dhule","Shimla"));

        ArrayList <String> airwayJourney= new ArrayList<>(); 
               
        airwayJourney.addAll(Arrays.asList("Mumbai","Nagpur","Ahmedabad","Lucknow", "Panaji","Bengaluru","Delhi",
             "Bengaluru","Chennai","Hyderabad","Kolkata","Jaipur","Chandigarh","Srinagar","Kanpur","Shimla","Shillong",
             "Gangtok","Aizawl")); 

                
        System.out.print("\n\nEnter Destination: ");
        String destination=sc.nextLine().trim();//remove spaces before and after the destination entered by user using trim() method
        //to convert first letter of destination to uppercase and rest to lowercase using substring() method
        destination=destination.substring(0,1).toUpperCase() + destination.substring(1).toLowerCase();

        

        boolean busAvailable = false;
        boolean trainAvailable = false;
        boolean airwayAvailable = false;

        System.out.println("\n");
        //to check availability of bus,train and airway for entered destination
        for(int i=0;i<busJourney.size();i++){
            if(destination.equals(busJourney.get(i))){//to compare entered destination with destinations in busJourney arrayliist
               System.out.println("Bus Available");
               busAvailable = true;//to set busAvailable to true if bus is available for entered destination
            }
        }
        for(int i=0;i<trainJourney.size();i++){
            if(destination.equals(trainJourney.get(i))){
               System.out.println("Train Available");
               trainAvailable = true;//to set trainAvailable to true if train is available for entered destination
            }
        }
        for(int i=0;i<airwayJourney.size();i++){
            if(destination.equals(airwayJourney.get(i))){
               System.out.println("Airway Available");
               airwayAvailable = true;//to set airwayAvailable to true if airway is available for entered destination
            }
        }
        
        //to display mode of transportation available for entered destination
        System.out.println("\nMode of Transportation Available for " + destination + " is:");
        if(busAvailable){
            System.out.println("1. BUS");
        }
        if(trainAvailable){
            System.out.println("2. TRAIN");
        }
        if(airwayAvailable){
            System.out.println("3. AIRWAY");
        }

        int transportChoice=0;
        int count = 0;
        if(busAvailable){
            count++;
        }
        if(trainAvailable){
            count++;
        } 
        if(airwayAvailable){
            count++;
        }
        
        if(count == 1){//to automatically select available mode if only one mode of transportation is available for entered destination
        if(busAvailable){
            transportChoice = 1;
        } 
        else if(trainAvailable){
            transportChoice = 2;
        } 
        else {
            transportChoice = 3;
        }
        System.out.println("Automatically selected available mode.");
        }
        
        else{
            double busFare=fc.calculateBusFare(destination);
            double trainFare=fc.calculateTrainFare(destination);
            double airwayFare=fc.calculateAirwayFare(destination);
            
           
            System.out.println("\nPlease select mode of transportation according to your preference: ");

            //to display mode of transportation available for entered destination with fare
            if(busAvailable){
                System.out.println("1. BUS (Fare: Rs."+busFare+")");
            }
            if(trainAvailable){
                System.out.println("2. TRAIN (Fare: Rs."+trainFare+")");
            }
            if(airwayAvailable){
                System.out.println("3. AIRWAY (Fare: Rs."+airwayFare+")");
            }

            //to suggest user to select mode of transportation with cheapest fare for entered destination
            if(busFare<trainFare && busFare<airwayFare){
            System.out.println("Bus fare is the cheapest for " + destination );
            }
            else if(trainFare<busFare && trainFare<airwayFare){
            System.out.println("Train fare is the cheapest for " + destination );
            }
            else if(airwayFare<busFare && airwayFare<trainFare){
            System.out.println("Airway fare is the cheapest for " + destination );
            }
            else{
            System.out.println("All fares are the same for " + destination );
           }


            System.out.print("Enter your choice: ");
            transportChoice = sc.nextInt();

        }

        //to create objects of Bus, Airway and Train class to call displaySeats method of respective class
        Bus b=new Bus();
        Airway a=new Airway();
        Train t=new Train();
        //double fare = 0;

        //to display seat arrangement of selected mode of transportation using switch case
        switch(transportChoice){
            case 1:
                b.displaySeats();
                for(int i=0;i<noOfPassg;i++){
                    System.out.println("\n\nBooking seat for Passenger"+" "+ (i+1) );
                    int seat = b.bookSeat(sc, dt.name.get(i));//to book seat for passengers using bookSeat method of Bus class and to pass passenger name from Details class
                    System.out.println("Booked seat number: " + seat);
                }
                double totalFareBus = 0;
                for(int i=0; i<noOfPassg; i++){
                    double baseFare = fc.calculateBusFare(destination);
                    baseFare = fc.DiscountForFemale(dt.gender.get(i), baseFare);
                    baseFare = fc.DiscountForSeniorCitizen(dt.age.get(i), baseFare);
                    baseFare = fc.DiscountForStudent(dt.occupation.get(i), baseFare);
                    baseFare = fc.DiscountForRoundTrip(dt.tripType.get(i), baseFare);
                    totalFareBus += baseFare;//
                }
                totalFareBus = fc.DiscountOnGroup(totalFareBus, noOfPassg);
                System.out.println("\nTotal Fare for Bus Journey: Rs."+ totalFareBus);
                break;

            case 2:
                t.displaySeats();
                for(int i=0;i<noOfPassg;i++){
                    System.out.println("\n\nBooking seat for Passenger"+" "+ (i+1) );
                    int seat = t.bookSeat(sc, dt.name.get(i));//to book seat for passengers using bookSeat method of Train class and to pass passenger name from Details class
                    System.out.println("Booked seat number: " + seat);
                }
                double totalFareTrain = 0;
                for(int i=0; i<noOfPassg; i++){
                    double baseFare = fc.calculateTrainFare(destination);
                    baseFare = fc.DiscountForFemale(dt.gender.get(i), baseFare);
                    baseFare = fc.DiscountForSeniorCitizen(dt.age.get(i), baseFare);
                    baseFare = fc.DiscountForStudent(dt.occupation.get(i), baseFare);
                    baseFare = fc.DiscountForRoundTrip(dt.tripType.get(i), baseFare);
                    totalFareTrain += baseFare;
                }
                totalFareTrain = fc.DiscountOnGroup(totalFareTrain, noOfPassg);
                System.out.println("\nTotal Fare for Train Journey: Rs."+ totalFareTrain);
                break;

            case 3:
                a.displaySeats();
                for(int i=0;i<noOfPassg;i++){
                    System.out.println("\n\nBooking seat for Passenger"+" "+ (i+1) );
                    int seat = a.bookSeat(sc, dt.name.get(i));//to book seat for passengers using bookSeat method of Airway class and to pass passenger name from Details class
                    System.out.println("Booked seat number: " + seat);
                }
                double totalFareAirway = 0;
                for(int i=0; i<noOfPassg; i++){
                    double baseFare = fc.calculateAirwayFare(destination);
                    baseFare = fc.DiscountForFemale(dt.gender.get(i), baseFare);
                    baseFare = fc.DiscountForSeniorCitizen(dt.age.get(i), baseFare);
                    baseFare = fc.DiscountForStudent(dt.occupation.get(i), baseFare);
                    baseFare = fc.DiscountForRoundTrip(dt.tripType.get(i), baseFare);
                    totalFareAirway += baseFare;
                }
                totalFareAirway = fc.DiscountOnGroup(totalFareAirway, noOfPassg);
                System.out.println("\nTotal Fare for Airway Journey: Rs."+ totalFareAirway);
                break;
                       
            default:
                System.out.println("Invalid Choice");
                break;

        }
        //Add on for bus
        //extra luggage
        //windoww seat
        //meal
        //insurance
        //wifi
        
        //Add on for train
        //windoww seat
        //meal
        //insurance
        //wifi

        //add on the airway
        //extra luggage
        //window seat
        //meal
        //insurance

        //ticket booking summary
        //cancellation of ticket
    }
}

        

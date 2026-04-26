public class FareCalculation {

    //method to calculate fare for bus journey
    double calculateBusFare(String destination){
        double fare=0;
        switch(destination){
            case "Mumbai":
                fare=500;
                break;
            case "Nagpur":
                fare=400;
                break;
            case "Sambhajinagar":
                fare=350;
                break;
            case "Thane":
                fare=450;
                break;
            case "Ahmedabad":
                fare=600;
                break;
            case "Surat":
                fare=550;
                break;
            case "Indore":
                fare=300;
                break;
            case "Lucknow":
                fare=700;
                break;
            case "Panaji":
                fare=650;
                break;
            case "Bengaluru":
                fare=800;
                break;
            case "Chennai":
                fare=750;
                break;
            case "Hyderabad":
                fare=700;
                break;
            case "Kolkata":
                fare=900;
                break;
            case "Jaipur":
                fare=450;
                break;
            case "Satara":
                fare=200;
                break;    
            case "Kolhapur":
                fare=250;
                break;    
            case "Solapur":
                fare=300;
                break;    
            case "Nashik":
                fare=350;
                break;    
            case "Sangli":
                fare=400;
                break;    
            case "Latur":
                fare=450;
                break;    
            case "Dhule":
                fare=500;
                break;    
            case "Buldhana":
                fare=550;
                break;    
            case "Jalgaon":
                fare=600;
                break;    
            case "Jalna":
                fare=650;
                break;    
            case "Amaravati":
                fare=700;
        }
        return fare;

    }
    //method to calculate fare for train journey
    double calculateTrainFare(String destination){
        double fare=0;
        switch(destination){
            case "Mumbai":
                fare=1000;
                break;
            case "Nagpur":
                fare=800;
                break;
            case "Delhi":
                fare=1200;
                break;
            case "Ahmedabad":
                fare=900;
                break;
            case "Bhopal":
                fare=700;
                break;
            case "Lucknow":
                fare=1100;
                break;
            case "Patna":
                fare=1300;
                break;
            case "Panaji":
                fare=1500;
                break;
            case "Bengaluru":
                fare=2000;
                break;
            case "Chennai":
                fare=1800;
                break;
            case "Hyderabad":
                fare=1700;
                break;
            case "Kolkata":
                fare=2200;
                break;
            case "Jaipur":
                fare=900;
                break;    
            case "Agra":
                fare=800;
                break;    
            case "Chandigarh":
                fare=1000;
                break;    
            case "Amritsar":
                fare=1100;
                break;    
            case "Dehradun":
                fare=1200;
                break;    
            case "Srinagar":
                fare=1300;
                break;    
            case "Udaipur":
                fare=1400;
                break;    
            case "Jalgaon":
                fare=1500;
        }
        return fare;
    }
    //method to calculate fare for airway journey
    double calculateAirwayFare(String destination){
        double fare=0;
        switch(destination){
            case "Mumbai":
                fare=5000;
                break;
            case "Nagpur":
                fare=4000;
                break;
            case "Ahmedabad":
                fare=6000;
                break;
            case "Lucknow":
                fare=7000;
                break;
            case "Panaji":
                fare=6500;
                break;
            case "Bengaluru":
                fare=8000;
                break;
            case "Delhi":
                fare=7500;
                break;
            case "Chennai":
                fare=7000;
                break;
            case "Hyderabad":
                fare=9000;
                break;
            case "Kolkata":
                fare=8500;
                break;
            case "Jaipur":
                fare=4500;
                break;    
            case "Chandigarh":
                fare=5000;
                break;    
            case "Srinagar":
                fare=5500;
                break;    
            case "Kanpur":
                fare=6000;
                break;    
            case "Shimla":
                fare=6500;
                break;    
            case "Shillong":
                fare=7000;
                break;    
            case "Gangtok":
                fare=7500;
                break;    
            case "Aizawl":
                fare=8000;
        }
        return fare;
    }

    double DiscountForFemale(String passGender,double fare){
        //for females
        //5% discount
        if(passGender.equals("Female")){
            fare=fare-(fare*0.05);
        } 
        return fare; 
    }

    double DiscountForSeniorCitizen(int passAge,double fare){
        //for senior citizens
        //5% discount for senior citizens above 60 years of age
        if(passAge>60){//checking if passenger is senior citizen
            fare=fare-(fare*0.05);
        }
        return fare;
    }


    double DiscountForStudent(String passOccupation,double fare){
        //for students
        //5% discount for students
        if(passOccupation.equals("Student")){
            fare=fare-(fare*0.05);
        }
        return fare;
    }


    double DiscountForRoundTrip(String tripType,double fare){
        //discount on round trip booking
        //10% discount on round trip booking
        if(tripType.equals("Round Trip")){
            fare=fare*2;//to calculate fare for round trip booking
            fare=fare-(fare*0.10);
        }
        return fare;
    }


    double DiscountOnGroup(double totalFare,int noOfPassg){
        //discount on group booking
        //15% discount on group booking of 4 or more passengers
        if(noOfPassg>=4){
            totalFare=totalFare-(totalFare*0.15);
        }
        return totalFare;
    } 
 
}

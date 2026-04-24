import java.util.*;
//Person class for taking the details of the employee
class Person{
	
	String name;
	String apartno,apartname,road;
	int pincode;
	
	void accept(Scanner sc) {
		
		System.out.println("Enter Name:");
		name=sc.nextLine();
		
		System.out.println("Enter Apartment number:");
		apartno=sc.nextLine();
		
		System.out.println("Enter Apartment name:");
		apartname=sc.nextLine();
		
		System.out.println("Enter Road:");
		road=sc.nextLine();
		
		System.out.println("Enter Pincode:");
		pincode=sc.nextInt();
		
		sc.nextLine();//consume newline
	}
	
	void diaplay() {
		
		System.out.println("Name:" + name);//displaying the name
		System.out.println("Address: " + apartno + ", " + apartname + ", " + road + "- " + pincode);//displaying the address
		
	}
	
	}
class Employee extends Person{
	int empid, grade;
	double basicsalary,totalsalary,hra,da,incometax,takehomesalary;
	
	void accept(Scanner sc){
		super.accept(sc);//calling the accept method of person class to take the details of the employee
		System.out.println("Enter employee id:");
		empid=sc.nextInt();
		sc.nextLine();//consume newline
		
		System.out.println("Enter grade:");
		grade=sc.nextInt();
		sc.nextLine();//consume newline
		
		System.out.println("Enter Basic Salary:");
		basicsalary=sc.nextDouble();
		sc.nextLine();//consume newline
		
	}
	
    void grossSalary() {
		
		hra=(20*basicsalary)/100;//calculating house rent allowance
		da = (45*basicsalary)/100;//calculating daily allowance
		
		totalsalary=basicsalary+hra+da;//total salary or gross salary calculation
		
		incometax =(7*basicsalary)/100;//income tax
		takehomesalary = totalsalary - incometax;//thus homesalary calculation
		
	}

	void designation() {
		switch(grade) {
		case 1:
			System.out.println("Designation: Junior Developer");
			break;
		case 2:
			System.out.println("Designation: Senior Developer");
			break;
		case 3:
			System.out.println("Designation: Team Lead");
			break;
		case 4:
			System.out.println("Designation: Manager");
			break;
		case 5:
			System.out.println("Designation: Director");
			break;
		default:
			System.out.println("Designation: Associate");
		}
	}

   void display() {
		super.diaplay();//calling the display method of person class to display the details of the employee
		System.out.println("Employee id:"+ empid);
		System.out.println("Basic Salary: "+ basicsalary);
		this.designation();//calling the designation method to display the designation of the employee
	}
   
	void displaygrosssalary() {

		System.out.println("Gross Salary: " + totalsalary);
	}
	
	void displaytakehomesalary() {

		System.out.println("Take Home Salary: " + takehomesalary);
	}
}
public class Assignment9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Person p = new Person();//creating object of person class
		Employee [] emp = new Employee[10];//creating array of employee class
		
		int ch;
		int count=0;
		do {
			System.out.println("1.Create Employee");
			System.out.println("2.Display Employee Details");
			System.out.println("3.Display Employee Gross Salary");
			System.out.println("4.Display Employee Take home Salary");
			System.out.println("5.Search Employee by ID");
			System.out.println("0.Exit!");
			
			ch= sc.nextInt();
			sc.nextLine();
			
			switch(ch)
			{
				case 1:
					if(count<10) {
						emp[count]=new Employee();
						emp[count].accept(sc);
                        emp[count].grossSalary(); 
						count++;
						
					}
					else {
						System.out.println("Employee limit reached");
					}
					break;
					
				case 2:
					for(int i=0;i<count;i++) {
						emp[i].display();
					}
					break;
				case 3:
					for(int i=0;i<count;i++) {
						emp[i].displaygrosssalary();
					}
					break;
				case 4:
					for(int i=0;i<count;i++) {
						emp[i].displaytakehomesalary();
					}
					break;
				case 5:
					System.out.println("Enter Employee id to  Search:");
					int id = sc.nextInt();
					boolean found=false;
					
					for(int i=0;i<count;i++) {
						if(emp[i].empid==id) {
							emp[i].display();
							emp[i].displaygrosssalary();
							emp[i].displaytakehomesalary();
							found=true;
							
						}
					}
					if(!found) {
						System.out.println("Employee not found");
						
					}
					break;
				default:
					System.out.println("Exiting!!!");
					break;
			}
			
		}while(ch!=0);
		
	}
}


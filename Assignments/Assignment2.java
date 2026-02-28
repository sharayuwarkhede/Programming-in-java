import java.util.Scanner;
class Count {
	int word=0,vowel=0,character=0,digits=0,consonants=0;
    //String line;
    int i;

    void countWords(String line)
	 { 
		for(i=0;i<line.length();i++)
		{
			if(line.charAt(i)== ' ')
			{
				word++;
			}
		}
        System.out.println("The total no of words is:"+(word+1));
	 }
    void countVowels(String line)
	 { 
		for(i=0;i<line.length();i++)
		{
			if(line.charAt(i)=='a'||line.charAt(i)=='e'||line.charAt(i)=='i'||line.charAt(i)=='o'||line.charAt(i)=='u')
			{
				vowel++;
			}
		}
        System.out.println("The total no of vowels is:"+ vowel);
     }
    void countDigits(String line)
	 { 
		for(i=0;i<line.length();i++)
		{
			 if(line.charAt(i)=='0'||line.charAt(i)=='1'||line.charAt(i)=='2'||line.charAt(i)=='3'||line.charAt(i)=='4'||line.charAt(i)=='5'||line.charAt(i)=='6'||line.charAt(i)=='7'||line.charAt(i)=='8'||line.charAt(i)=='9') 
			{
                digits++;
            }
		}
        System.out.println("The total no of digits is:"+ digits); 
	 }
    
    void countCharacters(String line) 
	 {  
		for(i=0;i<line.length();i++)
		{
			if(line.charAt(i)!=' ')
		    {
                character++;
            }
		}
		System.out.println("Total no of characters is:"+character);
	 }
	 void countConsonants() 
	 {
		consonants =character-(vowel+digits);
		System.out.println("Total no of consonants is:"+consonants);
	 }
    
}
	
public class Assignment2 {
	public static void main(String[] args) {
		String line;
		int ch,j;
		System.out.println("Enter the string:");
		Scanner sc = new Scanner(System.in);
		line = sc.nextLine();

		System.out.println("Entered string is:"+ line);
		Count c =new Count();
		//c.line=line;
		
		
       
			{
				System.out.println("----Menu----");
		        System.out.println("1.Number of Words");
		        System.out.println("2.Number of Characters");
		        System.out.println("3.Number of vowels");
		        System.out.println("4.Number of digits");
		        System.out.println("5.Number of consonants");
		        System.out.println("Enter your choice:");
		        ch = sc.nextInt();
				switch (ch) 
				{
					case 1:
						c.countWords(line);
			            break;
		            case 2:
			            c.countCharacters(line);
			            break;
		            case 3:
			            c.countVowels(line);
			            break;
		            case 4:
			            c.countDigits(line);
			            break;
		            case 5:
			            c.countConsonants();
			            break;
		            default:
			            System.out.println("Invalid input!");
		        }
		    }	
	}
}


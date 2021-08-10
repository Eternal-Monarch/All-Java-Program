import java.util.Scanner;

public class Main
{
  
public static void main (String[]args)
  {
    
Scanner myScanner = new Scanner (System.in);
    
print ("Enter Your Marks: ");
    
int marks = myScanner.nextInt ();
    
if (marks >= 80)
      
      {
	
print ("you got A+");
      
}
    
    else if (marks >= 70)
      
      {
	
print ("you got A");
      
}
    
    else if (marks >= 60)
      
      {
	
print ("you got A-");
      
}
    
    else if (marks <= 40)
      
      {
	
print ("you got failed!!");
      
}
  
}
  
public static void print (String msg) 
  {
    
System.out.println (msg);

 
} 
 
 
} 

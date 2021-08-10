
public class Main
{
	public static void main(String[] args) {
	    Scanner myScanner=new Scanner(System.in);
	    print("Enter Your Marks: ");
	    int marks=myScanner.nextInt();
		//System.out.println("Hello World");
		showresult(marks);
		
	}
	public static void showresult(int mark)
	{
	    switch(mark/10){
	        case 8:
	            print("A+");
	            break;
	            case 7:
	                print("A");
	                break;
	                case 6:
	                    print("A-");
	                    break;
	                    default:
	                    print("not valid");
	                    break;
	        
	        
	    }
	    
	


}
public static  void print (String msg) 
  {
    
System.out.println (msg);

 
} 


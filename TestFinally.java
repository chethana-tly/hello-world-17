import java.io.IOException;

public class TestFinally {

	public static void main(String[] args)  {
		try{ 
			System.out.println("I am in try block"); 
			
			
			//System.exit(1);
		//	int x=2/0;
			//System.exit(0);
			if(null==null){
				System.out.println("Null references can be compared forequality");
			}
			 
			System.out.println(abc());
			
			
			}

		catch(Exception ex){ 
			ex.printStackTrace(); 
			
			//System.exit(0);
			} 
		finally { 
			
			System.out.println("I am in main finally block!!!"); 
			
			} 
		}

	public static int abc(){
	//	System.out.println("I am in abc!!!"); 
		
		try{
			
			return 2;
		
		
		}
		catch(Exception ex){ 
			ex.printStackTrace(); 
			
			//System.exit(0);
			} 
		finally { 
			
			System.out.println("I am in first finally block!!!"); 
			return 1;
			
			} 
		}
	}


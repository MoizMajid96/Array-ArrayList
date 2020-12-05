/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.List;
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
	    
	    
	   // int[] Arr = new int[]{1,21,3};
	    //
	    List<Integer> lst = new ArrayList();
	    
	    lst.add(123);
	    lst.add(456);
	    lst.add(789);
	    
	    	        System.out.println("Size is : "+ lst.size());
	    
	   // lst.remove(1);
	    
	    lst.set(2, 45678);
	    
	    for(int i = 0; i < lst.size(); i++){
	        System.out.println("Value is : "+ lst.get(i));
	    }
	    
	    
	    System.out.println("Size is : "+ lst.size());
	    
	    for(Integer item : lst){
	        System.out.println("Value is : "+ item);
	    }

	    
	    
	    
	    
	    
	    
	    
	    
	    

	}
}
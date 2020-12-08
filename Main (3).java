/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
     
	public static void main(String[] args) {
	    
		Emp eobj = new Emp(1, "Ali");
		eobj.Display();
		eobj.SetName("Saima");
		System.out.println(eobj.GetName());

	}
}

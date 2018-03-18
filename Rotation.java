import java.util.Scanner;

public class One {
 String n1,n2;
 char[] nc1;
 char[] nc2;
 Scanner sc = new Scanner(System.in);
 One()
 {
	 System.out.println("Enter the String 1:");
	 this.n1 = sc.next();
	 this.nc1 = n1.toCharArray();
	 
	 System.out.println("Enter the String 2:");
	 this.n2 = sc.next();
	 this.nc2 = n2.toCharArray();
 }
  
   
   boolean check()
   {
	   boolean charcheck;
	   
	   if(nc1.length == nc2.length)
	   {
		   for(int i=0;i<nc1.length;i++)
		   {
		       if(nc2[0]==nc1[i])
		       {
		    	 charcheck=rotate(i); 
		    	 if(charcheck)
		    		 return true;
		       }
		       else
		    	   continue;
		   }
	   }
	return false;
   }
   
   boolean rotate(int i)
   {
	   String n3= n1.substring(i, n1.length())+n1.substring(0, i);
	   if(n3.equals(n2))
		   return true;
	   else
	     return false;	   
   }
   
   public static void main(String[] args) {
	   One obj= new One();
		boolean ans = obj.check();
		System.out.println("\nThe two two Strings are in rotation: "+ ans );
  }
}

package supriya;

 class atm {
	 void withdraw() {
		 System.out.println("withdraw");
	 }
     void deposite() {
    	 System.out.println("deposite");
     }
 }
public class demo extends atm{ 
	
	public static void main (String[] args) {
		atm ff = new atm();
    	ff.withdraw();
   	    ff.depoiste();
	}
}
.....................................................	

public class VotingCheck{
	public static void main(string[] args) {
		int age = 18;
		if(age>=18) {
		System.out.println("you are eligible to vote");
		}else {
		    System.out.println("you are not eligible to vote.")
	}
  }
}
............................................................
public class main{
	public static void main(string[] args) {
		int monthNumber = 5;
		
		switch(monthNumber) {
		case1:System.out.println("welcome to jan");break;
		case2:System.out.println("welcome to feb");break;
		case3:System.out.println("welcome to march");break;
		case4:System.out.println("welcome to april");break;
		case5:System.out.println("welcmoe to may");break;
		case6:System.out.println("welcome to june");break;
		case7:System.out.println("welcome to july");break;
		case8:System.out.println("welocme to august");break;
		case9:System.out.println("welcome to sep");break;
		case10:System.out.println("welcome to oct" );break;
		case11:System.out.println("welcome to nov");break;
		case12:System.out.println("welcome to dec");break;
	default
		
		}
	}
}
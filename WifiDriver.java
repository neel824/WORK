import java.util.Scanner;

public class WifiDriver 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.\n" +  "");
		System.out.print("First step: reboot your computer\n" + "Are you able to connect with the internet? (yes or no)\n" +  "");
		
		String yesOrNo = input.next();
		
		if(yesOrNo.equals("yes"))
		{
			System.out.println("Rebooting your computer seemed to work.");
		}
		if (yesOrNo.equals("no"))
		{
			System.out.println("Second step: reboot your computer: ");
		}
		
		System.out.println("Now are you able to connect with the internet? (yes or no) ");
		
		yesOrNo = input.next();
		
		if(yesOrNo.equals("yes"))
		{
			System.out.println("Rebooting your computer seemed to work");
		}	
		if(yesOrNo.equals("no"))
		{
			System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power ");
		}	
		
		System.out.println("Now are you able to connect with the internet? (yes or no) ");
		
		yesOrNo = input.next();
		
		if(yesOrNo.equals("yes"))
		{
			System.out.println("Rebooting your router seemed to work");
		}	
		if(yesOrNo.equals("no"))
		{
			System.out.println("Fourth step: move your computer closer to your router ");
		}	
		
		System.out.println("Now are you able to connect with the internet? (yes or no) ");
		
		yesOrNo = input.next();
		
		if(yesOrNo.equals("yes"))
		{
			System.out.println("Moving closer to your router seemed to work");
		}	
		if(yesOrNo.equals("no"))
		{
			System.out.println("Fifth step: contact your ISP ");
		}	
		System.out.println("Make sure your ISP is hooked up to your router.");
		input.close();
	}

}

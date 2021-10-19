import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter; 

public class Main {
	public static void main(String[]args) throws FileNotFoundException 
	{
		// took file in as input and manipulated using arraylist
		ArrayList<String> names = new ArrayList<String>();
		
		File file = new File("/Users/samuelsarkisian/Desktop/name.txt");
		Scanner input = new Scanner(file);
		while(input.hasNext()) {
			names.add(input.nextLine());
		}
		input.close(); 

		
		for(int i = 0; i < names.size();i++) {
			System.out.println(names.get(i));
		}
		
		
		
		
		
		
		
		// Created a file
		try 
		{
			
			File newFile = new File("/Users/samuelsarkisian/Desktop/modifiedFile.txt");

			if(newFile.createNewFile())
			{
				System.out.println("New File has been Created" + newFile.getName());
			}
			
			else 
			{
				System.out.print("Error: File exists in the computer system already");
			}
		} 
		catch (IOException e)
		{
			e.printStackTrace();
			System.out.print("Error due to the file path issue");

		}
		
		// Write in the created file
		
		
		try {
			FileWriter filewriter = new FileWriter("/Users/samuelsarkisian/Desktop/modifiedFile.txt");
			filewriter.write("I programed the modification" + "\n" + "hi");
			filewriter.close();
			
		}
		catch(IOException e)
		{
			System.out.print("Error has occured while editting the file");
			e.printStackTrace();
		}
		
		
		
		
		
		/*
		{
		// reads a file input 
		Scanner input1 = new Scanner(new File("num.txt"));
		ArrayList<Integer> fileNumber = new ArrayList<>();		    		    
		while(input1.hasNext()) 
		{
			fileNumber.add(input1.nextInt());
		}
		input1.close(); 
		Main sort = new Main();


		// User input for a list of numbers
		Scanner input2 = new Scanner(System.in);
		ArrayList<Integer> user = new ArrayList<>();	
		System.out.println("Provide desired numbers to sort: ");
		int number;
		String Stringnumber;
		while (input2.hasNextInt()) 
		{      
			 number = input2.nextInt(); 
			 Stringnumber = input2.nextLine();

		      if (Stringnumber.equals("stop"))      
		        break;                                 
		     user.add(number);                           
		
		

		}
	 }
*/
	}
}

package hello;

import static java.nio.file.StandardOpenOption.APPEND;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Studenttest2 {

	public static void main(String [] args)  
	{

	try

	{

   boolean match=false;

	File f = new File("F:/vino--programs-2021/student4.txt");
	Path p = Paths.get(f.toString());
	OutputStream out = new BufferedOutputStream(Files.newOutputStream(p, APPEND));

	BufferedReader in = new BufferedReader(new FileReader(f));
	String line = null;


	
	System.out.println("Enter Roll Number:");
	Scanner sc=new Scanner(System.in);
	
	int stu=sc.nextInt();
	String num=String.valueOf(stu);
	
	while ((line = in.readLine()) != null) 
	{

	String[] array1 = line.split(" ");

	for (int k = 0; k < array1.length; k++)

	{
		
		
	String word= array1[k];
	//char ch=word.charAt(0);
	String ch1=word.substring(0,1);
	String ch2=word.substring(0,2);
	// System.out.println("char:"+ch2);
	//}
	
	//if(num.equals(String.valueOf(ch)))
		if(num.equals(ch1))
	  {
		match=true;
		System.out.println("roll number exist");
	System.out.println("Student detail:"+array1[k]);
	break;
	}
	
	if(num.equals(ch2))
	{
		match=true;
		System.out.println("roll number exist");
		System.out.println("Student detail:"+array1[k]);
		break;
	}
		
	}


 } 

	if(!match)
	System.out.println("roll number does not  exist");
	

	}	

	catch (Exception e)
	{

	}

 }

}

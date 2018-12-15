//Read in "input.txt" and output the text in reverse order to the screen.
package holidayprac;
import java.io.*;

public class Main {
	// Java Program to illustrate reading from FileReader 
	// using BufferedReader 
	 
	
	public static void main(String[] args)throws Exception 
	{ 
	// We need to provide file path as the parameter: 
	// double backquote is to avoid compiler interpret words 
	// like \test as \t (ie. as a escape sequence) 
	File file = new File("C:\\Users\\kitan\\Desktop\\input.txt"); 

	BufferedReader br = new BufferedReader(new FileReader(file)); 

	String st; 
	while ((st = br.readLine()) != null) {
		//System.out.println(st); 
		String[] str = st.split("[[ ]*|[,]*|[)]*|[(]*|[\\\"]*|[;]*|[-]*|[:]*|[']*|[’]*|[\\\\.]*|[:]*|[/]*|[!]*|[?]*|[+]*]+");
		for(int i = 0; i < str.length; i++)
		{
		System.out.println(str[i]);
		}
	if(!(st.length()>0)) continue;
	
	// reverse the elements in an array
	
	for(int i=0; i<str.length/2; i++){
		String temp = str[i]; 
		str[i] = str[str.length -i -1]; 
		str[str.length -i -1] = temp; 
		}
	for(int i = 0; i < str.length; i++)
	{
	System.out.print(str[i] + " ");
	}
	
	}
	} 
 

}

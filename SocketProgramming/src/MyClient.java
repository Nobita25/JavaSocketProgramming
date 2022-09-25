import java.io.*;
import java.net.*;
import java.util.*;

public class MyClient {
    public static void main(String[] args) throws IOException
    {
    	
    	Socket s = null;
    	InputStreamReader inputStreamReader = null;
    	OutputStreamWriter outputStreamWriter = null;
    	BufferedReader bufferedReader = null;
    	BufferedWriter bufferedWriter = null;
    	
    	try {
    		s = new Socket("localhost" , 1234) ;
    		
			inputStreamReader = new InputStreamReader(s.getInputStream());
			outputStreamWriter = new OutputStreamWriter(s.getOutputStream());
			
			bufferedReader = new BufferedReader(inputStreamReader);
			bufferedWriter = new BufferedWriter(outputStreamWriter);
			
			Scanner sc = new Scanner(System.in);
			
    		while (true) {
    			String msg = sc.nextLine();
    			
    			bufferedWriter.write(msg);
    			bufferedWriter.newLine();
    			bufferedWriter.flush();
    			
    			System.out.println("Server : " + bufferedReader.readLine());
    		}
    	}
    	catch( IOException e){
    		e.printStackTrace();
    	}
    }
}

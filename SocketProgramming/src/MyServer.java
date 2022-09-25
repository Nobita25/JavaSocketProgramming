import java.io.*;
import java.net.*;

public class MyServer {
    public static void main(String[] args) throws IOException
    {
       
        	ServerSocket ss = null;
        	Socket s = null;
        	InputStreamReader inputStreamReader = null;
        	OutputStreamWriter outputStreamWriter = null;
        	BufferedReader bufferedReader = null;
        	BufferedWriter bufferedWriter = null;
        	
        	
        	ss = new ServerSocket(1234);
        	
        	try {
        		s = ss.accept();
    			inputStreamReader = new InputStreamReader(s.getInputStream());
    			outputStreamWriter = new OutputStreamWriter(s.getOutputStream());
    			
    			bufferedReader = new BufferedReader(inputStreamReader);
    			bufferedWriter = new BufferedWriter(outputStreamWriter);
    			
        		while (true) {
        			String tomsg = bufferedReader.readLine();
        			
        			System.out.println("Walikum Asslam " + tomsg);
        			
        			bufferedWriter.write("Walikum Asslam");
        			bufferedWriter.newLine();
        			bufferedWriter.flush();
        		}
        	}
        	catch( IOException e){
        		e.printStackTrace();
        	}
        	
            
            
        
    }

}
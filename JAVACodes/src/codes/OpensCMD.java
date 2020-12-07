package codes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

public class OpensCMD
{ 
    public static void main(String args[]) 
    { 
//        try 
//        { 
//            String[] cmdArray = {"cmd", "/c", "java -version"};
//
//            Process p=Runtime.getRuntime().exec(cmdArray); 
//            
//            BufferedReader reader=new BufferedReader(
//                new InputStreamReader(p.getInputStream())
//            ); 
//            String line; 
//            while((line = reader.readLine()) != null) 
//            { 
//                System.out.println(line);
//            } 
//            p.waitFor();
//
//        }
//        catch(IOException e1) {e1.printStackTrace();} 
//        catch(InterruptedException e2) {e2.printStackTrace();} 
//
//        System.out.println("Done"); 
    	
    	
    	
    	
    	
    	
    	
    	ProcessBuilder processBuilder = new ProcessBuilder();

    	// -- Linux --

    	// Run a shell command
    	//processBuilder.command("bash", "-c", "ls /home/mkyong/");

    	// Run a shell script
    	//processBuilder.command("path/to/hello.sh");

    	// -- Windows --

    	// Run a command
    	processBuilder.command("cmd.exe", "/c", "appium");

    	// Run a bat file
    	//processBuilder.command("C:\\Users\\mkyong\\hello.bat");

    	try {

    		Process process = processBuilder.start();
    		process.waitFor(10, TimeUnit.SECONDS);

    		StringBuilder output = new StringBuilder();

    		BufferedReader reader = new BufferedReader(
    				new InputStreamReader(process.getInputStream()));

    		String line;
    		while ((line = reader.readLine()) != null) {
    			output.append(line + "\n");
    		}

    		int exitVal = process.waitFor();
    		if (exitVal == 0) {
    			System.out.println("Success!");
    			System.out.println(output);
    			System.exit(0);
    		} else {
    			//abnormal...
    		}

    	} catch (IOException e) {
    		e.printStackTrace();
    	} catch (InterruptedException e) {
    		e.printStackTrace();
    	}
    } 
}
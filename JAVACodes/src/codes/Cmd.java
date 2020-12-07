package codes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cmd {
	
	public static void main(String args[])throws IOException {
		Runtime runtime = Runtime.getRuntime();
		Process process = runtime.exec("cmd /c appium");
		
	    BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
	    String line = null;
	    while (true) {
	        line = in.readLine();
	        if (line == null) { break; }
	        System.out.println(line);
	    }
	    stopServer();
	}
	
	public static void stopServer() {
	    Runtime runtime = Runtime.getRuntime();
	    try {
	        runtime.exec("taskkill /F /IM node.exe");
	        runtime.exec("taskkill /F /IM cmd.exe");
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
}

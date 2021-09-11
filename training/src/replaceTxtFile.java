import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class replaceTxtFile {

	public static void main(String[] args) throws IOException {
		 File file = new File("C:\\Users\\Home\\Desktop\\fast.yaml");
	        BufferedReader reader = new BufferedReader(new FileReader(file));
	        String line = "", oldtext = "";
	        while((line = reader.readLine()) != null) {
	            oldtext += line + "\r\n";
	        }
	        reader.close();
	       
	        String phase  = oldtext.replaceAll("@@IP@@", InetAddress.getLocalHost().getHostAddress()).trim();
	        
	        FileWriter writer = new FileWriter("C:\\Users\\Home\\Desktop\\fast.yaml");
	        writer.write(phase);
	        writer.close();

	}

}

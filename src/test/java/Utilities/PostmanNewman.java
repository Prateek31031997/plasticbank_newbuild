package Utilities;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PostmanNewman extends BaseClass{
	
	ArrayList<String> values=new ArrayList<String>();
	
	
	public void runNewman() throws IOException {
	    try {
	        // Start the command prompt window
	        ProcessBuilder builder = new ProcessBuilder("cmd.exe");
	        builder.redirectErrorStream(true);
	        Process process = builder.start();
	        
	        // Send commands to the window
	        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));
	        writer.write("newman run PlasticBankonlytillmemberbranchesandprocessors.postman_collection.json --export-environment variable.json\n");
	        writer.flush();
	        writer.close(); // Close the writer to signal the end of input
	        
	        // Read the output of the window
	        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
	        String line;
	        while ((line = reader.readLine()) != null) {
	            System.out.println(line);
	        }
	        
	        // Wait for the process to complete
	        int exitCode = process.waitFor();
	        System.out.println("Process completed with exit code: " + exitCode);
	    } catch (IOException | InterruptedException e) {
	        e.printStackTrace();
	    }
	    
	    String jsonFilePath = ".\\variable.json"; // Replace with the actual path
	    ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Read the JSON file
            JsonNode rootNode = objectMapper.readTree(new File(jsonFilePath));

            // Extract values of specific keys
            JsonNode valuesNode = rootNode.get("values");
            if (valuesNode != null && valuesNode.isArray()) {
                for (JsonNode valueEntry : valuesNode) {
                    String key = valueEntry.get("key").asText();
                    String value = valueEntry.get("value").asText();

                    if ("m1randomUsername".equals(key) || "m1randomNumber".equals(key) || "b1randomBranchName".equals(key) || "b1randomNumber".equals(key) || "b2randomBranchName".equals(key) || "b2randomNumber".equals(key) || "b3randomBranchName".equals(key) || "b3randomNumber".equals(key) || "p1randomProcessorName".equals(key) || "p1randomNumber".equals(key) || "bonusOrderName".equals(key)) {
                        System.out.println(key + ": " + value);
                        values.add(value);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	    
        member_Name = values.get(0); 
		  member_Number=values.get(1);
		  branch1_Name = values.get(3); 
		  branch1_Number =values.get(2);
		  branch2_Name = values.get(5);
		  branch2_Number =values.get(4); 
		  branch3_Name = values.get(7);
		  branch3_Number = values.get(6); 
		  processor_Name = values.get(9); 
		  processor_Number = values.get(8);
		  bonusName = values.get(10);
	    
	    
	}
}
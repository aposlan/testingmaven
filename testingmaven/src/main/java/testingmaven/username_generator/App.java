package testingmaven.username_generator;

import java.util.ArrayList;
import java.util.List;

import com.github.javafaker.Faker;

public class App {
	
	static List<String> usernames = new ArrayList<String>();
	
	public static void main(String[] args){
    	
    	Faker faker;
    	
    	// Jr., Sr., I, II, III, IV, V, MD, DDS, PhD or DVM
    	
    	for(int i = 0; i < 5; i++) {
    		faker = new Faker();
    		usernames.add(faker.name().fullName().toLowerCase()
    				.replace("mr.", " ")
    				.replace("mrs.", " ")
    				.replace("miss", " ")
    				.replace("dr.", " ")
    				.replace("ms.", " ")
    				.replace("jr.", " ")
    				.replace("sr.", " ")
    				.replace("i", " ")
    				.replace("ii", " ")
    				.replace("iii", " ")
    				.replace("iv", " ")
    				.replace("v", " ")
    				.replace("md", " ")
    				.replace("dds", " ")
    				.replace("phd", " ")
    				.replace("dvm", " ")
    				.replaceAll("\\s", ""));
    	}
    	
    	for(String username:usernames)
    		System.out.println(username);
    	
    }
    
}

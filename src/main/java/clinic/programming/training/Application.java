package clinic.programming.training;

import java.util.List;
import java.util.ArrayList;

public class Application {
    
    public void greet(){
    	List<String> greetings = new ArrayList<String>();
    	greetings.add("Ciao");
    	greetings.add("Hello");

    	for(String g : greetings ){
    		System.out.println(g);
    	}
    }
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();

		app.greet();
    }
}
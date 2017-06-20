package clinic.programming.training;

import java.util.List;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;

public class Application {
    //costruttore
    public Application() {
        System.out.println ("Inside Application");
    }
    public void greet(){
    	List<String> greetings = new ArrayList<String>();
    	greetings.add("Ciao");
    	greetings.add("Hello");

    	for(String g : greetings ){
    		System.out.println(g);
    	}
    }
    public int countWords(String words){
    	String[] separateWords = StringUtils.split(words,' ');
    	return ( separateWords == null)?0:separateWords.length;
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();

		app.greet();

		int count = app.countWords("Ho 3 parole");
		System.out.println("Conteggio parole : "+count);
    }
}
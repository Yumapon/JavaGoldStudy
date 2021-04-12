import java.io.Console;
import java.io.PrintWriter;

public class ConsoleSample {

    public static void main(String[] args){

        Console console = System.console();
        PrintWriter pw = console.writer();

        while(true){
            String str = console.readLine();
            if(str.equals("")){break; }
            pw.append("inputdata" + str);
            pw.flush();
        }

    }
    
}

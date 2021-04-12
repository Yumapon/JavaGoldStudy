import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class NIO2Sample {
    
    public static void main(String[] args){
        //FileSystemclass
        FileSystem fs = FileSystems.getDefault();
        Path p1 = fs.getPath("test.txt");
        System.out.println(p1);

        System.out.format("isAbsolute : %s%n", p1.isAbsolute());
        System.out.format("toAbsolutepath : %s%n", p1.toAbsolutePath());

        Path p2 = p1.toAbsolutePath();
        Iterator<Path> iter = p2.iterator();

        System.out.printf("getName : %s%n", p2.getName(0));
        System.out.printf("getNameCount : %s%n", p2.getNameCount());
        System.out.printf("subpath : %s%n", p2.subpath(1,2));

        System.out.printf("resolve : %s%n", p2.resolve(p1));




        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        Path p3 = Paths.get("src");
        Path p4 = Paths.get("lib");

        System.out.println(p3.relativize(p4));

        System.out.format("exist    : %s%n", Files.exists(p1));

        try{
            System.out.format("isSameFile   : %s%n", Files.isSameFile(p1, p2));
        }catch(IOException exception){}
        System.out.format("isExecutable    : %s%n", Files.isExecutable(p1));

        try{
        List<String> lines = Files.readAllLines(p1);
        for(String line: lines){
            System.out.println(line);
        }
        }catch(IOException e){

        }

        Path p5 = Paths.get("src");
        try {
            Files.walk(p5).filter(s -> s.toString().endsWith(".java"))
                                    .forEach(System.out::println);
        }catch(IOException e){}

        
    }
}

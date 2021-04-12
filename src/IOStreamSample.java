import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

//IOStream練習用クラス
public class IOStreamSample {

    public static void main(String[] args) throws FileNotFoundException{

    /** 
    //Fileclass
    File f1 = new File("/Users/okamotoyuuma/Desktop/JavaGold");
    File f2 = new File("src", "test.txt");
    File f3 = new File(f1, "test2.txt");

    for(File f : f1.listFiles()){
        if(f.isDirectory()){
            System.out.println("directory : " + f.getName());
        }else if(f.isFile()){
            System.out.println("file : " + f.getName());
        }
    }

    System.out.println("区切りもじ : " + System.getProperty("file.separator"));

    //FileInputStream FileOutputStream
    try(FileOutputStream fos = new FileOutputStream(new File("src", "test.txt"));
        FileInputStream fis = new FileInputStream(new File("src", "test.txt"))){
            fos.write(0);
            fos.write("suzuki".getBytes());
            fos.write(99);

            int data = 0;
            while ((data = fis.read()) != -1){
                //読み込んだデータの表示
                System.out.print(data + "");
            }
    }catch(FileNotFoundException e){

    }catch(IOException e){

    }
    */

    try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("test.txt"));
        DataInputStream dis = new DataInputStream(new FileInputStream("test.txt"))){

            dos.writeInt(100);
            dos.writeUTF("tanaka");
            dos.writeUTF("田中");
            System.out.println(dis.readInt());
            System.out.println(dis.readUTF());
            System.out.println(dis.readUTF());
            //System.out.println(dis.readUTF());
    }catch(IOException e){

    }

    //FileReader FileWriter

    try(FileWriter fw = new FileWriter(new File("test.txt"));
        FileReader fr = new FileReader(new File("test.txt"))){
            fw.write("tanaka");
            fw.flush();
            int i = 0;
            while ((i = fr.read()) != -1){
                System.out.println((char)i);
            }
        }catch (IOException e){

        }

        //BufferdReader BufferedWriter
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(new File("test.txt")));
            BufferedReader br = new BufferedReader(new FileReader(new File("test.txt")))){

                bw.write("hello");
                bw.newLine();
                bw.write("goodevening");
                bw.flush();

                String data = null;
                while((data = br.readLine()) != null){
                    System.out.println(data);
                }

            }catch(IOException e){

            }
    }
}

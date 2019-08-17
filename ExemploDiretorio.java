
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ExemploDiretorio
 */
public class ExemploDiretorio {

    public static void main(String[] args) throws IOException{
        String caminho = "C:\\Users\\66264\\Desktop\\nossa pasta\\";
        new File(caminho).mkdirs();
        for(int i = 0;i < 10; i++){
        File file = new File(caminho + "arquivo0" + i +".txt");
        FileWriter writer = new FileWriter(file);
        writer.write("oi");
        writer.flush();

        } 
       
    

    }
}
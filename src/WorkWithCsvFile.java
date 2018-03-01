import java.io.FileWriter;
import java.io.IOException;

public class WorkWithCsvFile {
    public static void writeLine(int[] array) throws IOException {

        // writer
        FileWriter writer = new FileWriter("output.csv");

        // data
        String appender = ";";
        for(int arr: array ){
            writer.write(appender + arr);
            appender = ";";

            writer.write("\n");
            writer.flush();
        }
        writer.close();
    }

    public static void write(int[] vectorInt) throws IOException {

        // writer
        FileWriter writer = new FileWriter("benchmarkTable.csv");

        String appender = "";
        int qtdResultados = 100;


        for(int i=0;i <qtdResultados;i++){



            writer.flush();
        }
        writer.close();

    }

    
    
}

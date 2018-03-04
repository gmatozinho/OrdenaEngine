import java.io.FileWriter;
import java.io.IOException;
import java.rmi.server.ExportException;
import java.util.Random;

public class WorkWithCsvFile {


    public static FileWriter OpenFile() throws IOException {
        try
        {
            return new FileWriter("benchmarkTable.csv");
        }catch (Exception e)
        {
            return new FileWriter("benchmarkTable" + System.currentTimeMillis() +".csv");
        }

    }

    public static void CloseFile(FileWriter writer) throws IOException {
        writer.close();
    }

    public static void writeLine(FileWriter writer, String string) throws IOException {
        writer.write(string);
        writer.flush();
    }

    public static String writeResults(int[] results,int size){
        String separator = ",";
        return size+separator + results[0] +separator + results[1] + separator + results[2] + separator + results[3] +"\n";
    }
    
}

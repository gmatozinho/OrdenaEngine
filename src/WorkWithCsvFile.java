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
        String separator = ",";
        String header = "Qtd Numeros,Bubble,Insertion,Selection,QuickSort";
        int qtdResultados = 100;

        int[] vectorForBubble = vectorInt.clone();
        int[] vectorForInsertion = vectorInt.clone();
        int[] vectorForSelection = vectorInt.clone();
        int[] vectorForQuickSort = vectorInt.clone();


        writer.write(header +"\n");
        for(int i=0;i <= qtdResultados;i++){
            int bubbleExchange = 10;
            int insertionExchange = 20;
            int selectionExchange = 30;
            int quickSortExchange = 40;

            writer.write(i+separator + bubbleExchange +separator + insertionExchange + separator + selectionExchange + separator + quickSortExchange);
            writer.write("\n");
            writer.flush();
        }
        writer.close();

    }

    
    
}

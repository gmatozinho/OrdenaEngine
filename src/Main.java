import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        SortRoutine();
    }

    private static void SortRoutine() throws IOException {
        FileWriter file = WorkWithCsvFile.OpenFile();

        String header = "Quantidade de Valores,Bubble,Insertion,Selection,QuickSort\n";
        WorkWithCsvFile.writeLine(file,header);

        int qtdResultados = 100;

        for(int i=0;i <= qtdResultados;i++){

            int size = i*100;
            int[][] vectors = CreateArray.GenerateCloneArray(size);
            int[] results = SortEngine.OrdenaBenchmark(vectors);
            String thisSizeresult = WorkWithCsvFile.writeResults(results,size);
            WorkWithCsvFile.writeLine(file,thisSizeresult);
        }

        WorkWithCsvFile.CloseFile(file);

    }



}

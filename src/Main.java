import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        int[] tenNumbersArray = CreateArray.GenerateNumbersArray(50);
        OrdenaEngine.bubbleSort(tenNumbersArray);
        //TODO CreateCSVFile
        WorkWithCsvFile.write(tenNumbersArray);

    }
}

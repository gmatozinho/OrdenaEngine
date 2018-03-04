public class SortEngine {

    private static int bubbleSort(int vector[]){
        boolean exchange = true;
        int aux;
        int exchanges = 0;
        while (exchange) {
            exchange = false;
            for (int i = 0; i < vector.length - 1; i++) {
                if (vector[i] > vector[i + 1]) {
                    aux = vector[i];
                    vector[i] = vector[i + 1];
                    vector[i + 1] = aux;
                    exchanges ++;
                    exchange = true;
                }
            }
        }

        return exchanges;
    }

    private static int insertionSort(int vector[]){
        int j;
        int key;
        int i;
        int exchanges = 0;

        for (j = 1; j < vector.length; j++)
        {
            key = vector[j];
            for (i = j - 1; (i >= 0) && (vector[i] > key); i--)
            {
                vector[i + 1] = vector[i];
            }
            vector[i + 1] = key;

            exchanges++;
        }

        return exchanges;
    }

    private static int selectionSort(int[] vector){
        int exchanges = 0;
        for (int fixed = 0; fixed < vector.length - 1; fixed++) {
            int minor = fixed;
            for (int i = minor + 1; i < vector.length; i++) {
                if (vector[i] < vector[minor]) {
                    minor = i;
                }
            }
            if (minor != fixed) {
                int t = vector[fixed];
                vector[fixed] = vector[minor];
                vector[minor] = t;
                exchanges ++;
            }
        }

        return exchanges;
    }

    private static int callQuickSort(int[] vector){
        return quickSort(vector,0,vector.length-1,0);
    }
    
    private static int quickSort(int[] vector, int start, int end, int exchanges){

        if (start < end) {
            int[] results = separetes(vector, start, end,exchanges);
            int pivoPosition = results[0];
            exchanges = results[0];
            quickSort(vector, start, pivoPosition - 1,exchanges);
            quickSort(vector, pivoPosition + 1, end,exchanges);
        }

        return exchanges;
    }

    private static int[] separetes(int[] vector, int start, int end, int exchanges) {
        int pivo = vector[start];
        int i = start + 1, f = end;
        while (i <= f) {
            if (vector[i] <= pivo)
                i++;
            else if (pivo < vector[f])
                f--;
            else {
                int exchange = vector[i];
                vector[i] = vector[f];
                vector[f] = exchange;
                i++;
                f--;
                exchanges++;
            }
        }
        vector[start] = vector[f];
        vector[f] = pivo;
        return new int[]{f, exchanges};
    }

    public static int[] OrdenaBenchmark(int[][] vectors)
    {

        int bubbleExchange = SortEngine.bubbleSort(vectors[0]);
        int insertionExchange = SortEngine.insertionSort(vectors[1]);
        int selectionExchange = SortEngine.selectionSort(vectors[2]);
        //int quickSortExchange = OrdenaEngine.quickSort(vectors[3],0,size-1,0);
        int quickSortExchange = SortEngine.callQuickSort(vectors[3]);

        return new int[]{bubbleExchange,insertionExchange,selectionExchange,quickSortExchange};

    }
}

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

    public static int quickSort(int v[])
    {
        if(0>v.length-1)
        {
            return 0;
        }
        return quickSort(v,0,v.length-1);
    }
    public static int quickSort(int v[], int start, int end) {
        int count = 0;
        int i = start;
        int j = end;
        int pivot = v[(i + j) / 2];
        int change;
        while (i <= j) {
            while (v[i] < pivot) {
                i = i + 1;
            }
            while (v[j] > pivot) {
                j = j - 1;
            }
            if (i <= j) {
                change = v[i];
                v[i] = v[j];
                v[j] = change;
                i = i + 1;
                j = j - 1;
                count++;
            }
        }
        if (j > start)
            quickSort(v, start, j);
        if (i < end)
            quickSort(v, i, end);

        return count;

    }

    public static int[] OrdenaBenchmark(int[][] vectors)
    {

        int bubbleExchange = SortEngine.bubbleSort(vectors[0]);
        int insertionExchange = SortEngine.insertionSort(vectors[1]);
        int selectionExchange = SortEngine.selectionSort(vectors[2]);
        //int quickSortExchange = OrdenaEngine.quickSort(vectors[3],0,size-1,0);
        int quickSortExchange = SortEngine.quickSort(vectors[3]);
        
        return new int[]{bubbleExchange,insertionExchange,selectionExchange,quickSortExchange};

    }
}

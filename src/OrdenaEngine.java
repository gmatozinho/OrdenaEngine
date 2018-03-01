public class OrdenaEngine {

    public static void bubbleSort(int vector[]){
        boolean exchange = true;
        int aux;
        while (exchange) {
            exchange = false;
            for (int i = 0; i < vector.length - 1; i++) {
                if (vector[i] > vector[i + 1]) {
                    aux = vector[i];
                    vector[i] = vector[i + 1];
                    vector[i + 1] = aux;
                    exchange = true;
                }
            }
        }

    }
    public static void insertionSort(int vector[]){
        int j;
        int key;
        int i;

        for (j = 1; j < vector.length; j++)
        {
            key = vector[j];
            for (i = j - 1; (i >= 0) && (vector[i] > key); i--)
            {
                vector[i + 1] = vector[i];
            }
            vector[i + 1] = key;
        }
    }

    public static void selectionSort(int[] vector){
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
            }
        }
    }
    
    public static void quickSort(int[] vector, int start, int end){
        if (start < end) {
            int pivoPosition = separetes(vector, start, end);
            quickSort(vector, start, pivoPosition - 1);
            quickSort(vector, pivoPosition + 1, end);
        }
    }

    public static int separetes(int[] vector, int start, int end) {
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
            }
        }
        vector[start] = vector[f];
        vector[f] = pivo;
        return f;
    }
}

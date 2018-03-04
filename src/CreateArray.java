import java.util.Random;

public class CreateArray {
    static Random rand = new Random();

    private static int[] GenerateNumbersArray(int size)
    {
        return new Random().ints(size,100,15500).toArray();
    }

    public static int[][] GenerateCloneArray(int size)
    {
        int[] vectorInt = GenerateNumbersArray(size);
        int[] vectorForBubble = vectorInt.clone();
        int[] vectorForInsertion = vectorInt.clone();
        int[] vectorForSelection = vectorInt.clone();
        int[] vectorForQuickSort = vectorInt.clone();

        return new int[][]{vectorForBubble,vectorForInsertion,vectorForSelection,vectorForQuickSort};
    }
}

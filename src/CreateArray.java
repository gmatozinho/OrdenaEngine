import java.util.Random;

public class CreateArray {
    static Random rand = new Random();

    public static int[] GenerateNumbersArray(int size)
    {
        return new Random().ints(size,100,15500).toArray();
    }
}

public class Bitnumber {

    static int countBit(int n)
    {
        int count = 0;
        while (n != 0)
        {
            count++;
            n >>= 1;
        }

        return count;
    }

    public static void main(String[] args) {
        int i=50;
        System.out.println(countBit(i));


    }
}

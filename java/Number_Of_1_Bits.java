public class Number_Of_1_Bits {
    public int hammingWeight(int n) {
        int c=0;
        for(int i=0;i<32;i++)
        {
            if ((n >> i & 1) == 1)
                c++;
        }
        return c;
    }
}
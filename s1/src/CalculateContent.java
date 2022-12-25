import java.util.Optional;

public class CalculateContent {

    static int content(int[] p1, Optional<Integer[]> bOpt)
    {
        Integer[] p2 = bOpt.isPresent() ? bOpt.get() : null;
        int answ = 0;
        if(p2 == null)
        {
            answ = Math.abs(p1[1] - p1[0]);
        }
        else
        {
            int a = Math.abs(p1[1] - p2[1]);
            int b = Math.abs(p1[0] - p2[0]);
            answ = a * b;
        }

        return answ;
    }

    public static void main(String[] args)
    {
        int [] s1 = {2, 9};
        int [] p1 = {1, 1};
        int [] p2 = {4, 3};
    }
}

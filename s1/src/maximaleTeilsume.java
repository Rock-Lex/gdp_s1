public class maximaleTeilsume {
    public static void main(String[] args)
    {
        int [] arr = {5,-8, 3, 3, -5, 7, -2, -7, 3, 5};
        int maxSum = 0;
        int startInd = 0;
        int endInd = 0;
        int curentSum = 0;

        for (int i = 0; i < arr.length; ++i)
        {
            curentSum = 0;
            for (int j = i; j < arr.length; ++j)
            {
                curentSum += arr[j];
                if (curentSum >= maxSum)        // >= - last; > - first
                {
                    maxSum = curentSum;
                    startInd = i;
                    endInd = j;
                }
            }
        }
        System.out.println("Max sum: " + maxSum);
        System.out.println("Start index: " + startInd);
        System.out.println("End index: " + endInd);
    }
}

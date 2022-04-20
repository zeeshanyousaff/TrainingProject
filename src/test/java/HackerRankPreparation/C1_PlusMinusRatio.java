package HackerRankPreparation;

public class C1_PlusMinusRatio {


    public void Ratio(int[] numbers,int n)
    {
        float positive=0;
        float negative=0;
        float zero=0;
        //int arrayLength=numbers.length;

        for(int i=0;i<n;i++)
        {
            if(numbers[i]>0)
            {
                positive++;
            }
            else if (numbers[i]==0)
            {
                zero++;
            }
            else
            {
                negative++;
            }
        }

        System.out.println(String.format("%.6f",positive/n));
        System.out.println(String.format("%.6f",negative/n));
        System.out.println(String.format("%.6f",zero/n));

    }

    public static void main(String[] args)
    {
        C1_PlusMinusRatio pmr=new C1_PlusMinusRatio();

        int[] arr={-4, 3, -9, 0, 4, 1};
        pmr.Ratio(arr,6);

    }

}

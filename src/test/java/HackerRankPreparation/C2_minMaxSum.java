package HackerRankPreparation;

import java.util.ArrayList;
import java.util.List;

public class C2_minMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
       long min=0;                      //use long for big numbers in the list
       long max=0;
       int arrLength=arr.size();
       int temp=0;

       for (int i=0;i<arrLength;i++)
       {
            for(int j =0;j<arrLength-i-1;j++)
            {
                if (arr.get(j) > arr.get(j + 1))
                {
                    temp = arr.get(j);
                    arr.set(j,arr.get(j + 1));
                    arr.set(j+1,temp);
                }
            }

       }

       for(int i =0; i<arrLength-1;i++)
       {
           min=min+arr.get(i);
       }

        for(int i =1; i<arrLength;i++)
        {
            max=max+arr.get(i);
        }
        System.out.print(min+"  "+max);

    }


    public static void main(String[] args)
    {
        C2_minMaxSum pmr=new C2_minMaxSum();

        List<Integer> arr=new ArrayList<>();
        arr.add(3);
        arr.add(1);
        arr.add(4);
        arr.add(5);
        arr.add(2);

        pmr.miniMaxSum(arr);

    }
}

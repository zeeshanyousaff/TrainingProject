package HackerRankPreparation;

import java.util.ArrayList;
import java.util.List;
//Challenge
//Given a list of integers, count and return the number of times each value appears as an array of integers.
public class C8_frequencyArray {

    public static List<Integer> countingSort(List<Integer> arr) {
        List<Integer> sorted=new ArrayList<>();
        for(int i=0;i<100;i++)
        {
            sorted.add(i,0);
        }

        for (int i=0;i<arr.size();i++)
        {
            sorted.set(arr.get(i), sorted.get(arr.get(i))+1);
        }

        return sorted;
    }




public static void main(String[] args)
{
    C8_frequencyArray c =new C8_frequencyArray();

    List<Integer> a=new ArrayList<>();
    a.add(34);
    a.add(45);
    a.add(34);
    a.add(0);

    List<Integer> sorted=new ArrayList<Integer>();


    sorted.add(1000,0);
    System.out.println(sorted);


}


}

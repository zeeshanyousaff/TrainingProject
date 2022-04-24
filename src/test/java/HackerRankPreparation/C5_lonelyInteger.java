package HackerRankPreparation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Given an array of integers, where all elements but one occur twice, find the unique element.

public class C5_lonelyInteger {

    public static int lonelyinteger(List<Integer> a) {

        HashMap<Integer,Integer> Unique=new HashMap<>();

        int n=0;


        for (int i=0;i<a.size();i++)
        {
            if(Unique.containsKey(a.get(i)))

            {
                Unique.put(a.get(i), Unique.get(a.get(i))+1);
            }
            else   {
                Unique.put(a.get(i), 1);
            }

        }

        for(Map.Entry<Integer,Integer> entry: Unique.entrySet())
        {
            if(entry.getValue()==1)
            {
                n=entry.getKey();
            }
        }

        return n;
    }
    public static void main(String[] args)
    {
        C5_lonelyInteger c=new C5_lonelyInteger();

        List<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(3);
        a.add(2);
        a.add(1);

        System.out.println(lonelyinteger(a));
    }
}


package HackerRankPreparation;

import java.util.ArrayList;
import java.util.List;

//There is a collection of input strings and a collection of query strings. For each query string, determine how many times it occurs in the list of input strings. Return an array of the results.
public class C4_matchingStrings {

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries)
    {
        List<Integer> results=new ArrayList<>(queries.size());

       for(int i=0;i<queries.size();i++)
            {
              results.add(i, 0);
           }
       //    System.out.println(results);

        for (int i =0;i<queries.size();i++)
        {
            for(int j=0;j<strings.size();j++)
            {
                if(queries.get(i).equals(strings.get(j)))
                {
                    results.set(i, results.get(i)+1);
                }
            }
        }

        return results;
    }
    public static void main(String[] args)
    {
        C4_matchingStrings c=new C4_matchingStrings();
        List<String> strings=new ArrayList<>();
        List<String> queries=new ArrayList<>();

        strings.add(("aba"));
        strings.add("baba");
        strings.add("aba");
        strings.add("xzxb");

        queries.add("aba");
        queries.add("xzxb");
        queries.add("ab");

        System.out.println(c.matchingStrings(strings,queries));
    }
}

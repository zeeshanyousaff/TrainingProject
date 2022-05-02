package HackerRankPreparation;

public class CrawlerLogProblem_HackerRank {


        public static int minOperations(String[] logs) {

            int n=0;

            for(int i=0;i<logs.length;i++)
            {
                if(logs[i].equals("./"))
                {
                    continue;
                }

                if(logs[i].equals("../"))
                {
                    if(n>0)
                    {
                        n--;
                    }
                }
                else{
                    n++;
                }
            }
            return n;
        }


public static void main(String[]  args)
{
     String logs[]={"d1/","d2/","./","d3/","../","d31/"};

    System.out.println(minOperations(logs));
}

}

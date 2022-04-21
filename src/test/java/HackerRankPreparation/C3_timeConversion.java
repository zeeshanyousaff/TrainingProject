package HackerRankPreparation;

//convert 12 hour time format to 24 hour time format

import java.io.BufferedReader;
import java.io.BufferedWriter;

public class C3_timeConversion {

    public void timeConversion(String s) {

        String hr=s.substring(0,2);
        String min=s.substring(2,6);
        String sec=s.substring(6,8);
        //System.out.println(hr);
        //System.out.println(min);
        //System.out.println(sec);

        if (s.startsWith("12") && s.endsWith("AM"))
        {
            s=s.replace("12","00").replace("AM","");
            System.out.println(s);
        }
        else if(s.contains("AM"))
        {
            s=s.replace("AM","");
            System.out.println(s);
        }
       else if (s.startsWith("12") && s.endsWith("PM"))
        {
            s=s.replace("PM","");
            System.out.println(s);
        }
       else if (s.contains("PM"))
        {
            int hour=Integer.parseInt(hr);
            int addition=hour+12;
            String afteraddtion=Integer.toString(addition);
            String TimeafterConversion=afteraddtion+min+sec;
            System.out.println(TimeafterConversion);
        }
    }

public static void main(String[] args)
{
    C3_timeConversion c=new C3_timeConversion();
    c.timeConversion("12:01:00AM");
}
}

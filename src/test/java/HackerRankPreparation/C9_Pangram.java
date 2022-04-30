package HackerRankPreparation;
//A pangram is a string that contains every letter of the alphabet.
//Given a sentence determine whether it is a pangram in the English alphabet.
//Ignore case. Return either pangram or not pangram as appropriate.// Java program for the above approach

class C9_Pangram {

    public static String pangrams (String s) {
        String lowerCase=s.toLowerCase();
        boolean pangram=true;
        for(char ch='a';ch<='z';ch++)
        {
            if(!lowerCase.contains(String.valueOf(ch)))
            {
                pangram=false;
                break;
            }
        }

        if(pangram==true)
        {
            return "pangram";
        }
        else{
            return "not pangram";
        }
    }


    // Driver Code
    public static void main(String args[])
    {
        // Given string str
        String str = "We promptly judged antique ivory buckles for the prize";

        // Function call
        System.out.println(pangrams(str));
    }
}

package HackerRankPreparation;

import java.util.*;

//Given a square matrix, calculate the absolute difference between the sums of its diagonals.

class C7_diagonalDifference {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    //Solution: The primary diagonal is formed by the elements A00, A11, A22 so i and j are equal
    // Secondary diagonal is formed by  A02, A11 , A20 so sum of i and j is equal to size of list-1 e.g. i+j=size-1; 3*3 matrix 3-1 = 2
    //rules are applicable for all square metrices

    public static int diagonalDifference(List<List<Integer>> arr) {

        int principalDiagonal=0;
        int secondaryDiagonal=0;
        int diagonalDifference=0;

        for(int i=0;i<arr.size();i++)
        {
            for (int j=0;j<arr.size();j++)
            {
                if(i==j)
                {
                    principalDiagonal+=arr.get(i).get(j);
                }

                if((i+j)==(arr.size()-1))
                {
                    secondaryDiagonal+=arr.get(i).get(j);
                }
            }

        }
        System.out.println(principalDiagonal);
        System.out.println(secondaryDiagonal);
        diagonalDifference=Math.abs(principalDiagonal-secondaryDiagonal);
        return diagonalDifference;

    }
    public static void main(String[] args)
    {
        C7_diagonalDifference c=new C7_diagonalDifference();
        List<List<Integer>> combinedarray =new ArrayList<>();
        List<Integer> arr1 =new ArrayList<>();
        arr1.add(11);
        arr1.add(2);
        arr1.add(4);
        List<Integer> arr2 =new ArrayList<>();
        arr2.add(4);
        arr2.add(5);
        arr2.add(6);
        List<Integer> arr3 =new ArrayList<>();
        arr3.add(10);
        arr3.add(8);
        arr3.add(-12);

        combinedarray.add(arr1);
        combinedarray.add(arr2);
        combinedarray.add(arr3);
        System.out.println(combinedarray);
//        System.out.println(arr1);
//        System.out.println(arr2);
//        System.out.println(arr3);
        System.out.println( "absolute sum of diagonal difference :"+ diagonalDifference(combinedarray));
       // System.out.println( combinedarray.size());

    }

}



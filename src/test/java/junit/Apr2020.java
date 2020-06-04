package junit;

import java.util.ArrayList;
import java.util.List;

public class Apr2020 {

    private static String isDivBy3Or4(int num){
        if(num%12 == 0){
            return "div by 3 and 4";
        }
        else if(num%3 == 0){
            return "div by 3";
        }
        else if(num%4 == 0){
            return "div by 4";
        }
        else {
            return "not div by 3 or 4";
        }
    }

    private static boolean containsElement(Object[] arr, Object element){
        for(Object obj: arr){
            if(obj.equals(element)){
                return true;
            }
        }
        return false;
    }

   /* private static void primes(int num){
        System.out.println(2);
        for(int i = 3; i<=95; i+=2){
            if(i%3 == 0 || i%5 == 0)
        }
    }*/

    private static int countChar(String str, char c){
        int count=0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)==c){
            ++count;
            }
        }
        return count;
    }

    private static List<Integer> unique2Lists(List<Integer> list1, List<Integer> list2){
        List<Integer> list3 = new ArrayList<>();
        boolean flag=false;
        for(int i=0; i<list1.size(); i++){
            for(int j=0; j<list2.size(); j++){
                if(list1.get(i)==list2.get(j)){
                    flag=false;
                    break;
                }
                else{
                    flag=true;
                }
            }
            if(flag==true){
                list3.add(list1.get(i));
            }
        }
        for(int i=0; i<list2.size(); i++){
            for(int j=0; j<list1.size(); j++){
                if(list2.get(i)==list1.get(j)){
                    flag=false;
                    break;
                }
                else{
                    flag=true;
                }
            }
            if(flag==true){
                list3.add(list2.get(i));
            }
        }
        return list3;
    }

    private static int factorialNum(int num){
        int fact=1;

        for(int i=num; i>=1; i--){
            fact = fact * i; //1*5, 58
        }
        return fact;
    }

    private static int factorialNumR(int num){
        if(num<=1){
            return 1;
        }
        return num * factorialNumR(num-1);
    }

    private static boolean isPalindromeA(String str){
       // boolean flag= true;
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isPalindromeA("soninos"));

       // System.out.println(factorialNumR(5));
        //System.out.println(factorialNum(5));

        List<Integer> list1 = new ArrayList<>();
        list1.add(8);
        list1.add(18);
        list1.add(81);
        list1.add(88);
        List<Integer> list2 = new ArrayList<>();
        list2.add(88);
        list2.add(9);
        list2.add(18);
        list2.add(7);
      //  System.out.println(unique2Lists(list1, list2));
        //System.out.println(countChar("soniya krish", 's'));
       //primes(100);

        // System.out.println(containsElement(new Integer[] {4, 6, 7, 8, 9}, 10));
       // System.out.println(containsElement(new String[] {"soni", "krishy", "manvay", "priyanka"}, "sony"));

        //System.out.println(isDivBy3Or4(17));

        String name = "soniya";

    }
}

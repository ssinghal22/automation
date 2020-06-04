package junit;

import java.util.*;

import static java.lang.Math.sqrt;

public class Mar2020 {
    private static void swap2VarValues(int a, int b){
        System.out.println("a before: " + a + " b before: " + b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a after: " + a + " b after: " + b);
    }
    private static void swapArray(int[] arr){
        if (arr.length == 0 || arr == null){
            System.out.println("empty array");
            return;
        }

        System.out.println(Arrays.toString(arr));
        int three = arr[2];
        int five = arr[4];
        int temp = three;
        arr[2] = five;
        arr[4] = temp;
        System.out.println(Arrays.toString(arr));
    }
    private static String divBy3Or4(int num){
        if (num % 12 == 0){
            return "Div by 3 and 4";
        }
        else if (num % 4 == 0){
            return "Div by 4";
        }
        else if (num % 3 == 0){
            return "Div by 3";
        }
        else {
            return "not div by 3 or 4";
        }
    }

    private static void printNums(int num){
        if (num >= 0) {
            for (int i = 0; i <= num; i++) {
                System.out.println(i);
            }
        }
         else if (num < 0){
            for (int i = num; i <= 0; i++ ){
                System.out.println(i);
            }
            }
        }

    private static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    private static boolean isContainsNum(int[] arr, int num){
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }

    private static void fizzBuzz(int num){
        for (int i = 1; i <= num; i++){
            if(i % 15 == 0){
                System.out.print("FizzBuzz ");
            }
            else if(i % 3 == 0){
                System.out.print("Fizz ");
            }
            else if(i % 5 == 0){
                System.out.print("Buzz ");
            }
            else {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isNumPrime(int num){
        if(num <= 1){
            return false;
        }
        if(num == 2 || num == 3){
            return true;
        }
        if(num % 2 == 0 || num % 3 == 0){
            return false;
        }
        for (int i = 5; i <= sqrt(num); i += 2) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    private static String reverseString(String str){
        char temp;
        char[] ch = str.toCharArray();
        for(int i = 0; i < ch.length/2; i++){ //size is 6, then 0, 1, 2,
                  temp = ch[i];
                  ch[i] = ch[ch.length - 1 - i];
                    ch[ch.length - 1 - i] = temp;
        }
        return new String(ch);
        //return String.valueOf(ch);
    }

    private static void reverseArr(int[] arr){
        System.out.println(Arrays.toString(arr));
        int temp;
        for(int i = 0 ; i < arr.length/2; i++){
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static String reverseWords(String sent){
        String reverse = " ";
        String[] words = sent.split(" ");
        for(int i = words.length - 1; i >= 0; i--){
            reverse += words[i] + " ";
        }
        return reverse;
    }

    private static void sortArray(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap2Nums(int a, int b){
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a: " + a + " b: " + b);
    }

    private static boolean containsElement(Object[] obj, Object element){
        for(int i = 0; i < obj.length; i++){
            if(obj[i].equals(element)){
                return true;
            }
        }
        return false;
    }

    private static void find2TopNums(int[] arr){
        int max1, max2 = Integer.MIN_VALUE;
        max1 = arr[0];
       // max2 = arr[1];

        for(int i = 1; i < arr.length; i++){
            if(max1 < arr[i]){
                int temp = max1;
                max1 = arr[i];
                max2 = temp;
            }
            else if(arr[i] > max2){
                max2 = arr[i];
            }
        }
        System.out.println("max1: " + max1 + " max2: " + max2);
    }

    private static boolean findPairSum(int[] arr, int sum){
        Set<Integer> nums = new HashSet<>(arr.length);

        for(int num: arr){
            int diff = sum - num; //5, 40, 45, 51, 50
            if (nums.contains(diff)){
                return true;
            }
            nums.add(num); //50, 15, 10, 4
        }
        return false;
    }

    private static boolean isPresentChar(String str, char c){
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == c){
                return true;
            }
        }
        return false;
    }

    private static boolean isPresentCharArr(String str, char c){
        char[] carr = str.toCharArray();
        for(int i = 0; i < carr.length; i++){
            if(carr[i] == c){
                return true;
            }
        }
        return false;
    }

    private static List<Object> uniqueItems2Lists(List<Object> list1, List<Object> list2){
        List<Object> result = new LinkedList<>();

        for(Object element1 : list1){
            boolean isDup = false;
            for(Object element2: list2){
                if(element1.equals(element2)){
                    isDup = true;
                    break;
                }
            }
            if(!isDup){
                result.add(element1);
            }
        }
        for(Object element1 : list2){
            boolean isDup = false;
            for(Object element2: list1){
                if(element1.equals(element2)){
                    isDup = true;
                    break;
                }
            }
            if(!isDup){
                result.add(element1);
            }
        }
return result;
    }


    private static int calcFactorial(int num){
        //5 fact = 5 x 4x 3x 2x 1;
        int factorial = 1;

        while(num >= 1){
            factorial = factorial * num;
            num = num -1;
        }
        return factorial;
    }

    private static long recFact(int num){
if(num == 0){
    return 1;
}
        return num * recFact(num-1);
    }

    private static void fib(int count){
        int fib1 = 0;
        int fib2 = 1;
        System.out.println(fib1);
        System.out.println(fib2);
        int fibNext;

        for(int i = 3; i <= 10; i++){
            fibNext = fib1 + fib2;
            System.out.println(fibNext);
            fib1 = fib2;
            fib2 = fibNext;
        }
    }

    private static int recFib(int num){
        if(num<=1){
            return 1;
        }
        return(recFib(num -1) + recFib(num-2));

    }

    private static boolean isPalind(String str){
        if(str.length() <= 1){
            return true;
        }
        return false;
    }

    private static boolean isNumPalind(int num){
        int original = num;
        int reverse = 0;
        while(num > 1){
            reverse = reverse *10 + num %10; //4, 42, 422, 4224
            num = num/10;//422, 42, 4, 0
        }
        if(original == reverse){
            return true;
        }
        return false;
    }

    private static void filterDupsInArr(int[] arr){
        Set<Integer> dups = new HashSet<>();
        for(int num: arr){
            dups.add(num);
        }
        for(int num: dups){
            System.out.println(num);
        }

        Map<Integer, Integer> dups1 = new HashMap<>();
        for(int num: arr){
            if(dups1.containsKey(num)){
                dups1.put(num, dups1.get(num) + 1);
            }
            else {
                dups1.put(num, 1);
            }
        }
            System.out.println(dups1.entrySet());
    }

    private static boolean brackets(String str){
        Stack<Character> bracket = new Stack<>();
        HashMap<Character, Character> parens = new HashMap<>();
        parens.put('{', '}');
        parens.put('[', ']');
        parens.put('(', ')');
        parens.put('<', '>');

        char[] ch = str.toCharArray();
        for (char c: ch) {
            if (parens.containsKey(c)) {
                bracket.add(parens.get(c));//], }, ), >
                System.out.println(bracket.peek());
            }
        }
        for(char c: ch){
            if(parens.containsValue(c)) {
                if(!bracket.isEmpty() && bracket.peek() == c){
                    System.out.println(bracket.peek());
                    bracket.pop();
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(brackets("[{(<>)}]"));

        //filterDupsInArr(new int[]{23, 34, 21, 21, 23, 34});
    //System.out.println(isNumPalind(4228));
        //System.out.println(isPalind("a"));
        //System.out.println(recFib(10));
        //fib(10);
        //System.out.println(recFact(5));
        //System.out.println(calcFactorial(5));
        List<Object> list1 = new LinkedList();
        list1.add(1);
        list1.add(11);
        list1.add(10);
        list1.add(19);
        list1.add(22);

        List<Object> list2 = new LinkedList();
        list2.add(1);
        list2.add(12);
        list2.add(22);
        list2.add(13);

        //System.out.println(uniqueItems2Lists(list1, list2));
        //System.out.println(isPresentCharArr("soniya", 'z'));
        //System.out.println(isPresentChar("soniya", 'z'));
        //System.out.println(findPairSum(new int[] {50, 15, 10, 4, 5}, 9));
       // find2TopNums(new int[] {1, 3, 5, 8});
       //find2TopNums(new int[] {-1, -3, -5, -8});
        //find2TopNums(new int[] {-1, 3, -5, -8});
        //find2TopNums(new int[0]);

        //swap2VarValues(5, 9);
        int[] arr = {1, 5, 8, 3, 9};
        //int[] arr = null;
        //int[] arr = {};

        //swapArray(arr);
        //System.out.println(divBy3Or4(20));
        //printNums(-10);
        //printArray(arr);
        //System.out.println(isContainsNum(arr, 8));
        //fizzBuzz(20);
        // System.out.println(isNumPrime(231));
        //System.out.println(reverseString("soniya"));
        //reverseArr(arr);
        //System.out.println(reverseWords("God help me!"));
        //sortArray(arr);
        int a1 = 5;
        int b1 = 9;
       //swap2Nums(a1, b1);

        String[] str = {"soni", "krishy", "krishna", "sonia"};
        Integer[] ints = {3, 4, 6, 7, 8, 9};
        //System.out.println(containsElement(str, "sonia"));
        //System.out.println(containsElement(ints, 9));
    }
}

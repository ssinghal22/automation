package junit;

import java.util.*;

public class PracticeSept {

    static int[] arr1 = {23, 4, 56, 78, 6, 9};

    private static Boolean isContainsNum(int[] arr, int num){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == num){
                return true;
            }
        }
        return false;
    }

    private static void fizzBuzz(int num){
        for (int i = 1; i <= num; i++){
            if (i % 15 == 0){
                System.out.print("FizzBuzz ");
            }
            else if (i % 3 == 0){
                System.out.print("Fizz ");
            }
            else if (i % 5 == 0){
                System.out.print("Buzz ");
            }
            else {
                System.out.print(i + " ");
            }
        }
    }

    private static String reverseString(String word){
        String reverse = "";
        for (int i = word.length()-1; i >= 0 ; i--){
            reverse += word.charAt(i);
        }
        return reverse;
    }

    private static void reverseSentence(String sentence){
        String[] words = sentence.split(" ");

        for (int i = words.length - 1; i >= 0; i--){
            System.out.print(words[i] + " ");
        }
    }

    private static void sortArray(int[] arr){
        System.out.println(Arrays.toString(arr));
        int temp;
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if (arr[i] > arr[j]){
                 temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static Boolean isCharPresentInString(String str, char c){
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == c){
                return true;
            }
        }
        return false;
    }

    private static String reverseStringNoNew(String str){
        int len = str.length();
        for (int i = str.length() - 1; i >= 0; i--){
            str += str.charAt(i);
        }
        return str.substring(len);
    }

    static ArrayList<String> list1 = new ArrayList<>();
    static ArrayList<String> list2 = new ArrayList<>();
    static {
        list1.add("sonia");
        list1.add("krish");
        list1.add("manvay");
        list1.add("priyanka");
    }
    static {
        list2.add("soniya");
        list2.add("sonia");
        list2.add("krishna");
        list2.add("mani");
        list2.add("pk");
    }

    private static void compare2Lists(ArrayList<String> list1, ArrayList<String> list2){
       ArrayList<String> list3 = new ArrayList<>();
       Boolean isDuplicate = true;

        for (int i = 0; i < list1.size(); i++){
            for (int j = 0; j < list2.size(); j++){
                if (list1.get(i) != list2.get(j)){
                    isDuplicate = false;
                }
                else {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate == false){
                list3.add(list1.get(i));
            }
        }
        for (int i = 0; i < list2.size(); i++){
            for (int j = 0; j < list1.size(); j++){
                if (list2.get(i) != list1.get(j)){
                    isDuplicate = false;
                }
                else {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate == false){
                list3.add(list2.get(i));
            }
        }
        for (int i = 0; i < list3.size(); i++){
            System.out.println(list3.get(i));
        }
    }

    static List<Object> list4 = new LinkedList<>();
    {
        list4.add(1);
        list4.add(2);
        list4.add(3);
        list4.add(4);
        list4.add(5);
    }
   static List<Object> list5 = new LinkedList<>();
    {
        list5.add(5);
        list5.add(22);
        list5.add(3);
        list5.add(44);
        list5.add(1);
    }
   static private void uniqueList(List<Object> list1, List<Object> list2){
        List<Object> temp = new LinkedList<>();
       Boolean isDuplicate;

        for (Object item1 : list1 ){
             isDuplicate = false;
            for (Object item2 : list2 ){
                if (item1 == item2) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate){
                System.out.println(item1);
                temp.add(item1);
            }
        }
       for (Object item2 : list2){
           isDuplicate = false;
           for (Object item1 : list1){
               if (item2 == item1) {
                   isDuplicate = true;
                   break;
               }
           }
           if (!isDuplicate){
               temp.add(item2);
           }
       }
    }

    static int[] arr2 = {4, 67, 3, 78, 9, 100, 99, 5, 888};
    private static void twoMaxNums(int[] arr){
        int max1 = 0;
        int max2 = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max1){
                if (i == 0){
                    max1 = arr[i];  //4
                }
                else {
                    max2 = max1; //4, 67
                    max1 = arr[i];//67, 78
                }
            }
        }
        System.out.println(max1);
        System.out.println(max2);
    }

    private static int factorial(int num){
       if (num == 0){
           return 1;
       }
       return num * factorial(num-1);
    }

    private static int fibonacci(int num){
        if (num <= 1){
            return 1;
        }
        return fibonacci(num -1) + fibonacci(num - 2);
    }

    private static Boolean isPalindrome(String word){
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i-- ){
            reverse += word.charAt(i);
        }
        if (word.equals(reverse)){
            return true;
        }
        else {
            return false;
        }
    }

    private static Boolean isPalindromeOptimised(String word){
        Boolean flag = true;
        for (int i = 0; i <= word.length()/2; i++){
            if (word.charAt(i) == word.charAt(word.length()-(i+1))){
                flag = true;
            }
            else {
                flag = false;
                return false;
            }
        }
        return flag;
    }
    static int[] arr4 = {1, 20, 11, 60, 61};
    private static Boolean isDuplicates(int[] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    private static String reverseSentence1(String sent){
        String[] words = sent.split(" ");
        String reverse = "";
        for (int i = words.length - 1; i >= 0; i--){
            reverse += words[i] + " ";
        }
        return reverse;
    }

    private static void findVowels(String word){
        //char[] c = {'a', 'e', 'i', 'o', 'u'};
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        for (int i = 0; i < word.length(); i++){
            while(vowels.contains(word.charAt(i)))
            {
                System.out.println(word.charAt(i));
            }
        }
    }

    private static Map<Character, Integer> duplicateCharsCount(String word){
        Map<Character, Integer> hMap = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            int count = 1;

            if (!hMap.containsKey(word.charAt(i))) {
                hMap.put(word.charAt(i), count);

                for (int j = i + 1; j < word.length(); j++) {
                    if (word.charAt(i) == word.charAt(j)) {
                        hMap.put(word.charAt(i), ++count);
                    }
                }
            }
        }
        return hMap;
    }

    private static ArrayList<Character> dupCharsWord(String word){
        ArrayList<Character> arrList = new ArrayList<>();
        for (int i = 0; i < word.length(); i++){
            for (int j = i+1; j < word.length(); j++){
                if (word.charAt(i) == word.charAt(j)){
                    arrList.add(word.charAt(i));
                    break;
                }
            }
        }
return arrList;
    }

static int[] arr6 = {1, 2, 3, 4, 1, 2, 3, 1, 2, 4};
    private static Map<Integer, Integer> countIntArr(int[] arr){
        int count;
        Map<Integer, Integer> mapIntCount = new HashMap<>();

        for (int i =0; i < arr.length; i++){
            if (!mapIntCount.containsKey(arr[i])){
                mapIntCount.put(arr[i], 1);
            }
            else if (mapIntCount.containsKey(arr[i])){
                count = mapIntCount.get(arr[i]);
                mapIntCount.put(arr[i], ++count);
            }
        }
        return mapIntCount;
    }

    static int[] arr7 = {8,7,3,4,5,2,1,0};
    private static ArrayList<Integer> missingNum(int[] arr){
        Boolean flag;
        ArrayList<Integer> arrList = new ArrayList<>();

        for (int i = 0; i <= 9; i++){
            flag = false;

            for (int j = 0; j < arr.length; j++) {
                if (i != arr[j]) {
                    continue;
                } else {
                    flag = true;
                }
            }
        if (flag == false){
            arrList.add(i);
        }
        }
        return arrList;
    }

    static int[] arrMedian = {1, 2, 3, 4};

    static private double Median(int[] arr){
        int len = arr.length;
        double med = 0;
        if (len % 2 == 0){
            med = (arr[(arr.length/2) - 1] + arr[arr.length/2])/2.0;
        }
        else if (len % 2 != 0){
            //med = arr[1] 3/2 = 1
            med = arr[arr.length/2];
        }
        return med;
    }


   /* public PracticeSept(String s){
        word = s;
    }*/
     static private Map<Character, Integer> uniqueLettersInWord(String word){
        Map<Character, Integer> result = new HashMap<>();
        int temp;
        for (int i = 0; i < word.length(); i++){
            if (result.containsKey(word.charAt(i))){
               temp = result.get(word.charAt(i)) + 1;
               result.put(word.charAt(i), temp);
            }
            else {
                result.put(word.charAt(i), 1);
            }
        }
        System.out.println(result.keySet());
        return result;
     }

     static private ArrayList<Character> uniqueCharsInWord(String word){
         Boolean isDup;
         ArrayList<Character> result = new ArrayList<>();

         for (int i = 0; i < word.length(); i++){
             isDup = false;
             for (int j = i+1; j < word.length(); j++){

                 if (word.charAt(i) == word.charAt(j)){
                     isDup = true;
                     break;
                 }
             }
             if (isDup == false){
                 result.add(word.charAt(i));
             }
         }
         return result;
    }

    private static String reverseDigitsInNum(int num){
         String s = "";
         while (num % 10 != 0){
          // System.out.print(num % 10); //4, 3, 2, 1

             s += Integer.toString(num % 10);
           num = num/10;
         }
            return s;
    }

private static void binarySearch1(int[] arr, int num) {
    int head = arr[0];
    int headi = 0;
    int tail = arr[arr.length - 1];
    int taili = arr.length - 1;
    int mid = arr[arr.length / 2]; //6 - odd, 9 - even
    int midi = arr.length / 2;
    Boolean flag = false;

    while (flag == false) {
        if (num == mid) {
            flag = true;
        }
        if (num < mid && midi >= 0) {
            tail = mid;
            taili = midi;
            midi = (headi + taili) / 2;
            mid = arr[midi];
        } else if (num > mid) {
            head = mid;
            headi = midi;
            midi = (headi + taili) / 2;
            mid = arr[midi];
        }
    }
}

    public static void main(String args[]){
         int[] sortedArr = {1, 3, 6, 9, 22};
         binarySearch1(sortedArr, 2);

         String word = "engineering";

         int num  = 1234;

        //System.out.println(reverseDigitsInNum(num));

        //System.out.println(swapVowels(word));

         //System.out.println(uniqueCharsInWord(word));

        //System.out.println(uniqueLettersInWord(word));

       // System.out.println(Median(arrMedian));

       // System.out.println(missingNum(arr7));

        //System.out.println(countIntArr(arr6));

       //System.out.println(dupCharsWord("abcdabcefg"));

        // System.out.println(duplicateCharsCount("aabcdebacdefageafege"));

        //findVowels("krishnasenghol");

      //  System.out.println(reverseSentence1("I am Krish's mom"));

        //System.out.println(isDuplicates(arr4));

       // System.out.println(isPalindromeOptimised("soninoa"));//soniinos

       // System.out.println(factorial(5));

       // System.out.println(fibonacci(5));

        //twoMaxNums(arr2);

       //System.out.println(isContainsNum(arr1, 4));

        //fizzBuzz(20);

        //System.out.println(reverseString("Soniya"));

        //reverseSentence("I love Krish very much!");

        //sortArray(arr1);

        //System.out.println(isCharPresentInString("soniya", 'a'));

    //System.out.println(reverseStringNoNew("Krishna"));

      //  compare2Lists(list1, list2);

    // uniqueList(list4, list5);
    }
}

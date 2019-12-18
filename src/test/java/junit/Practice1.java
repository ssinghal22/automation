package junit;

import java.util.*;

public class Practice1<arrM> {

    static int[] dupArr = {4, 5, 4, 7, 5, 8, 6, 5, 7, 8, 5, 9, 7, 2, 4};

    public static void checkDupsInArr(int[] arr){

        HashMap<Integer, Integer> dupInts = new HashMap<>();
        int count;

        for (int i = 0; i < arr.length; i++){

            if (!dupInts.containsKey(arr[i])) {

                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {

                        if (dupInts.containsKey(arr[i])) {
                            count = dupInts.get(arr[i]) + 1;
                            dupInts.put(arr[i], count);
                            System.out.println(dupInts.entrySet());
                        } else {
                            dupInts.put(arr[i], 2);
                            System.out.println(dupInts.entrySet());
                        }
                    }
                }
            }
        }
            System.out.println(dupInts.entrySet());
    }

    static String word = "abcycba";

    static public Boolean isPalindrome(String word){

        Boolean flag = false;

        for (int i = 0; i <= word.length()/2; i++){

            if (word.charAt(i) == word.charAt(word.length() - 1 - i)){
             flag = true;
            }
            else {
                flag = false;
                break;
            }
        }
        return flag;
    }

    static String test = "asdfghasdfghjhgfdsa";

    public static void testCountChars(String test){

        HashMap<Character, Integer> countHash = new LinkedHashMap<>();
        int count;

        for (int i = 0; i < test.length(); i++) {

            if (countHash.containsKey(test.charAt(i))){
                count = countHash.get(test.charAt(i)) + 1;
                countHash.put(test.charAt(i), count);
            }
            else {
                countHash.put(test.charAt(i), 1);
            }
        }
        System.out.println(countHash.entrySet());

        for (Character key: countHash.keySet()){
            System.out.print( "" + key + countHash.get(key));
        }
    }

    static int[] dupsArr = {2, 3, 4, 2, 3, 4, 2, 3, 4, 5, 6, 2, 3};

    public static void findDupsArr(int[] arr){
        LinkedHashMap<Integer, Integer> hashInt = new LinkedHashMap<>();

        int count;

        for (int i = 0; i < arr.length; i++) {

            if (hashInt.containsKey(arr[i])){
                count = hashInt.get(arr[i]) + 1;
                hashInt.put(arr[i], count);
            }
            else {
                hashInt.put(arr[i], 1);
            }
        }
        System.out.println(hashInt.entrySet());

        for (Integer key: hashInt.keySet()){
            System.out.print( "" + key + hashInt.get(key));
        }
    }

    static String[] arr1 = {"hello", "adios", "goodbye", "hola", "au revoir", "bonjour"};
    static String[] arr2 = {"hello", "welcome","thanks", "goodbye", "please"};

    public static void commonWords(String[] arr1, String[] arr2){

        ArrayList<String> words = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr2.length; j++){
                if (arr1[i].equals(arr2[j])){
                    words.add(arr1[i]);
                }
            }
        }
        for (String str: words){
            System.out.println(str);
        }
    }

    static ArrayList<Integer> arrM = new ArrayList<>();

    static {
        arrM.add(1);
        arrM.add(2);
        arrM.add(3);
        arrM.add(4);
        arrM.add(5);
    }

    public static Object median(ArrayList<Integer> arrM){
        if (arrM == null || arrM.isEmpty()){
            return 999;
        }
        else if (arrM.size()%2 != 0){
                return arrM.get(arrM.size()/2); //5/2 = 2
            }
        else {
            int num = arrM.size()/2; //2,
            double med = ((int) arrM.get(num - 1) + (int) arrM.get(num))/2.0;
            return med;
        }
    }

    static String word1 = "engineering";

    public static void uniqueLettersInWord(String word){

        LinkedHashSet<Character> lhash = new LinkedHashSet<Character>();

        for (int i = 0; i < word.length(); i++){
            lhash.add(word.charAt(i));
        }
        Iterator<Character> c = lhash.iterator();

        while (c.hasNext()){
            System.out.println(c.next());
        }
    }

    static int number = 8976;

    public static void reverseDigitsInNumber(int num){
        int digit;
        String str = "";

        while(number % 10 != 0){
            digit = number % 10; //6, 7, 9
            System.out.print(digit);

            str = str + digit;

            number = number /10; //897, 89, 8
        }
        System.out.println(str);
    }

    static String word2 = "leitcodu";

    static public void swapVowels(String word) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        char temp;
        int i = 0;
        int j = word.length() - 1;
        char[] c = word.toCharArray();

       // System.out.print(new String (c));

        while(i < j){
            if (!vowels.contains(c[i])){
                i++;
                continue;
            }
            if (!vowels.contains(c[j])){
                j--;
                continue;
            }
            temp = c[i];
            c[i] = c[j];
            c[j] = temp;

            i++;
            j--;
    }
        System.out.print(c);
    }


    public static void main(String[] args){

        swapVowels(word2);

        //reverseDigitsInNumber(number);

       // uniqueLettersInWord(word1);

       // System.out.println(median(arrM));

        //commonWords(arr1, arr2);

        //findDupsArr(dupsArr);

        //testCountChars(test);

        //System.out.println(isPalindrome(word));

        // checkDupsInArr(dupArr);
    }
}

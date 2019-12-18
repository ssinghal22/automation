package junit;

import org.junit.Test;
import org.junit.Assert;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Practice {

    @Test
    public void testAssert(){
        assertEquals(1, 1);
        assertTrue(1 == 1);
    }

    @Test
    public void testReverseDigitsInNumber(){
        int num = 6789;
        reverseDigitsInNumber(num);
    }

    private void reverseDigitsInNumber(int num){
        int digit;
        while(num/10 != 0){
            digit = num%10;
            System.out.print(digit);
            num = num/10;
        }
        System.out.print(num);
    }

    @Test
    public void testReverseString(){
        String word = "WebDRiver";
        System.out.println(reverseString(word));
    }

    private String reverseString(String word){
        String reverse = "";
        for (int i = word.length()-1; i>=0; i--){
            reverse += word.charAt(i);
        }
        return reverse;
    }

    @Test
    public void printReverseSentence(){
        String sentence = "I love Krish very much";
        reverseSentence(sentence);
    }
    private void reverseSentence(String sentence){
        String[] words = sentence.split(" ");
        for(int i = words.length -1; i>=0; i--){
            System.out.print(words[i] + " ");
        }
    }

    @Test
    public void testSortArray(){
        int[] nums = {34, 56, 78, 4, 9};
        sortArray(nums);
    }

    private void sortArray(int[] nums){
        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                if (nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
            System.out.println(Arrays.toString(nums));
    }

    @Test
    public void testCountChar(){
        String str = "arbdgfc";
        char c = 'z';
        System.out.println(countChar(str, c));
    }

    private int countChar(String str, char c){
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == c){
                return i;
            }
        }
        return 0;
    }

    @Test
    public void testUniqueList(){
        List<Object> list1 = new LinkedList<>();
        list1.add(5);
        list1.add(23);
        list1.add(59);
        list1.add(35);
        list1.add(9);

        List<Object> list2 = new LinkedList<>();
        list2.add(23);
        list2.add(4);
        list2.add(8);
        list2.add(59);
        list2.add(9);
        list2.add(2);

        System.out.println(duplicates(list1, list2));
        System.out.println(uniqueList(list1, list2));
    }

    private List<Object> duplicates(List<Object> list1, List<Object> list2){
        List<Object> list3 = new LinkedList<>();

        for (Object item1: list1) {
            for (Object item2: list2){
                if (item1 == item2){ //23,59, 9
                    list3.add(item1);
                }
            }
        }
        return list3;
    }

    private List<Object> uniqueList(List<Object> list1, List<Object> list2){
        List<Object> list3 = new LinkedList<>();

        for(Object item1: list1){
            boolean flag = false;
            for (Object item2: list2){
                if(item1 == item2){
                    flag = true;
                }
            }
            if (flag == false){
                list3.add(item1); //5, 35,
            }
        }
        return list3;
    }

    @Test
    public void testIsPalindrome(){
      // System.out.println(isPalindrome("Abc"));
        //System.out.println(isPalindrome("AbccbA"));
        //System.out.println(isPalindrome("AbcbA"));
        System.out.println(isPalindrome("civic"));
    }

    private boolean isPalindrome(String str){
        int len = str.length(); //3, 6
        int j = len - 1; //2, 5
        boolean flag = false;

        if (len % 2 != 0){
            for (int i = 0; i < len/2; i++){ // 0; i < 1 ;
                if (str.charAt(i) == str.charAt(j)){
                    flag = true;
                    j--;
                }
            }
        }
        if (len % 2 == 0){
            for (int i = 0; i < len/2; i++){ // 0; i < 1 ; 0; i<3; 0, 1, 2
                if (str.charAt(i) == str.charAt(j)){
                    flag = true;
                    j--;
                }
            }
        }

        if (flag == true){
            return true;
        } else {
            return false;
        }
    }

    @Test
    public void isArrayDuplicates(){
        int[] nums = {45, 67, 5, 7, 23, 45, 5, 100, 23, 99, 34};
        System.out.println(arrayDuplicates(nums));
    }

    private boolean arrayDuplicates(int[] nums){
        boolean flag = false;

        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){

                if (nums[i] == nums[j]){
                    System.out.println("dup num: " + nums[i]);
                    flag = true;
                }
            }
        }
        return flag;
    }

    //swap vowels in a word
    @Test
    public void testSwapVowels(){
        String word = "abecidoku";

        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        //swapVowels(word, vowels);
        findVowels(word, vowels);
    }

    private void swapVowels(String word, Set<Character> vowels){
        char temp;
        char[] ch = word.toCharArray();
        int j = ch.length - 1;

        for (int i = 0; i < ch.length/2; i++){
            if ((vowels.contains(ch[i])) && (vowels.contains(ch[j]))) {
                temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                }
                j--;
            }
        System.out.println(ch);
        }

      private void findVowels(String word, Set<Character> vowels){
         // char[] ch = word.toCharArray();

          for (int i = 0; i < word.length(); i++){
              if (vowels.contains(word.charAt(i))){
                  System.out.println(word.charAt(i));
              }
          }
      }
    }


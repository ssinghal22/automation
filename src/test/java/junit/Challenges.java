package junit;

import cucumber.api.java.bs.I;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;


public class Challenges {
    //have a place where run from nd where implemented

    @Test
    public void challenges() {
        // hello();
        // hello("Say hello!");
        // swapVars();
        // switchElementsArray();
        // divIntDivBy3And4(12);
        //divIntDivBy3And4(9);
        //divIntDivBy3And4(8);
        //divIntDivBy3And4(25);
        //divIntDivBy3And4(0);
        //divIntDivBy3And4(Integer.MAX_VALUE);
        //divIntDivBy3And4(Integer.MIN_VALUE);

        // printNums(5);
        //printNums(0);
        //printNums(-5);

        int[] arr1 = {3, 5, 2};
        int[] arr2 = new int[0];
        int[] arr3 = null;

        //System.out.println(ifEmpty(arr1));
        //System.out.println(ifEmpty(arr2));
        //System.out.println(ifEmpty(arr3));

        //int sum2 = add2Ints(5, 6);
        //assertEquals(5+6, sum2);
        //assertThat(sum2 == (5+6));

        //int[] arr4 = {1, 2, 3, 4, 5}; //add if empty, if len 1, len 2
        //exchangeFirstLastNums(arr4);

        // System.out.println(divBy2Or5(2));
        //System.out.println(divBy2Or5(5));
        //System.out.println(divBy2Or5(10));
        //System.out.println(divBy2Or5(3));

        int[] arr5 = {20, 3, 5, 33, 99, 30, 44, 100};
        //evenNumsArray(arr5);

        // int max1 = maxIntArray(arr5);
        // assertThat(max1 == 100);
        // assertTrue(max1 == 100);

        //Boolean abc = findNumInArray(arr5, 7);

        // fizzBuzz(20);

        String sentence = "I wanna be a SDET";
        System.out.println(reverseSentence(sentence));
    }

    private void hello() {
        System.out.println("Hello World!");
    }

    private void hello(String message) {
        System.out.println(message);
    }

    private void swapVars() {
        int a = 5;
        int b = 3;
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        int c = a;
        a = b;
        b = c;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    private void switchElementsArray() {
        int[] a = {5, 2, 9, 7, 3};

        System.out.println(Arrays.toString(a));

        int b = a[2];
        a[2] = a[4];
        a[4] = b;

        System.out.println(Arrays.toString(a));
    }

    private void divIntDivBy3And4(int i) {
        System.out.println("Num " + i + "   ========");

        if ((i % 3 == 0) && (i % 4 == 0)) { //or (num % 12 == 0)
            System.out.println("divisible by 3 and 4");

        } else if (i % 3 == 0) {
            System.out.println("divisible by 3");

        } else if (i % 4 == 0) {
            System.out.println("divisible by 4");

        } else {
            System.out.println("Not divisible by 3 and 4");
        }
    }

    private void printNums(int max) {
        if (max >= 0) {
            for (int i = 0; i <= max; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = max; i <= 0; i++) {
                System.out.println(i);
            }
        }
    }

    private boolean ifEmpty(int[] arr) {
        if (arr == null || arr.length == 0) {
            return true;
        } else {
            return false;
        }
    }

    private int add2Ints(int a, int b) {
        int sum = a + b;
        System.out.println("sum of " + a + " and " + b + " is: " + sum);
        return sum;
    }

    private void exchangeFirstLastNums(int[] arr) {

        System.out.println(Arrays.toString(arr));
        int first = arr[0];
        int last = arr[arr.length - 1];

        arr[0] = last;
        arr[arr.length - 1] = first;
        System.out.println(Arrays.toString(arr));
    }

    private String divBy2Or5(int num) {

        if ((num % 10) == 0) {
            String message = "divisible by 2 and 5";
            return message;
        } else if (num % 2 == 0) {
            String message = "divisible by 2";
            return message;
        } else if (num % 5 == 0) {
            String message = "divisible by 5";
            return message;
        } else {
            String message = "not divisible by 2 or 5";
            return message;
        }
    }

    private void evenNumsArray(int arr[]) {
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }

    private int maxIntArray(int[] arr) {
        System.out.println(Arrays.toString(arr));

        // int max = Integer.MAX_VALUE;

        int max = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("largest in array is: " + max);
        return max;
    }

        private boolean findNumInArray(int[] arr, int num) {

        //check if arr is null
        for (int i = 0; i < arr.length; i++) {

            if (num == arr[i]) {
                return true;
            }
        }
        return false;
    }

    private void fizzBuzz(int num) { //O(n)

        for (int i = 1; i <= num; i++) {

            if (i % 15 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " "); //i converts to string
            }
        }
    }

    private boolean isPrime(int num) {

        if (num < 2) {
            return false;
        }

        if (num != 2 && num % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }

        }
        return true;
    }

    private String reverseSentence(String sentence) {

        String[] words = sentence.split(" ");

        String reversed = "";

        for (int i = words.length - 1; i >= 0; i--) {

            reversed += words[i] + " ";
        }
        return reversed;
    }

    @Test
    public void testContainsElement() {
        String[] arr = {"hi", "there", "world"};
        Integer[] intArr = {3, 5, 2, 3};

        System.out.println(containsElement(arr, "the"));
        System.out.println(containsElement(intArr, 33));
    }

    private boolean containsElement(Object[] arr, Object obj) {
        for (int i = 0; i < arr.length; i++) {

            if (arr[i].equals(obj)) {
                return true;
            }
        }
        return false;
    }

    @Test
    public void testReverse() {

        System.out.println(reverse("WebDriver"));
        printReverse("WebDriver");
    }

    private String reverse(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    private void printReverse(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println(reversed);
    }

    @Test
    public void testSort() {
        int[] arr = {8, 2, 7, 88, 50, 9, 1};
        System.out.println(Arrays.toString(sort(arr)));
    }

    private int[] sort(int[] intArr) {
        for (int i = 0; i < intArr.length; i++) {

            for (int j = i + 1; j < intArr.length; j++) {
                if (intArr[i] > intArr[j]) {
                    int temp = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = temp;
                }
            }
        }
        return intArr;
    }

    @Test
    public void readExcel() throws IOException {
        String excelFilePath = System.getProperty("user.dir") + "/src/test/java/junit/excel.xlsx";
        File excelFile = new File(excelFilePath);
        FileInputStream excelStream = new FileInputStream(excelFile);

        Workbook workbook = new XSSFWorkbook(excelStream);
        Sheet sheet = workbook.getSheet("Test");

        Row firstRow = sheet.getRow(0);
        Cell firstCell = firstRow.getCell(0);

        for (Row row : sheet) {
            for (Cell cell : row) {
                System.out.println(cell);
            }
        }
    }

    @Test
    public void countCharString() {
        String str = "Krishna";
        System.out.println(countChar(str, 'r'));
    }

    private int countChar(String str, char c) {
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                ++j;
            }
        }
        return j;
    }

    @Test
    public void testUnSortedArray() {
        int[] arrNums = {5, 12, 23, 35, 50, 88, 98};
        System.out.println(unSortedArray(arrNums, 7));
    }

    private boolean unSortedArray(int[] arrNums, int num) {

        for (int i = 0; i < arrNums.length; i++) {
            if (arrNums[i] == num) {
                return true;
            }
        }
        return false;
    }

    @Test
    public void testIsDupsArray() {
        int[] arr = {31, 34, 5, 8, 3, 10, 3};
        System.out.println(isDupsArrray(arr));
    }

    private boolean isDupsArrray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    @Test
    public void testCountChars() {
        String sample2 = "aabbccaaaabdddd";
        countChars(sample2);
    }

    private void countChars(String sample) {
        int count = 1;
        String output = " ";

        for (int i = 0; i < sample.length() - 1; i++) {

            if (sample.charAt(i) == sample.charAt(i + 1)) {
                ++count;

                if(i==sample.length() -2) {
                    output = output + sample.charAt(i) + count;
                }

            } else {
                output = output + sample.charAt(i) + count;
                count = 1;

                if(i==sample.length() -2) {
                    output = output + sample.charAt(i+1) + 1;
                }
            }
        }
        System.out.println("String with count of duplicate chars is: " + output);
    }

    @Test
    public void testCommonWords(){
        String[] arr1 = {"hello", "adios", "goodbye", "hola", "au revoir", "bonjour"};
        String[] arr2 = {"hello", "welcome","thanks", "goodbye", "please"};
        commonWords(arr1, arr2);
    }

    private void commonWords(String[] arr1, String[] arr2){
        ArrayList<String> arr3 = new ArrayList<>();

        for (int i=0; i< arr1.length; i++) {
            for (int j=0; j<arr2.length; j++){
                if (arr1[i].equals(arr2[j])){
                    arr3.add(arr1[i]);
                }
            }
        }
        for (String str: arr3){
            System.out.println(str);
        }
    }

    @Test
    public void testDivNums(){
        int[] arr2 = {29, 30, 50};
        divNums(arr2);
    }

    private void divNums(int[] arr2){
        ArrayList<Integer> arr1 = new ArrayList<>();

        for (int num: arr2){
            for (int i=1; i<= (100 - (100 % num))/num; i++){
                arr1.add(num * i);
                System.out.println(num * i);
            }
        }
    }

    @Test
    public void testDuplicateChars() {
        duplicateChars("AbraCadABraAlakAzam");
    }

    private boolean duplicateChars(String str) {

        if (str.length() == 0 || str == null) {
            return false;
        } else
        {
            int len = str.length();
            HashMap<Character, Integer> countChar = new HashMap<>();
            int j = 0;

            for (int i = 0; i < str.length(); i++) {
                countChar.put(str.charAt(i), j++);
                System.out.println(countChar.entrySet());
            }

            System.out.println(countChar.entrySet());
            return true;
        }
    }

    @Test
    public void testCountIntArr(){
        int[] arr = {3, 6, 40, 8, 90, 6, 3, 88, 6, 7, 3, 6};
        countIntArr(arr);
    }

    private void countIntArr(int[] arr) {

        HashMap<Integer, Integer> intMap = new HashMap<>();
        int len = arr.length;


        for (int i = 0; i < len; i++) {

            if (intMap.containsKey(arr[i])){
                int count = intMap.get(arr[i]);
                ++count;
                intMap.put(arr[i], count);
            }
            else {
                intMap.put(arr[i], 1);
            }
        }
        System.out.println(intMap.entrySet());

        System.out.println(intMap.values());
    }

    @Test
    public void testGuessANum(){
        int max = 100;
        int min = 1;
        Random rand = new Random();
        int value = rand.nextInt((max - min) + 1) + min;
        guessANum(value);
    }

    private void guessANum(int value){
        int max = 100;
        int min = 1;
        int count = 0;
        System.out.println("Number to guess is " + value);

        Random rand = new Random();

        int guess = rand.nextInt((max - min) + 1) + min;
        System.out.println("Guess is " + guess);
        ++count;

        if(guess == value){
            System.out.println("Congrats! U got it in 1 try!! Guessed Num is " + guess );
        }

        while (guess != value) {

            if (guess > value) {
                System.out.println("Guessed Num is " + guess+ " Too high!" );
                max = guess -1;

                guess = rand.nextInt((max - min) + 1) + min;
                ++count;

                if(guess == value){
                    System.out.println("Guessed Num is " + guess + " Congrats! U got it in " + count + " tries!!");
                    break;
                }
            }
            else if (guess < value){
                System.out.println("Guessed Num is " + guess + " Too low!" );
                min = guess +1;

                guess = rand.nextInt((max - min) + 1) + min;
                ++count;

                if(guess == value){
                    System.out.println("Guessed Num is " + guess + " Congrats! U got it in " + count + " tries!!" );
                    break;
                }
            }
        }
    }

    @Test
    public void testMissingNum(){
        int[] arr = {8,7,3,4,5,2,1,9,0};
        missingNum(arr);
    }

    private void missingNum(int[] arr){

        for (int i = 0; i <= 9; i++){
            boolean flag = false;

            for (int j = 0; j < arr.length; j++){
                if (i == arr[j]){
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                System.out.println("Missing num is: " + i);
            }
        }
    }

    @Test
    public void testFib(){
        fib();
    }

    public void fib(){
        int fib1  = 0;
        int fib2 = 1;
        System.out.println(fib1);
        System.out.println(fib2);
        int fib3;

        for (int i = 3; i <= 10; i++)
        {
            fib3 = fib1 + fib2;
            System.out.println(fib3);
            fib1 = fib2;
            fib2 = fib3;
        }
    }

    @Test
    public void testFact(){
        int num = 5;
        System.out.println(fact(5));
    }

    private int fact(int num){
        int fact = 1;
        for (int i = num; i >= 1; i--){
            fact *= i;
        }
        return fact;
    }

    // Varo
    @Test
    public void testMedian(){
        LinkedList<Integer> arrList = new LinkedList<>();
        arrList.add(2);
        arrList.add(3);
        //arrList.add(4);
//    arrList.add(90);
//    arrList.add(87);
//    arrList.add(9);
//    arrList.add(34);
        median(arrList);
    }

    private void median(LinkedList arrList){

        if (arrList.size()%2 == 0){

            int num1 = (arrList.size()/2) -1;
            int num2 = num1 + 1;

            int num3 = (Integer) arrList.get(num1);
            int num4 = (Integer) arrList.get(num2);
            double med = (num3 + num4)/2.0;

            System.out.println("Median of even length list is: " + med);
        }
        else {
            int x = (arrList.size())/2;
            System.out.println("Median of odd length list is: " + arrList.get(x));
        }
    }

//ChargePoint 1
    @Test
    public void testUniqueLettersInWord(){
        String word = "engineering";
        uniqueLettersInWord(word);
    }

    private void uniqueLettersInWord(String word) {
        int count = 1;

        Map<Character, Integer> unique = new HashMap<>();

        unique.put(word.charAt(0), count);

        for (int i = 1; i < word.length(); ++i){

            if(unique.containsKey(word.charAt(i))){
                int newCount = unique.get(word.charAt(i)) + 1;
                unique.put(word.charAt(i), newCount);
            }
            else {
                unique.put(word.charAt(i), count);
            }
        }

        for (char key: unique.keySet()){
            System.out.println("key: " + key + " count: " + unique.get(key));
        }
    }

    //ChargePoint 2
    @Test
    public void testUniqueLettersInWord1(){
        String word = "google"; //g, 2; o, 2; l, 1; e, 1
        String example = "dog";
        uniqueLettersInWord1(word, example);
    }

    private void uniqueLettersInWord1(String word, String example) {
        int count = 1;
        int newCount;
        Map<Character, Integer> unique = new LinkedHashMap<>();
        unique.put(word.charAt(0), count);

        for (int i = 1; i < word.length(); ++i){

            if(unique.containsKey(word.charAt(i))){
                newCount = unique.get(word.charAt(i)) + 1;
                unique.put(word.charAt(i), newCount);
            }
            else {
                unique.put(word.charAt(i), count);
            }
        }

        for (char key: unique.keySet()){
            System.out.println("key: " + key + " count: " + unique.get(key));
        }

        String to = "";
        for (char key: unique.keySet()){
            for (int j = 0; j < example.length(); ++j){
                if (key == example.charAt(j)){
                    to += example.charAt(j);
                    System.out.println("interim to is: " + to);

                    example = example.substring(0,j) + example.substring(j+1);
                    System.out.println("example is : " + example);
                }
            }
        }
        to = to + example;
        System.out.println("final to is: " + to);
    }

    //ChargePoint 3
    @Test
    public void testReverseDigitsInNumber(){
        int num = 8976;
        reverseDigitsInNumber(num);
    }

    private void reverseDigitsInNumber(int num){
        int digit;
         while (num/10 != 0){
             digit = num % 10;
             System.out.print(digit);

             num = num/10;
             //System.out.println("num is " + num);
         }
        System.out.print(num);
    }

    public void testArrayList(){
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(5);
        arrList.add(6);
    }
}
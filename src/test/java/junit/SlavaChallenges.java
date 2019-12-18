package junit;

import cucumber.api.java.sl.In;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SlavaChallenges {

    @Test
    public void challenges() {
        divider("hello()");
        hello();
        divider("hello(\"Say hello!\");");
        hello("Say hello!");
        divider("swapVars();");
        swapVars();
        divider("swapArray();");
        swapArray();
        divider("isDivisibleBy3And4(12);");
        isDivisibleBy3And4(12);
        divider("isDivisibleBy3And4(3);");
        isDivisibleBy3And4(3);
        divider("isDivisibleBy3And4(4);");
        isDivisibleBy3And4(4);
        divider("isDivisibleBy3And4(25);");
        isDivisibleBy3And4(25);
        divider("isDivisibleBy3And4(0);");
        isDivisibleBy3And4(0);
        divider("isDivisibleBy3And4(Integer.MAX_VALUE);");
        isDivisibleBy3And4(Integer.MAX_VALUE);
        divider("isDivisibleBy3And4(Integer.MIN_VALUE);");
        isDivisibleBy3And4(Integer.MIN_VALUE);
        divider("printNumbers(5);");
        printNumbers(5);
        divider("printNumbers(0);");
        printNumbers(0);
        divider("printNumbers(-5);");
        printNumbers(-5);
        int[] arr1 = {3, 5, 2};
        int[] arr2 = new int[0];
        int[] arr3 = null;
        divider("ifEmpty(arr1)");
        System.out.println(ifEmpty(arr1));
        divider("ifEmpty(arr2)");
        System.out.println(ifEmpty(arr2));
        divider("ifEmpty(arr3)");
        System.out.println(ifEmpty(arr3));
    }

    private void divider(String message) {
        System.out.println(">>>>>>>" + message + ">>>>>>>");
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

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    private void swapArray() {
        int[] arr = {5, 2, 9, 7, 3};
        System.out.println(Arrays.toString(arr));

        int temp = arr[2];
        arr[2] = arr[4];
        arr[4] = temp;

        System.out.println(Arrays.toString(arr));
    }


    // div by 3
    // div by 4
    // div by 3 and 4

    private void isDivisibleBy3And4(int num) {
        System.out.println("Num " + num);

        if (num % 12 == 0) {
            System.out.println("Divisible by 3 and 4!");

        } else if (num % 3 == 0) {
            System.out.println("Divisible by 3!");

        } else if (num % 4 == 0) {
            System.out.println("Divisible by 4!");
        } else {
            System.out.println("Not divisible by 3 and 4!");
        }
    }

    private void printNumbers(int num) {
        if (num < 0) {
            for (int i = 0; i >= num; i--) {
                System.out.println(i);
            }
        } else {
            for (int i = 0; i <= num; i++) {
                System.out.println(i);
            }
        }
    }

    private void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private boolean ifEmpty(int[] arr) {
        if (arr == null || arr.length == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Test
    public void testContainsElement() {
        String[] arr = {"hi", "there", "world"};
        Integer[] intArr = {3,5,2,3};

        System.out.println(containsElement(arr, "there"));
        System.out.println(containsElement(intArr, 3));
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
    public void testFizzBuzz() {
        fizzBuzz(20);
    }

    private void fizzBuzz(int num) {
        for (int i = 1; i <= num; i++) {
            if (i % 15 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

    @Test
    public void testIsPrime() {
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(97));
        System.out.println(isPrime(98));
        System.out.println(isPrime(18));
    }


    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        if (num != 2 && num % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i+=2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void testPrimes() {
        primes(100);
    }

    private void primes(int max) {
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= max; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }
        System.out.println(list);
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
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }

    private void printReversedSentence(String str) {
        String[] arr = str.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    @Test
    public void testSort() {
        int[] arr = {5,8,7,8,3,1};
        System.out.println(Arrays.toString(sort(arr)));
    }
    private int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
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
    public void testCountChar() {
        System.out.println(countChar("abcdefa", 'r'));
    }

    int countChar(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    @Test
    public void testReverseSingleStr() {
        System.out.println(reverseSingleStr("WebDriver"));
    }

    private  String reverseSingleStr(String str) {
        int oldLength = str.length();
        for(int i = str.length() - 1; i >= 0; i--) {
            str += str.charAt(i);
        }
        str = str.substring(oldLength);
        return str;
    }

    @Test
    public void testReverse3rd() {
        System.out.println(reverse3rd("Result of reverse"));
        //reouR
    }

    String reverse3rd(String str) {
        String reversed = "";
        int j = 1;
        for(int i = str.length() - 1; i >= 0; i--) {
            if (j % 3 == 0) {
                reversed += str.charAt(i);
            }
            j++;
        }
        return reversed;
    }

    @Test
    public void testUniqueList() {
        List<Object> list1 = new LinkedList<>();
        list1.add(5);
        list1.add(3);
        list1.add(7);
        list1.add(8);

        List<Object> list2 = new LinkedList<>();
        list2.add(3);
        list2.add(8);
        list2.add(9);
        list2.add(11);
        list2.add(12);

        System.out.println(uniqueList(list1, list2));
    }

    private List<Object> uniqueList(List<Object> list1, List<Object> list2) {
        List<Object> result = new LinkedList<>();
        boolean isDuplicate;

        for (Object item1 : list1) {
            isDuplicate = false;
            for (Object item2 : list2) {
                if (item1.equals(item2)) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                result.add(item1);
            }
        }

        for (Object item2 : list2) {
            isDuplicate = false;
            for (Object item1 : list1) {
                if (item2.equals(item1)) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                result.add(item2);
            }
        }
        return result;
    }

    @Test
    public void testFactorial() {
        System.out.println(factorial(10));
    }


    long factorial (int num) {
        if (num == 0) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    @Test
    public void testFibonacci() {
        System.out.println(fibonacci(20));
    }

    long fibonacci(int seq) {
        if (seq <= 1) {
            return seq;
        }
        return fibonacci(seq - 2) + fibonacci(seq - 1);
    }

    @Test
    public void testIsPalindrome() {
        System.out.println(isPalindrome("Abc"));
        System.out.println(isPalindrome("AbccbA"));
        System.out.println(isPalindrome("AbcbA"));
        System.out.println(isPalindrome("civic"));
    }

    boolean isPalindrome(String str) {
        int j = 0;
        for (int i = str.length() - 1; i >= str.length() / 2; i--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            j++;
        }
        return true;
    }

}

package junit;

import java.util.LinkedList;
import java.util.List;

public class PracticeSpet1 {
    private static List<Object> list1 = new LinkedList<>();
    {
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
    }
    private static List<Object> list2 = new LinkedList<>();
    {
        list2.add(5);
        list2.add(22);
        list2.add(3);
        list2.add(44);
        list2.add(1);
    }

    public PracticeSpet1(List<Object> lista, List<Object> listb){
        list1 = lista;
        list2 = listb;
    }

    private static List<Object> uniqueList(List<Object> list1, List<Object> list2 ){

        List<Object> temp = new LinkedList<>();
        Boolean isDuplicate;

        for (Object item1: list1 ){
            isDuplicate = false;
            for (Object item2: list2 ){
                if (item1.equals(item2)) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate){
                temp.add(item1);
            }
        }
        for (Object item2 : list2){
            isDuplicate = false;
            for (Object item1: list1){
                if (item2.equals(item1)) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate){
                temp.add(item2);
            }
        }
        return temp;
    }

    public static void main(String args[]){
        PracticeSpet1 p = new PracticeSpet1(list1, list2);

        System.out.println(p.uniqueList(list1, list2));
    }
}





package junit;

import java.util.LinkedList;
import java.util.List;

public class Brillo {
    //insert element at head and tail of linked list

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        /*System.out.println(list);

        int first = list.get(0);
        int before;
        int after;

        list.add(6); //added at tail


        for(int i=list.size(); i>=0; i--){
            before = list.get(i);
            list.add(before);
        }

    }*/

        for (int i = 0; i < 9; i++) {
            System.out.println(++i);
        }

    }
}

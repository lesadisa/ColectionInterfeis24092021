import svArrList.SvoiArray;
import svArrList.SvoiArraylist;
import svLinkedlist.Linked;
import svLinkedlist.LinkedContainer;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        SvoiArraylist<String> arrList = new SvoiArraylist<String>();
        String a = "1a";
        String b = "2b";
        arrList.add(a);
        arrList.add(b);


        System.out.println("Вывод введенных данных");
        for (int i = 0; i < arrList.size(); i++) {
            System.out.println(arrList.get(i));
        }

        arrList.update(1, "zamena");
        System.out.println("Вывод введенных данных после замены");
        for (int i = 0; i < arrList.size(); i++) {
            System.out.println(arrList.get(i));
        }

        arrList.delete(0);
        System.out.println("Вывод удаления одного элемента");
        for (int i = 0; i < arrList.size(); i++) {
            System.out.println(arrList.get(i));
        }


        Linked<String> stringLinked = new LinkedContainer<>();
        stringLinked.addLast("Pervii");
        stringLinked.addLast("Vtoroi");
        stringLinked.addLast("Tretii");
        System.out.println(stringLinked.size() + " количество вначале linked");
        System.out.println("вывод первоначального списка linked");
        for (int i = 0; i < stringLinked.size(); i++) {
            System.out.println(stringLinked.getElementIndex(i));
        }


        stringLinked.addFirst("Novii v nachale");
        System.out.println("вывод списка добавил спереди linked");
        System.out.println(stringLinked.size() + " количество после прибавления linked");
        for (int i = 0; i < stringLinked.size(); i++) {
            System.out.println(stringLinked.getElementIndex(i));
        }

        stringLinked.addLast("Novii V konze");
        System.out.println("вывод списка добавил szadi linked");
        System.out.println(stringLinked.size() + " количество после прибавления linked");
        for (int i = 0; i < stringLinked.size(); i++) {
            System.out.println(stringLinked.getElementIndex(i));
        }
    }


}

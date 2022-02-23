package DataStructure;

import java.util.*;
//import org.junit.Assert;

public class DataStructure {
    public static void main(String[] args) {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyNode<Integer> myFourthNode = new MyNode<>(80);
        MyNode<Integer> myInsert = new MyNode<>(100);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode, myInsert); // 30 -> 56 -> 100 -> 70
        myLinkedList.insert(mySecondNode, myFourthNode); // 30 -> 80 -> 56 -> 100 -> 70
        myLinkedList.printMyNode();
        boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode) && myLinkedList.tail.equals(myThirdNode);
        result = false;
        //Assert.assertTrue(result);
        System.out.println(myLinkedList.head.getKey());
        System.out.println(myLinkedList.head.getNext().getKey());
        System.out.println(myLinkedList.head.getNext().getNext().getKey());
        System.out.println(result);
    }
}

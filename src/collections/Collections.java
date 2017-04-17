/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;
/**
 *
 * @author Thanh Ha
 */
public class Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       List<String> list=new Vector<String>();
//        list.add("A");
//        list.add("B");
//        list.add("C");
//        list.add("D");
//        for(String str:list)
//        {
//            System.out.println(str);
//        }
//        System.out.println("Queue---------------");
//        Queue<String> listQueue=new PriorityQueue<String>();
//        listQueue.add("A");
//        listQueue.add("B");
//        listQueue.add("C");
//        listQueue.add("D");
//        listQueue.remove();
//        listQueue.add("E");
//        listQueue.poll();
//        for(String str:listQueue)
//        {
//            System.out.println(str);
//        }
        
        Stack<String> stack=new Stack<String>();
        System.out.println("Stack---------------");
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
       // stack.pop();
        System.out.println(stack.size());
        int size=stack.size();
        for(int i=0;i<size;i++)
        {
            System.out.println(stack.pop());
        }
          System.out.println("User For ---------------");
        for(String str:stack)
        {
            System.out.println(str);
        }
    }
    
}

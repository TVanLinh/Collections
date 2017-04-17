/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Thanh Ha
 */
public class MyCollectionsSet {
    public static void main(String[] args)
    {
        Set<String> set=new HashSet<String>();
        set.add("1");
        set.add("1");
        set.add("3");
        set.add("2");
        set.add("1");
        set.add("7");
        set.add("4");
       System.out.println("Hash set: ");
        for(String str:set)
        {
            System.out.println(str);
        }
        
        Set<String> linkSet=new LinkedHashSet<String>();
        linkSet.add("1");
        linkSet.add("1");
        linkSet.add("3");
        linkSet.add("2");
        linkSet.add("1");
        linkSet.add("7");
        linkSet.add("4");
       System.out.println("LinkedHashSet set: ");
        for(String str:linkSet)
        {
            System.out.println(str);
        }
        
        Set<String> treeSet=new TreeSet<String>();
        treeSet.add("1");
        treeSet.add("1");
        treeSet.add("3");
        treeSet.add("2");
        treeSet.add("1");
        treeSet.add("2");
        treeSet.add("1");
        treeSet.add("7");
        treeSet.add("4");
        System.out.println("Tree set: ");
        for(String str:treeSet)
        {
            System.out.println(str);
        }
    }
}

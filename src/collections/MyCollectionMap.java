/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import Test.Person;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Thanh Ha
 */
public class MyCollectionMap {
   
  public static void main(String[] args)
  {
         
        Map<String,Person> hashmap=new HashMap<String,Person>();
        hashmap.put("1", new Person("tran Van LinhA ", "Hoa Binh"));
        hashmap.put("2", new Person("tran Van LinhB ","Hoa Binh"));
        hashmap.put("7", new Person("dddddd ", "Hoa Binh"));
        hashmap.put("3", new Person("tran Van LinhC ", "Hoa Binh"));
        hashmap.put("4", new Person("tran Van Linh D","Hoa Binh"));
        hashmap.put("1", new Person("tran Van Linh E","Hoa Binh"));
        Set<String> set=hashmap.keySet();
        for(String str:set)
        {
            System.out.println("Key: "+str);
            System.out.println(hashmap.get(str.toString()).name);
        }
         System.out.println("User Iterator ");
        
        Map<String,Person> treeMap=new TreeMap<String,Person>();
        treeMap.put("1", new Person("tran Van LinhA ", "Hoa Binh"));
        treeMap.put("2", new Person("tran Van LinhB ","Hoa Binh"));
        treeMap.put("7", new Person("dddddd ", "Hoa Binh"));
        treeMap.put("3", new Person("tran Van LinhC ", "Hoa Binh"));
        treeMap.put("4", new Person("tran Van Linh D","Hoa Binh"));
        treeMap.put("1", new Person("tran Van Linh E","Hoa Binh"));
        Set<String> setTree=treeMap.keySet();
        for(String str:setTree)
        {
            System.out.println("Key: "+str);
            System.out.println(hashmap.get(str.toString()).name);
        }
  }
}

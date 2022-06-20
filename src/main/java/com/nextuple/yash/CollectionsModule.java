package com.nextuple.yash;

import java.util.*;


public class CollectionsModule {

    public void listCollection()
    {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(20);
        arrayList.add(300);
        arrayList.add(3);
        Collections.sort(arrayList);
        for(int i : arrayList) System.out.println(i);
        arrayList.remove(2);
        arrayList.remove(Integer.valueOf(20));
        System.out.println("Modified List: ");
        for(int i : arrayList) System.out.println(i);
    }

    public void setCollection(){
        HashSet <Integer> set=new HashSet<Integer>();
        set.add(10);
        set.add(30);
        set.add(10);
        set.add(20);
        for(int i : set) System.out.println(i);
        Object[] arr= set.toArray();
        for(int i=0; i<arr.length; i++) System.out.println(arr[i]);
    }

    public void mapCollection(){
        HashMap<Integer,String> students=new HashMap<Integer, String>();
        students.put(61,"Yash");
        students.put(18,"Chandu");
        students.put(63,"Yashank");
        Iterator itr=students.keySet().iterator();
        int key;
        while(itr.hasNext())
        {
            key=(Integer)itr.next();
            System.out.println("Key: "+key+", Value: "+students.get(key));
        }
    }

    public static void main(String[] args) {
        CollectionsModule c=new CollectionsModule();
        c.mapCollection();
    }
}

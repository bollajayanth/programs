// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
        int[] arr1={3,2,4,5,2,5,3,4,3};
        Map<Integer, Integer> map=new LinkedHashMap<>();
        for(int i=0;i<arr1.length;i++)
        {
            if(map.containsKey(arr1[i]))
            {
                map.replace(arr1[i], map.get(arr1[i])+1);
            }
            else
            {
                map.put(arr1[i], 1);
            }
        }
        for(int i=0;i<arr1.length;i++)
        {
            if(map.get(arr1[i])!=0)
            {
                for(int k=0;k<map.get(arr1[i]);k++)
                {
                    System.out.println(arr1[i]);
                }
                map.replace(arr1[i], 0);
            }
        }
       
    }
}
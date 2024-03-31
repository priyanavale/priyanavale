import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
public class setexample
{
    public static void main(String[] args)
    {
        Set<String>set1 = new HashSet<String>();
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the no of the element in set:");
        int n= scan.nextInt();
        System.out.println("enter the element present in the group:");
        int i;
        String element;
        for(i=0;i<=n;i++)
        {
            element= scan.nextLine();
            set1.add(element);

        }

        Set<String>set2= new HashSet<String>();
        //Scanner scan=new Scanner(System.in);
        System.out.println("enter the no of the element in set:");
        int m= scan.nextInt();
        System.out.println("enter the element present in the group:");
        int k;
       // String ele;
        for(k=0;k<=m;k++)
        {
            element= scan.nextLine();
            set2.add(element);

        }
        System.out.println("set2= "+set2);
        System.out.println("set1= "+set1);
        Set<String>union_set= new HashSet<String>(set1);
        union_set.addAll(set2);
        System.out.println("Union of the set is = "+union_set);
        Set<String>intersection_set= new HashSet<String>(set1);
        intersection_set.retainAll(set2);
        System.out.println("Intersection of the set is = "+intersection_set);
        Set<String>difference_set= new HashSet<String>(set1);
        difference_set.removeAll(set2);
        System.out.println("the difference of the set is = "+difference_set);
        
}
}


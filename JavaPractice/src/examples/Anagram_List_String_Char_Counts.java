// tip: each public class is put in its own file
package examples;

import java.util.*;

public class Anagram_List_String_Char_Counts
{
    // tip: arguments are passed via the field below this editor
    public static void main(String[] args)
    {
        List<String> li = Arrays.asList(args);
        System.out.println("Argas "+ li);
        
        System.out.println("Enter 1st String");
        String u1 = li.get(0).toLowerCase();
        System.out.println("Enter 2nd String");
        String u2 = li.get(1).toLowerCase();
        System.out.println("Entered Strings are "+ u1 + " , "+ u2);

        int l1 = u1.length();
        int l2 = u2.length();
        System.out.println("Entered Strings length post sort are "+ l1 + " , "+ l2);

        if (l1 != l2)
            System.out.println("Not Anagram");
        else 
        {
            //list sort and equals
            List<String> li1 = Arrays.asList(u1.toLowerCase().split(""));
            List<String> li2 = Arrays.asList(u2.toLowerCase().split(""));

            Collections.sort(li1);
            Collections.sort(li2);

            System.out.println("Entered Strings post list sort are "+ li1 + " , "+ li2);

            String s1 = String.join("", li1);
            String s2 = String.join("", li2);

            if(!s1.equals(s2)) {
                System.out.println("Not Anagram - List Comparison");
            } else {
                System.out.println("Anagram - List Comparison");
            }

            // Arrays Comparison
            char[] ch1 = u1.toCharArray();
            char[] ch2 = u2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            
            System.out.println("Entered Strings post char sort are "+ new String(ch1) + " , "+ new String(ch2));
            if(Arrays.equals(ch1, ch2)) {
                System.out.println("Anagram - Char Array Comparison");
            } else {
                System.out.println("Not Anagram - Char Array Comparison");
            }

            boolean flag = true;
            // charArray count comparison // using chars() method
            for (int i=0; i<l1; i++) {
                char c = u1.charAt(i);
                long c1 = u1.chars().filter(ch -> ch == c).count();
                long c2 = u2.chars().filter(ch -> ch == c).count();
                if (c1 != c2) {
                    System.out.println("Not Anagram - Char Count Comparison");
                    flag = false;
                    break;
                }
            } 
            if (flag) {
                System.out.println("Anagram - Char Count Comparison");
            }
        }
        


    }
}

class GFG { 
  
    // Main driver method 
    public static void main(String[] args) 
    { 
  
        // Creating an empty LinkedList of string type 
        List<String> list = new LinkedList<String>(); 
  
        // Adding elements to above LinkedList 
        // using add() method 
        list.add("Geeks"); 
        list.add("for"); 
        list.add("Geeks"); 
        list.add("Practice"); 
  
        // Storing size of List 
        int n = list.size(); 
  
        // Converting List to array via scope resolution 
        // operator using streams 
        String[] arr 
            = list.stream().toArray(String[] ::new); 
  
        // Printing elements of array 
        // using enhanced for loop 
        for (String x : arr) 
            System.out.print(x + " "); 

        // Converting List to array 
        // using toArray() method 
        String[] arr1 = list.toArray(new String[0]); 
  
        // Printing elements of array 
        // using for-each loop 
        for (String x : arr1) 
            System.out.print(x + " ");
    } 
}

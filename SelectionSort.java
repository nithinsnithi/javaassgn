class SelectionSort
{ 
	// Main method, responsible for the execution of the code 
    public static void main(String args[]) 
    { 
        SelectionSort ob = new SelectionSort(); 
        int a[] = {19,17,25,43,15}; //initializing values to the array
        ob.sort(a); //calling sort method
        System.out.println("Sorted array"); 
        ob.printArray(a); //calling printArray method
    }

    void sort(int a[]) 
    { 
        int len = a.length;      //calculating the length of the array 
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < len-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min = i; 
            for (int j = i+1; j < len; j++) 
                if (a[j] < a[min]) 
                    min = j; 
  
            // Swap the found minimum element with the first element 
            int temp = a[min]; 
            a[min] = a[i]; 
            a[i] = temp; 
        } 
    } 
  
    // Prints the sorted array 
    void printArray(int a[]) 
    { 
        int len = a.length; 
        for (int i=0; i<len; ++i)    //printing the sorted array 
            System.out.print(a[i]+" "); 
        System.out.println(); 
    } 
  
     
} 
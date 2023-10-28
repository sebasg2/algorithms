package sorting.generics;

public class TestProgram {

	   private static <T> String vectorToString(String text, T[] vector) {
	      String s = text + " {";

	      for (int i=0; i < vector.length; i++)
	         s = s + vector[i].toString() + ((i < vector.length - 1) ? ", " : "");

	      s = s + "}";

	      return s;
	   }
	    
	   public static void main(String[] args) {

	      Integer [] numbers = {3, 11, 1, 5, 9, 10, 15, 25, 2, 8, 7, 13, 6, 4, 30};        
	      Integer [] arrayOfInteger;
	        
	      Double [] decimals = {3.5, 11.0, 1.5, 5.75, 9.0, 10.5, 15.0, 25.5, 2.25, 8.5, 7.0, 13.5, 6.25, 4.0, 30.5};
	      Double [] arrayOfDouble;
	        
	      System.out.println(vectorToString("Numbers          ", numbers));        
	      System.out.println(vectorToString("Decimals         ", decimals));    

	      IPerson [] people = new Person [] { new Person(50, "John", "Smith"), new Person(20, "Jane", "Johnson"),
	                                          new Person(10, "Mary", "White"), new Person(40, "Peter", "Collins"),
	                                          new Person(30, "Julia", "Smith") };
	      IPerson [] arrayOfPerson;
	        
	      System.out.println(vectorToString("People           ", people) + "\n");

	      // Bubble sort
	        
	      ISort bubbleSort = new BubbleSort();
	        
	      arrayOfInteger = numbers.clone();
	        
	      bubbleSort.sort(arrayOfInteger, new AscendingOrder());
	      System.out.println(vectorToString("Bubble sort      ", arrayOfInteger));
	      bubbleSort.sort(arrayOfInteger, new DescendingOrder());
	      System.out.println(vectorToString("Bubble sort      ", arrayOfInteger) + "\n");
	                
	      arrayOfDouble = decimals.clone();
	        
	      bubbleSort.sort(arrayOfDouble, new AscendingOrder());
	      System.out.println(vectorToString("Bubble sort      ", arrayOfDouble)); 
	      bubbleSort.sort(arrayOfDouble, new DescendingOrder());
	      System.out.println(vectorToString("Bubble sort      ", arrayOfDouble) + "\n");
	        
	      arrayOfPerson = people.clone();
	        
	      bubbleSort.sort(arrayOfPerson, new AscendingOrder());
	      System.out.println(vectorToString("Bubble sort      ", arrayOfPerson)); 
	      bubbleSort.sort(arrayOfPerson, new DescendingOrder());
	      System.out.println(vectorToString("Bubble sort      ", arrayOfPerson) + "\n");
	      
	      //Selection Sort
	      
	      ISort selectionSort = new SelectionSort();
	        
	      arrayOfInteger = numbers.clone();
	        
	      selectionSort.sort(arrayOfInteger, new AscendingOrder());
	      System.out.println(vectorToString("Selection sort      ", arrayOfInteger));
	      selectionSort.sort(arrayOfInteger, new DescendingOrder());
	      System.out.println(vectorToString("Selection sort      ", arrayOfInteger) + "\n");
	                
	      arrayOfDouble = decimals.clone();
	        
	      selectionSort.sort(arrayOfDouble, new AscendingOrder());
	      System.out.println(vectorToString("Selection sort      ", arrayOfDouble)); 
	      selectionSort.sort(arrayOfDouble, new DescendingOrder());
	      System.out.println(vectorToString("Selection sort      ", arrayOfDouble) + "\n");
	        
	      arrayOfPerson = people.clone();
	        
	      selectionSort.sort(arrayOfPerson, new AscendingOrder());
	      System.out.println(vectorToString("Selection sort      ", arrayOfPerson)); 
	      selectionSort.sort(arrayOfPerson, new DescendingOrder());
	      System.out.println(vectorToString("Selection sort      ", arrayOfPerson) + "\n");
	      
	      //Insertion Sort
	      
	      ISort insertionSort = new InsertionSort();
	        
	      arrayOfInteger = numbers.clone();
	        
	      insertionSort.sort(arrayOfInteger, new AscendingOrder());
	      System.out.println(vectorToString("Insertion sort      ", arrayOfInteger));
	      insertionSort.sort(arrayOfInteger, new DescendingOrder());
	      System.out.println(vectorToString("Insertion sort      ", arrayOfInteger) + "\n");
	                
	      arrayOfDouble = decimals.clone();
	        
	      insertionSort.sort(arrayOfDouble, new AscendingOrder());
	      System.out.println(vectorToString("Insertion sort      ", arrayOfDouble)); 
	      insertionSort.sort(arrayOfDouble, new DescendingOrder());
	      System.out.println(vectorToString("Insertion sort      ", arrayOfDouble) + "\n");
	        
	      arrayOfPerson = people.clone();
	        
	      insertionSort.sort(arrayOfPerson, new AscendingOrder());
	      System.out.println(vectorToString("Insertion sort      ", arrayOfPerson)); 
	      insertionSort.sort(arrayOfPerson, new DescendingOrder());
	      System.out.println(vectorToString("Insertion sort      ", arrayOfPerson) + "\n");
	      
	      //Lomuto Quick Sort
	      
	      ISort lomutoQuickSort = new LomutoQuickSort();

	      arrayOfInteger = numbers.clone();

	      lomutoQuickSort.sort(arrayOfInteger, new AscendingOrder());
	      System.out.println(vectorToString("Lomuto QuickSort    ", arrayOfInteger));
	      lomutoQuickSort.sort(arrayOfInteger, new DescendingOrder());
	      System.out.println(vectorToString("Lomuto QuickSort    ", arrayOfInteger) + "\n");

	      arrayOfDouble = decimals.clone();

	      lomutoQuickSort.sort(arrayOfDouble, new AscendingOrder());
	      System.out.println(vectorToString("Lomuto QuickSort    ", arrayOfDouble));
	      lomutoQuickSort.sort(arrayOfDouble, new DescendingOrder());
	      System.out.println(vectorToString("Lomuto QuickSort    ", arrayOfDouble) + "\n");

	      arrayOfPerson = people.clone();

	      lomutoQuickSort.sort(arrayOfPerson, new AscendingOrder());
	      System.out.println(vectorToString("Lomuto QuickSort    ", arrayOfPerson));
	      lomutoQuickSort.sort(arrayOfPerson, new DescendingOrder());
	      System.out.println(vectorToString("Lomuto QuickSort    ", arrayOfPerson) + "\n");
	      
	      
	      //HoareQuickSort
	      
	      Sort hoareQuickSort = new HoareQuickSort(); // Change to HoareQuickSort

	      arrayOfInteger = numbers.clone();

	      hoareQuickSort.sort(arrayOfInteger, new AscendingOrder());
	      System.out.println(vectorToString("Hoare QuickSort    ", arrayOfInteger)); // Change to Hoare QuickSort
	      hoareQuickSort.sort(arrayOfInteger, new DescendingOrder());
	      System.out.println(vectorToString("Hoare QuickSort    ", arrayOfInteger) + "\n"); // Change to Hoare QuickSort

	      arrayOfDouble = decimals.clone();

	      hoareQuickSort.sort(arrayOfDouble, new AscendingOrder());
	      System.out.println(vectorToString("Hoare QuickSort    ", arrayOfDouble)); // Change to Hoare QuickSort
	      hoareQuickSort.sort(arrayOfDouble, new DescendingOrder());
	      System.out.println(vectorToString("Hoare QuickSort    ", arrayOfDouble) + "\n"); // Change to Hoare QuickSort

	      arrayOfPerson = people.clone();

	      hoareQuickSort.sort(arrayOfPerson, new AscendingOrder());
	      System.out.println(vectorToString("Hoare QuickSort    ", arrayOfPerson)); // Change to Hoare QuickSort
	      hoareQuickSort.sort(arrayOfPerson, new DescendingOrder());
	      System.out.println(vectorToString("Hoare QuickSort    ", arrayOfPerson) + "\n"); // Change to Hoare QuickSort
	      
	      
	      
	   }
	   
	}
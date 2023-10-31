//SpecificMethodDemo


package generics;

public class SpecificMethodDemo {

	public static void main(String[] args) {
		String[] strArray= {"ONE","TWO","THREE","FOUR","FIVE"};
		Integer[] intArray= {1,2,3,4,5};
		Double[] doubleArray= {1.0,2.0,3.0,4.0,5.0};
		displaystrArray(strArray);
		displayintArray(intArray);
		displaydoubleArray(doubleArray);
		

	}
	private static void displaystrArray(String[] strArray) {
		for(String s:strArray) {
			System.out.println(s);
		}
	}
	private static void displayintArray(Integer[] intArray) {
		for(Integer i:intArray) {
			System.out.println(i);
		}
	}
	private static void displaydoubleArray(Double[] doubleArray) {
		for(Double d:doubleArray) {
			System.out.println(d);
		}
	}

}
//Generic method
package generics;

public class GenericDemo {

	public static void main(String[] args) {
		String[] strArray= {"ONE","TWO","THREE","FOUR","FIVE"};
		Integer[] intArray= {1,2,3,4,5};
		Double[] doubleArray= {1.0,2.0,3.0,4.0,5.0};
		displayArray(strArray);
		displayArray(intArray);
		displayArray(doubleArray);
		

	}
	//generic method
	private static <T> void displayArray(T[] array) {
		for(T t:array) {
			System.out.println(t);
		}
	}

}
package generics;

public class GenericClass <T>{
      T data;
      void set(T data) {
    	  this.data=data;
      }
      T get()
      {
    	  return data;
      }
}


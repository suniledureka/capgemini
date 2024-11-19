import java.util.*;

class LambdaTest1 
{
	public static void main(String[] args) 
	{
		List<Integer> marks = Arrays.asList(85, 79, 66, 92, 89, 60);
	    System.out.println("original marks = " + marks);

		//Collections.sort(marks);
		
		/*
		Comparator<Integer> comp1 = (Integer x, Integer y) -> {
				 if(x > y)
					 return -1;
				 else
					 return 1;
			
		};
		*/
		
		/*
		Comparator<Integer> comp1 = (x, y) -> {
				 if(x > y)
					 return -1;
				 else
					 return 1;
			
		};
 	    */
		Comparator<Integer> comp1 = (x, y) -> (x > y) ? -1 : 1;

		//Collections.sort(marks, comp1);
		marks.sort(comp1);
		System.out.println("marks in ascending order = " + marks);
	}
}

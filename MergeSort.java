package sorting;

import java.util.Arrays;

public class MergeSort {


	public static void mergesort(int[] array) {
	

		 mergesort(array, new int[array.length], 0, array.length-1);	
	}
	
   public static void mergesort(int[] array ,int[] temp, int leftStart, int rightEnd)
   {
   	if(leftStart >= rightEnd) {
   		return;
   	}
   	int middle = (leftStart+ rightEnd)/2;
   	mergesort(array, temp, leftStart, middle);
   	mergesort(array, temp, middle+1, rightEnd);
   	mergehalves(array, temp,leftStart,rightEnd);
   	
   	System.out.println(Arrays.toString(array));

    
   	
   }
   
   public static void mergehalves(int[] array, int[] temp, int leftStart, int rightEnd) {
   	int leftEnd=(rightEnd+ leftStart)/2;
   	int rightStart = leftEnd+1;
   	int size= rightEnd-leftStart+1;
   	int left= leftStart;
   	int right= rightStart;
   	int index= leftStart;
   	int count=0;
   	
   	
   	while( left <= leftEnd && right <=rightEnd)
   	{
   		if(array[left]==array[right]) {
   			temp[index]= array[left];
   			++count;
   			left++;
   		}
   		
   		else {
   			temp[index]=array[right];
   			right++;
   		}
   		index++;
          

   		
   		}
   	
   	System.arraycopy(array, left, temp, index, leftEnd- left+1);// either of these two gets executed
   	System.arraycopy(array, right, temp, index, rightEnd-right +1);
   	System.arraycopy(temp, leftStart, array,leftStart, size);
   
   	 if(count>size/2)
   	 {
   		 System.out.println(count);
   	 }

	}
   public static void main(String[] args) 
   {
	   int [ ] num = {1,9,8,2,0,0,0};
	   mergesort(num);
	 
	  
   }
	}




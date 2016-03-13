package wdsr.exercise1.conversions;

import java.util.Arrays;
import java.util.Objects;

/**
 * Created by Marek on 14.02.2016.
 */
public class ArrayConverter {
	/**
	 * Converts an array of strings to an array of integers.
	 * @param strings to be converted to integers.
	 * @return array of integers corresponding to the provided strings. Never null.
	 * @throws NullPointerException if the argument is null.
	 * @throws NumberFormatException if any of the strings does not represent an integer value.
	 */
    public int[] convertToInts(String[] strings) {
    	if (strings == null || strings.length==0) {
        	throw new NullPointerException("Null or empty argument: "+strings);
        }    	
      	int[] arr =  Arrays.stream(strings).filter(Objects::nonNull).mapToInt(Integer::valueOf).toArray();
      	
      	if(arr == null){
      		throw new NullPointerException("Created Int array is null");
      	}

      	for(Integer i : arr){
      		if(!(i instanceof Integer)){
      			throw new NumberFormatException("This string vale does not represent integer value");
      		}
      	}
      	return arr;
    }
}

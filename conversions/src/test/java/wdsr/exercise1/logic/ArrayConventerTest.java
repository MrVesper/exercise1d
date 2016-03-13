package wdsr.exercise1.logic;

import org.junit.Test;
import org.junit.Before;
import wdsr.exercise1.conversions.ArrayConverter;

public class ArrayConventerTest {
	private ArrayConverter arrayConverter;
	
	@Before
	public void setup() {
	 arrayConverter = new ArrayConverter();
	}
	
	@Test(expected=NumberFormatException.class)
	public void notIntegerTest_shouldRaiseAnNumberExceptionWhenArrayContainsValueWithIsNotAnInteger() {
			String[] values = {"Jacek"};
			arrayConverter.convertToInts(values);
	}

	@Test(expected=NullPointerException.class)
	public void nullArgumentTest_shouldRaiseAnExceptionForNullArgument() {
			String[] values = null;
			arrayConverter.convertToInts(values);
	}
	
	@Test(expected=NullPointerException.class)
	public void nullIntArrayTest_shouldRaiseAnExceptionWhenCreatedIntArrayIsNull() {
			String[] values = null;
			int[] arr = arrayConverter.convertToInts(values);
	}
	
	@Test(expected=NullPointerException.class)
	public void emptyArgumentTest_shouldRaiseAnExceptionForEmptyArgument() {
			String[] values = {};
			arrayConverter.convertToInts(values);
	}

}

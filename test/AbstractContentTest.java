package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import content.AbstractContent;


public abstract class AbstractContentTest<T> implements ContentTest{
	AbstractContent<T> test;
	
	protected abstract AbstractContent<T> createContent();
	@Before
	public void init()
	{
		test = createContent();
	}
	
	@Test
	protected abstract void testGetValue();
	
	@Test
	public void testToString() {
		assertEquals(test.toString(), "AbstractContent [value=" + test.getValue() + "]");
	}
}

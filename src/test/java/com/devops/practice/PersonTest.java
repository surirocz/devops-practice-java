package com.devops.practice;
import static org.junit.Assert.*;

import static org.mockito.Mockito.*;
import org.junit.Test;
import java.util.List;


public class PersonTest {
		  
    @Test  
    public void testGetName(){
        Person person = new Person("John", "Japan");
        assertEquals(person.getName(), "John");

    }

    @Test 
    public void testGetCountry(){
        Person person = new Person("Alice", "Germany");
        assertEquals(person.getCountry(), "Germany");

    } 

    @Test 
    public void testSetName(){
        Person person = new Person("Ruth", "Japan");
        assertEquals(person.getName(), "Ruth");
        person.setName("Bob");
        assertEquals(person.getName(), "Bob");

    } 

    @Test 
    public void testSetCountry(){
        Person person = new Person("Jeremy", "Tuvalu");
        assertEquals(person.getCountry(), "Tuvalu");
        person.setCountry("Papua");
        assertEquals(person.getCountry(), "Papua");
    }
    
    @Test
    public void testUsingMock() {
    	// Here the list class size and get methods are mocked.
    	List<String> testList = mock(List.class);
    	testList.add("item 1");
    	testList.add("Item 2");
    	when(testList.size()).thenReturn(2);
    	assertEquals(2, testList.size());
    	
    	when(testList.get(0)).thenReturn("item 1");
    	when(testList.get(1)).thenReturn("item 2");
    	
    	assertEquals("item 1", testList.get(0));
    	assertEquals("item 2", testList.get(1));
    }

}

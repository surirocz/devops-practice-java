package com.devops.practice;
import static org.junit.Assert.*;
//import static org.mockito.Mockito.*;
import org.junit.Test;
//import java.util.List;


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
    
//    @Test 
//    public void testWithAMock() {
//    	List<String> mockList = Mockito.mock(List.class);
//		when(mockList.size()).thenReturn(5);
//		assertTrue(mockList.size()==5);
//    }

}

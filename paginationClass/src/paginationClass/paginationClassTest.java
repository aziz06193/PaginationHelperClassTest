package paginationClass;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;


public class paginationClassTest {
	public ArrayList<Character> arr;
	public paginationClassTest() {
		arr = new ArrayList<Character>(
				Arrays.asList('a','g','p','e','q','l','m','b','z','t'));
		System.out.println("this is array "+arr);

	}
	
	@Test
    public void TestpageCount() {
		//this function takes input how many items should be on each page and 
		//total how many pages should be present 
		int expectedcount = 4;int itemsperpage = 3;
		paginationClass pgc = new paginationClass(arr, itemsperpage);
    	Assert.assertEquals(pgc.pageCount(), expectedcount);
    }
    @Test
    public void TestitemCount() {
    	//return the total count of items in array
    	int expecteditems = 10;int itemsperpage = 3;
    	paginationClass pgc = new paginationClass(arr, itemsperpage);
    	Assert.assertEquals(pgc.itemCount(), expecteditems);
    }
    
    
    @Test
    public void TestpageItemCount() {
    	//this function takes input how many items are on each page
    	//when page index is given, it returns the count of items on that page index
    	int expected = 1; int pageindex = 3;int itemsperpage = 3;
    	paginationClass pgc = new paginationClass(arr, itemsperpage);
    	Assert.assertEquals(pgc.pageItemCount(pageindex), expected);
    }
    @Test
    public void TestpageIndex() {
    	//this function takes input how many items on each page
    	//when item index is given, it returns the index of page on which that item is present.
    	int expected = 1; int itemindex = 4;int itemsperpage = 3;
    	
    	paginationClass pgc = new paginationClass(arr, itemsperpage);
    	Assert.assertEquals(pgc.pageIndex(itemindex), expected);
    }
	
}

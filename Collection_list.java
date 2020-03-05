package collections_project;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection_list {
	public static void main(String[] args) 
	{
		ArrayList<String> list=new ArrayList<String>();
        list.add("pune");
        list.add("Hyderabad");
        list.add("chennai");
        list.add("madras");
        list.add("Delhi");
        list.add("kolkatha");
        list.add("lucknow");
        list.add("madurai");
        list.add("dubai");
        list.add("singapore");
        Iterator itr=list.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
        System.out.println("contents of array list before deleting are : " +list);
         list.remove(2);
        System.out.println("contents of array list are : " +list);
        list.set(3," Jangaon");
        System.out.println("contents of array list are : " +list);

        		}
	
	

}

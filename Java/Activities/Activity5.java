package activities;


abstract class Book
{
	String title;
	 
	abstract void setTitle(String s);
	
	String getTitle()
	{
		return title;
	}
	
	
}

 class MyBook extends Book
 {
		public void setTitle(String s)
		{
			title=s;
		}
 }
		
		public class Activity5 {

			public static void main(String[] args)	
			{
			
			String title = "This is my example";
			
			 MyBook obj1 = new MyBook();
			 
			 obj1.setTitle(title);
			 
			 System.out.println("The Title is" +" "+ obj1.getTitle());
			 
			}		
	
}

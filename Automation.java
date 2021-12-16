package week3.day1;

public class Automation extends MultipleLanguage  implements Language,TestTool {
	
	public void java()
	{
		System.out.println("Java Language");
	}
	public void selenium()
	{
		System.out.println("Testing Tool Selenium");
	}
	public void ruby()
	{
		System.out.println("Ruby Language");
	}
	public static void main(String[] args) {
		
		Automation obj=new Automation();
		obj.java();
		obj.selenium();
		obj.ruby();
		obj.python();
		

	}

}

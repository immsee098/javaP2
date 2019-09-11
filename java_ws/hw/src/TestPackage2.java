
import com.herb.*;
class ChildHerb extends MyHerb{
	public  void printInfo(){
		System.out.println("MyHerb  protected tel : " + tel);
		System.out.println("MyHerb  default grade : " + grade);  
		System.out.println("MyHerb  public addr : " + addr);
	}
}//class

public class TestPackage2{
	public static void main(String[] args) {

		MyHerb h=new MyHerb();  
		h.displayHerb();
		System.out.println("MyHerb  protected tel : " + h.tel);  
		System.out.println("MyHerb  default grade : " + h.grade); 
		System.out.println("MyHerb  public addr : " + h.addr);

	    ChildHerb ch = new ChildHerb();		
		System.out.println("ChildHerb, MyHerb  default tel : " + ch.tel);  
		System.out.println("ChildHerb, MyHerb  protected grade : " + ch.grade);  
		System.out.println("ChildHerb, MyHerb  public addr : " + ch.addr);
	}
}
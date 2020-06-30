import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child c=new Child();
		
	Child c1 = new Child(10,5);
		
		//Only parent class methods accessible called dynamic polymorphism
		
		Parent p =new Child ();
		
		
		//This parent dont have knowledge about child class
			//Child c =new Parent();
		
		ArrayList<Integer> a =new ArrayList<Integer>();
		a.add(1);
		
		
		String s="Vivek";
		s+="Hai";
		
		
		s=s.concat("hello");
		System.out.println(s);
		String str ="VIVEK";
		
		char ch;
		int k;
		
			for (ch='A'; ch<='Z'; ch++)
		{
				k=0;
			for (int i=0; i<=str.length()-1;i++)
			{
				char expch=str.charAt(i);
				if(ch==expch)
				{
					k++;
					System.out.println("the" + expch + "is present at" + k  + "times");
				}
				
				
			}
			
		}
		
		
	}

}

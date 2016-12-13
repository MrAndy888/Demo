package dome;

import java.util.ArrayList;
import java.util.List;

public class test {
	
	
	public static void main(String[] args) {
		
		String str="woaijavawozhenaijava";
		for(char s:str.toCharArray()){
			System.out.println(s);
		}
		
		
		List<t> list=new ArrayList<t>();
		t tt =new t();
		tt.id="1";
		tt.name="李四";
		list.add(tt);
		
		for(t ls:list){
			System.out.println("id是："+ls.id+"名字："+ls.name);
		}
		
		
		
		String t="/ntttttt ";
		System.out.println(t.trim());
		
		System.out.println(3%2);
		
		String a="aaaa";
		String b="aaaa";
		if(a.equals(b)){
			System.out.println("aaaaa");
			System.out.println(a.equals(b));
			System.out.println(!a.equals(b));
		}else{
			System.out.println("bbbbb");
			System.out.println(a.equals(b));
			System.out.println(!a.equals(b));
		}
		
	} 
	

	

}




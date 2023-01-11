package stringMethodsDTO;

public class TabletTester {
	public static void main(String args[]) {
		String str="Maha";
		System.out.println(str.toString());
		
		Tablet tb=new Tablet();
		tb.setId(1);
		tb.setName("Dolo");
		System.out.println(tb);
		
		Tablet tb1=new Tablet();
		tb1.setId(2);
		tb1.setName("Pain Killer");
		System.out.println(tb1);
		
        System.out.println(tb==tb1);
        System.out.println(tb==tb1);
        System.out.println(tb.equals(tb1));
        System.out.println(tb.hashCode());
        System.out.println(tb1.hashCode());
		
		
	}


}

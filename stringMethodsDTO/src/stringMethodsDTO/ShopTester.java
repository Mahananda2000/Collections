package stringMethodsDTO;

public class ShopTester {
	public static void main(String args[]) {
		String str="Maha";
		System.out.println(str.toString());
		
		Shop sp=new Shop();
		sp.setId(1);
		sp.setName("Bookstall Shop");
		System.out.println(sp);
		
		Shop sp1=new Shop();
		sp1.setId(2);
		sp1.setName("Medical Shop");
		System.out.println(sp1);
		
        System.out.println(sp==sp);
        System.out.println(sp==sp1);
        System.out.println(sp.equals(sp1));
        System.out.println(sp.hashCode());
        System.out.println(sp1.hashCode());
		
		
	}


}

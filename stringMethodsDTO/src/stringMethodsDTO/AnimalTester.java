package stringMethodsDTO;

public class AnimalTester {
	public static void main(String args[]) {
		String str="Maha";
		System.out.println(str.toString());
		
		Animal an=new Animal();
		an.setId(1);
		an.setName("Elephant");
		System.out.println(an);
		
		Animal an1=new Animal();
		an1.setId(2);
		an1.setName("Elephant");
		System.out.println(an1);
		
        System.out.println(an==an);
        System.out.println(an==an1);
        System.out.println(an.equals(an1));
        System.out.println(an.hashCode());
        System.out.println(an1.hashCode());
		
		
	}

}

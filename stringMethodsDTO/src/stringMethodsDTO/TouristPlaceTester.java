package stringMethodsDTO;

public class TouristPlaceTester {

	public static void main(String args[]) {
		String str="Maha";
		System.out.println(str.toString());
		
		TouristPlace tp=new TouristPlace();
	    tp.setId(1);
		tp.setName("Honnavara");
		System.out.println(tp);
		
		TouristPlace tp1=new TouristPlace();
		tp1.setId(2);
		tp1.setName("goa");
		System.out.println(tp1);
		
        System.out.println(tp==tp);
        System.out.println(tp==tp1);
        System.out.println(tp.equals(tp1));
        System.out.println(tp.hashCode());
        System.out.println(tp1.hashCode());
		
		
	}

}

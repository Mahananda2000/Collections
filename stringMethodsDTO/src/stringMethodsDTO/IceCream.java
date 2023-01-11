package stringMethodsDTO;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class IceCream {

	
	public IceCream(){
		System.out.println(this.getClass().getSimpleName()+"object is created");
	}
	
	private int id;
	private String name;
	
	@Override
	public int hashCode() {
		return this.id;
	}
	
	@Override
	public boolean equals(Object obj) {
		IceCream ic=(IceCream) obj;
		if(this.getName().equals(ic.getName())) {
			return true;
			
		}
		return false;
		
	}
	@Override
	public String toString() {
		return "IceCream - {Id="+this.getId()+",Name="+this.getName()+"}";
	}
	

}




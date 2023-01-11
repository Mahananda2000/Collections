package stringMethodsDTO;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Hospital {
	public Hospital() {
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
		Hospital hl=(Hospital) obj;
		if(this.getName().equals(hl.getName())) {
			return true;
			
		}
		return false;
		
	}
	@Override
	public String toString() {
		return "Hospital - {Id="+this.getId()+",Name="+this.getName()+"}";
	}
	

	}



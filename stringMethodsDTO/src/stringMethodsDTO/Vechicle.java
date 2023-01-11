package stringMethodsDTO;


	import lombok.Getter;
	import lombok.Setter;

	@Setter
	@Getter
	public class TouristPlace {
		
		public TouristPlace(){
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
			TouristPlace tp=(TouristPlace) obj;
			if(this.getName().equals(tp.getName())) {
				return true;
				
			}
			return false;
			
		}
		@Override
		public String toString() {
			return "TouristPlace - {Id="+this.getId()+",Name="+this.getName()+"}";
		}
		


}

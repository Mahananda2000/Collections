package com.xworkz.terrorist.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor




	public class TerroristDTO extends AbstractAuditDTO {
		
		

		
		@NotNull(message = "Terrorist name cannot be pointing to the null")
		@Size(min = 4 ,max = 23,message = "Name is invalid it should contain min 3 and max 23 letters")
		private String name;
		@NotNull
		@Min (value = 1,message = "Age should be greater than 1 or less than 100")
		@Max(value = 100,message = "Age should be greater than 1 or less than 100")
		private int age;
		@NotNull(message = "Country should not be null fill country name there")
		@Size (min = 3 , max = 20,message = "Country name is invalid it should be contain more then 3 and less than 20 letters")
		private String country;
		private boolean alive;
		private boolean prison;
		@NotNull(message = "specialization should not be null fill specialization name there")
		@Size (min = 3 , max = 20,message = "specialization is invalid it should be contain more then 3 and less than 20 letters")
		private String specialization;
		@NotNull(message = "Organization should not be null fill organization name there")
		@Size (min = 3 , max = 20,message = "Organization name is invalid it should be contain more then 3 and less than 20 letters")
		private String organization;
		
		
}



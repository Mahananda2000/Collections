package com.xworkz.soldier.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
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
@AllArgsConstructor
@NoArgsConstructor

public class SoldierDTO extends AbstractAuditDTO {
	
	@NotNull(message = "Terrorist name cannot be pointing to the null")
	@NotBlank
	@Size(min=3,max=20,message="name size must be grater than 3 less than 20")
	private String name;
	@Min(0)
	@Max(10000)
	private int id;
	
	@NotNull
	@NotBlank
	@Size(min=5,max=25,message="rank size must be greaterthan 5 and less than 25")
	private String rank;
	
	@NotNull
	@NotBlank
	@Size(min=5,max=40,message="batallion size must be greater than 5 less than 40")
	private String batallion;
	
	@NotNull
	@NotBlank
	@Size(min=3,max=30,message="county size must be greater than 3 and lress than 30")
	private String country;
	
}

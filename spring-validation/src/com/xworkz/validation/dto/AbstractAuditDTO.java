package com.xworkz.validation.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
@NoArgsConstructor

public abstract class AbstractAuditDTO implements Serializable {
	
	private String createdby;
	private LocalDateTime createdAt;
	private String updatedby;
	private LocalDateTime updatedAt ;
	

}

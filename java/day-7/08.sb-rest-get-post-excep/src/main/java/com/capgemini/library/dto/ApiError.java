package com.capgemini.library.dto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiError {
	private String message;
	private String type;
	private String date;
	private String path;
}

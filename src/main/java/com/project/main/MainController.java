package com.project.main;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@RequestMapping(value="/getName",produces=MediaType.APPLICATION_JSON_VALUE)
	public UserDto getName(@RequestParam String name){
		
		UserDto userDto = new UserDto();
		
		userDto.setName(name);
		userDto.setMessage("SUCCESS " +name);
		
		return userDto;
		
		
	}

}

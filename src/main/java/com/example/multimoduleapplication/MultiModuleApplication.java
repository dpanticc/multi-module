package com.example.multimoduleapplication;

import com.example.multimodulelibrary.service.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com.example")
@RestController
public class MultiModuleApplication {
	private final MyService myService;

	public MultiModuleApplication(MyService myService){
		this.myService = myService;
	}

	@GetMapping("/")
	public String home(){
		return myService.message();
	}
	public static void main(String[] args) {
		SpringApplication.run(MultiModuleApplication.class, args);
	}

}

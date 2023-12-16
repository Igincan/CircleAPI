package igincan.circleapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CircleApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CircleApiApplication.class, args);
	}

	@PostMapping("/is_inside")
	public String is_inside(@RequestBody TestRequestBody testRequestBody) {
		return "Request message is " + testRequestBody.getMessage() + " and value is " + testRequestBody.getValue() + ".";
	}

}

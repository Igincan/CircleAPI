package igincan.circleapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import igincan.circleapi.models.IsInsideRequestBody;

@SpringBootApplication
@RestController
public class CircleApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CircleApiApplication.class, args);
	}

	@PostMapping("/is_inside")
	public boolean is_inside(@RequestBody IsInsideRequestBody testRequestBody) {
		return testRequestBody.circle().is_inside(testRequestBody.point());
	}

}

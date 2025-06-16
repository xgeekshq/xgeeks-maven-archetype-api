package ${package}.greeting;

import ${package}.api.GreetingApi;
import ${package}.model.GetGreeting200Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController implements GreetingApi{
    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Override
    public ResponseEntity<GetGreeting200Response> getGreeting() {
        String greeting = greetingService.greeting("test");

        GetGreeting200Response response = new GetGreeting200Response().message(greeting);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}

package ${package}.greeting;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    private static final String GREETING_TEMPLATE = "Hello %s";

    public String greeting(String name) {
        return String.format(GREETING_TEMPLATE, name);
    }
}

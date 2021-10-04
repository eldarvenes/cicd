package test.app.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @GetMapping ("/")
    public String index() {
        return "First cicd-test";
    }
}

package ie.atu.calculate;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateController {


    @GetMapping("/calculate")
    public Calculator calculate(@RequestParam int num1, @RequestParam int num2, @RequestParam String operation){

        Calculator newCalculation = new Calculator(operation, 0);
        return newCalculation.calculate(num1,num2,operation);
    }
}

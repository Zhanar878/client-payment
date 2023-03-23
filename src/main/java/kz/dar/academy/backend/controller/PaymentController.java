package kz.dar.academy.backend.controller;

import kz.dar.academy.backend.service.PaymentService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Data
@RestController
@RequestMapping("/payment")
public class PaymentController {
    @GetMapping("/check")
    public String check() {
        return "client-payment is working";
    }
@Autowired
private PaymentService paymentService;


}

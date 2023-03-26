package kz.dar.academy.backend.controller;

import kz.dar.academy.backend.model.PaymentModel;
import kz.dar.academy.backend.service.PaymentService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

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

    @GetMapping("/all")
    public List<PaymentModel> getAllPayments() {
        return paymentService.getAllPayments();
    }
    @PostMapping
    public ResponseEntity<String> createPayment(@Valid @RequestBody PaymentModel paymentModel){
        paymentService.createPayment(paymentModel);
            return new ResponseEntity<>("Successfully created", HttpStatus.OK);

        }
    @GetMapping("/{paymentId}")
    public PaymentModel getPaymentByID(@PathVariable String paymentId){
        return paymentService.getPaymentById(paymentId);
    }
    @PutMapping("/{paymentId}")
    public ResponseEntity<String> updatePaymentById(@PathVariable String paymentId,
                                                 @Valid @RequestBody PaymentModel paymentModel){
        paymentService.updatePaymentById(paymentId, paymentModel);
        return new ResponseEntity<String>("Successfully updated", HttpStatus.OK);
}
    @DeleteMapping("/{paymentId}")
    public ResponseEntity<String> deletePaymentById(@PathVariable String paymentId){
        paymentService.deletePaymentById(paymentId);
        return new ResponseEntity<String>("Successfully deleted", HttpStatus.OK);
}}

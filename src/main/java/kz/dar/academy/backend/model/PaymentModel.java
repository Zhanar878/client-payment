package kz.dar.academy.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PaymentModel {
    private String PaymentId;
    private String typeOfService;

    Date date = new Date();

    public PaymentModel(String paymentId, String electricity, String s) {
    }
}

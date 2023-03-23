package kz.dar.academy.backend.service;

import kz.dar.academy.backend.model.PaymentModel;

import java.util.List;

public interface PaymentService {
 void createPayment(PaymentModel paymentModel);
 List<PaymentModel> getAllPayments();
 PaymentModel getPaymentById(String PaymentId);
 void updatePaymentById(String PaymentId, PaymentModel paymentModel);
 void deletePaymentById(String PaymentId);    }



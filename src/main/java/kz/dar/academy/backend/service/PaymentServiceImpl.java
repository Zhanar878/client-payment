package kz.dar.academy.backend.service;

import kz.dar.academy.backend.model.PaymentModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Service
public class PaymentServiceImpl implements PaymentService {
    private static final HashMap<String, PaymentModel> postMap=new HashMap<>();
    static {
        PaymentModel paymentModel1=new PaymentModel(UUID.randomUUID().toString(),"electricity",
                "yyyy-MM-dd HH:mm:ss");
        PaymentModel paymentModel2=new PaymentModel(UUID.randomUUID().toString(),"water",
                "yyyy-MM-dd HH:mm:ss");
        PaymentModel paymentModel3=new PaymentModel(UUID.randomUUID().toString(),"heating",
                "yyyy-MM-dd HH:mm:ss");
        postMap.put(paymentModel1.getPaymentId(),paymentModel1);
        postMap.put(paymentModel2.getPaymentId(),paymentModel2);
        postMap.put(paymentModel3.getPaymentId(),paymentModel3);



    }

    @Override
    public void createPayment(PaymentModel paymentModel) {
        paymentModel.setPaymentId(UUID.randomUUID().toString());
        postMap.put(paymentModel.getPaymentId(), paymentModel);

    }

    @Override
    public List<PaymentModel> getAllPayments() {
        return new ArrayList<>(postMap.values());
    }

    @Override
    public PaymentModel getPaymentById(String PaymentId) {
        return postMap.get(PaymentId);
    }

    @Override
    public void updatePaymentById(String PaymentId, PaymentModel paymentModel) {
        paymentModel.setPaymentId(PaymentId);
        postMap.put(PaymentId, paymentModel);
    }

    @Override
    public void deletePaymentById(String PaymentId) {postMap.remove(PaymentId);


    }


}

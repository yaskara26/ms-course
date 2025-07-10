package br.com.santangelo.yaskara.hrpayroll.service;

import br.com.santangelo.yaskara.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(Long workerId, int days) {
            return new Payment("Totoro", 500.0, days);
    }
}

package br.com.okayamafilho.desafiospringinjection.services;

import org.springframework.stereotype.Service;

import br.com.okayamafilho.desafiospringinjection.entities.Order;

@Service
public class ShippingService {

    public double shipment(Order order) {
        double valorFrete = 0.0;
        if (order.getBasic() < 100.0) {
            valorFrete =  20.0;
        } else if (order.getBasic() >= 100.0 && order.getBasic() <= 200.0) {
            valorFrete =  12.0;
        } else if (order.getBasic() >= 200.0) {
            valorFrete = 0.0;
        }

        return valorFrete;
    }
}

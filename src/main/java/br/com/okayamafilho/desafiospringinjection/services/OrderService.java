package br.com.okayamafilho.desafiospringinjection.services;

import org.springframework.stereotype.Service;

import br.com.okayamafilho.desafiospringinjection.entities.Order;

@Service
public class OrderService {

    private ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }    

    public double total(Order order) {
        double valorDesconto  = (order.getBasic() * order.getDiscount() /100);
        return order.getBasic() - valorDesconto + shippingService.shipment(order);
    }
}

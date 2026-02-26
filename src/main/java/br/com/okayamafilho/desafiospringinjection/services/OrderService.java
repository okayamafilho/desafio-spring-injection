package br.com.okayamafilho.desafiospringinjection.services;

import br.com.okayamafilho.desafiospringinjection.entities.Order;

public class OrderService {

    private ShippingService shippingService;

    public double total(Order order) {
        return order.getBasic() - shippingService.shipment(order);
    }
}

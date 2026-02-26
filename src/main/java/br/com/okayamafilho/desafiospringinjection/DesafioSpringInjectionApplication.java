package br.com.okayamafilho.desafiospringinjection;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.okayamafilho.desafiospringinjection.entities.Order;
import br.com.okayamafilho.desafiospringinjection.services.OrderService;

@SpringBootApplication
public class DesafioSpringInjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioSpringInjectionApplication.class, args);
	}

	@Bean
    public CommandLineRunner run(OrderService orderService) {
        return args -> {

				Locale.setDefault(Locale.US);
				Scanner sc = new Scanner(System.in); 

				System.out.print("Digite o código do pedido......: ");
				Integer code = sc.nextInt();

				System.out.print("Digite o valor básico do pedido: ");
				double basic = sc.nextDouble();

				System.out.print("Digite o desconto: ");
				double discount = sc.nextDouble();

				Order order = new Order(code, basic, discount);

				double total = orderService.total(order);

				System.out.printf("Total: %.2f%n", total);
		
				sc.close();   

        	};
        }
}

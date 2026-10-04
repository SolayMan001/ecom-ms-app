package org.solaymanoumouou.customerservice;

import org.solaymanoumouou.customerservice.config.CustomerConfigParams;
import org.solaymanoumouou.customerservice.entities.Customer;
import org.solaymanoumouou.customerservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(CustomerConfigParams.class)
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRepository  customerRepository) {
        return args -> {
            customerRepository.save(new Customer(null, "Mohamed", "med@gmail.com"));
            customerRepository.save(Customer.builder().name("Solayman Oumouou").email("solayman@example.com").build());
            customerRepository.save(Customer.builder().name("Imane").email("imane@gmail.com").build());
        };
    }

}

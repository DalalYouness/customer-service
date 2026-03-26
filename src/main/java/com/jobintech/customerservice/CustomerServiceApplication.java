package com.jobintech.customerservice;

import com.jobintech.customerservice.entities.Customer;
import com.jobintech.customerservice.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class CustomerServiceApplication implements CommandLineRunner {

    @Autowired
    private CustomerRepository customerRepository;
    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //transient mode
        List<Customer> customers = List.of(
          Customer.builder()
                  .firstName("John")
                  .lastName("Doe")
                  .email("john@gmail.com")
                  .build(),
          Customer.builder()
                  .firstName("Jane")
                  .lastName("Doe")
                  .email("jahn@hotmail.fr")
                  .build(),
          Customer.builder()
                  .firstName("youness")
                  .lastName("dalal")
                  .email("youness@live.fr")
                  .build()
        );
        customerRepository.saveAll(customers);

    }
}

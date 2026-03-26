package com.jobintech.customerservice.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity @Table(name = "customers") @Getter@Setter @NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}

package com.yuzarsif.eticaret.repository;

import com.yuzarsif.eticaret.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}

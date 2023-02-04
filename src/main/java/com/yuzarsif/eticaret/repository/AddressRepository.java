package com.yuzarsif.eticaret.repository;

import com.yuzarsif.eticaret.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}

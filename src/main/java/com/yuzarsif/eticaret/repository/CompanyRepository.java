package com.yuzarsif.eticaret.repository;

import com.yuzarsif.eticaret.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, String> {
}

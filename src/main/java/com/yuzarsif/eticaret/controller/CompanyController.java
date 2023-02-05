package com.yuzarsif.eticaret.controller;

import com.yuzarsif.eticaret.dto.model.CompanyDto;
import com.yuzarsif.eticaret.dto.request.CreateCompanyRequest;
import com.yuzarsif.eticaret.service.CompanyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/company")
public class CompanyController {

    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/getall")
    public ResponseEntity<List<CompanyDto>> getAll() {
        return ResponseEntity.ok(companyService.getAll());
    }

    @PostMapping("/save")
    public ResponseEntity<CompanyDto> save(@RequestBody CreateCompanyRequest request) {
        return ResponseEntity.ok(companyService.save(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<CompanyDto> getCompanyById(@PathVariable String id) {
        return ResponseEntity.ok(companyService.getById(id));
    }
}

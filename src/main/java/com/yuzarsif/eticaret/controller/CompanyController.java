package com.yuzarsif.eticaret.controller;

import com.yuzarsif.eticaret.dto.model.CompanyDto;
import com.yuzarsif.eticaret.dto.request.CreateCompanyRequest;
import com.yuzarsif.eticaret.service.CompanyService;
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
    public List<CompanyDto> getAll() {
        return companyService.getAll();
    }

    @PostMapping("/save")
    public CompanyDto save(@RequestBody CreateCompanyRequest request) {
        return companyService.save(request);
    }

    @GetMapping("/{id}")
    public CompanyDto getCompanyById(@PathVariable String id) {
        return companyService.getById(id);
    }
}

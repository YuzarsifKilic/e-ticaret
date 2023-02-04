package com.yuzarsif.eticaret.service;

import com.yuzarsif.eticaret.dto.converter.CompanyDtoConverter;
import com.yuzarsif.eticaret.dto.model.CompanyDto;
import com.yuzarsif.eticaret.dto.request.CreateCompanyRequest;
import com.yuzarsif.eticaret.exception.CustomerNotFoundException;
import com.yuzarsif.eticaret.model.Company;
import com.yuzarsif.eticaret.model.User;
import com.yuzarsif.eticaret.repository.CompanyRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CompanyService {

    private final CompanyRepository companyRepository;
    private final UserService userService;
    private final CompanyDtoConverter converter;

    public CompanyService(CompanyRepository companyRepository, UserService userService, CompanyDtoConverter converter) {
        this.companyRepository = companyRepository;
        this.userService = userService;
        this.converter = converter;
    }

    public List<CompanyDto> getAll() {
        return companyRepository.findAll().stream().map(converter::convert).collect(Collectors.toList());
    }

    public CompanyDto save(CreateCompanyRequest request) {
        User user = userService.findById(request.getId());
        Company company = new Company(
                user.getId(),
                user.getEmail(),
                user.getPassword(),
                true,
                request.getCompanyName(),
                request.getWebSite());
        return converter.convert(companyRepository.save(company));
    }

    public CompanyDto getById(String id) {
        return converter.convert(companyRepository
                .findById(id)
                .orElseThrow(
                        () -> new CustomerNotFoundException(id + " ye sah,p bir customer bulunamadı")));
    }
}

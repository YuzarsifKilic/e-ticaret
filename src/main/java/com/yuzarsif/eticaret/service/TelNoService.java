package com.yuzarsif.eticaret.service;

import com.yuzarsif.eticaret.dto.converter.TelNoDtoConverter;
import com.yuzarsif.eticaret.dto.model.TelNoDto;
import com.yuzarsif.eticaret.dto.request.CreateTelNoRequest;
import com.yuzarsif.eticaret.exception.TelNoNotFoundException;
import com.yuzarsif.eticaret.model.Customer;
import com.yuzarsif.eticaret.model.TelNo;
import com.yuzarsif.eticaret.repository.TelNoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TelNoService {

    private final TelNoRepository telNoRepository;
    private final CustomerService customerService;
    private final TelNoDtoConverter converter;

    public TelNoService(TelNoRepository telNoRepository, CustomerService customerService, TelNoDtoConverter converter) {
        this.telNoRepository = telNoRepository;
        this.customerService = customerService;
        this.converter = converter;
    }

    public TelNo createTelNo(CreateTelNoRequest request) {
        Customer customer = customerService.findById(request.getUserId());
        TelNo telNo = new TelNo(request.getTelNoType(), request.getTelNo(), customer);
        return telNoRepository.save(telNo);
    }

    public List<TelNoDto> getAll() {
        return telNoRepository
                .findAll()
                .stream()
                .map(converter::convert)
                .collect(Collectors.toList());
    }

    public TelNoDto findById(int id) {
        return converter.convert(telNoRepository
                .findById(id)
                .orElseThrow(
                        () -> new TelNoNotFoundException(id + " ye sahip bir telefon numarası bulunamadı")));
    }
}

package com.yuzarsif.eticaret.controller;

import com.yuzarsif.eticaret.dto.model.AddressDto;
import com.yuzarsif.eticaret.dto.model.UserAddressDto;
import com.yuzarsif.eticaret.dto.request.CreateAddressRequest;
import com.yuzarsif.eticaret.service.AddressService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/address")
public class AddressController {

    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("/getall")
    public ResponseEntity<List<AddressDto>> getAll() {
        return ResponseEntity.ok(addressService.getAll());
    }

    @PostMapping("/save")
    public ResponseEntity<AddressDto> save(@RequestBody CreateAddressRequest request) {
        return ResponseEntity.ok(addressService.createAddress(request));
    }

    @GetMapping("/get/{userId}")
    public ResponseEntity<List<UserAddressDto>> getAddressesByUser(@PathVariable String userId) {
        return ResponseEntity.ok(addressService.getAddressesByUser(userId));
    }
}

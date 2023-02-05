package com.yuzarsif.eticaret.controller;

import com.yuzarsif.eticaret.dto.request.CreateTelNoRequest;
import com.yuzarsif.eticaret.model.TelNo;
import com.yuzarsif.eticaret.service.TelNoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/telno")
public class TelNoController {

    private final TelNoService telNoService;

    public TelNoController(TelNoService telNoService) {
        this.telNoService = telNoService;
    }

    @PostMapping("/save")
    public ResponseEntity<TelNo> save(@RequestBody CreateTelNoRequest request) {
        return ResponseEntity.ok(telNoService.createTelNo(request));
    }
}

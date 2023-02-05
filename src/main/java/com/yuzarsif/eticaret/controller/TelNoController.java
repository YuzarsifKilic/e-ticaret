package com.yuzarsif.eticaret.controller;

import com.yuzarsif.eticaret.dto.model.TelNoDto;
import com.yuzarsif.eticaret.dto.request.CreateTelNoRequest;
import com.yuzarsif.eticaret.model.TelNo;
import com.yuzarsif.eticaret.service.TelNoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/getall")
    public ResponseEntity<List<TelNoDto>> getAll() {
        return ResponseEntity.ok(telNoService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TelNoDto> getTelNoById(@PathVariable int id) {
        return ResponseEntity.ok(telNoService.findById(id));
    }
}

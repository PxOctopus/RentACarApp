package com.cagri.arackiralama.controller;

import com.cagri.arackiralama.dto.request.AracSaveRequestDto;
import com.cagri.arackiralama.dto.request.BayiSaveRequestDto;
import com.cagri.arackiralama.entity.Arac;
import com.cagri.arackiralama.entity.Bayi;
import com.cagri.arackiralama.mapper.BayiMapper;
import com.cagri.arackiralama.service.BayiService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.cagri.arackiralama.config.RestApis.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(BAYI)
public class BayiController {
private final BayiService bayiService;
    @PostMapping(SAVE)
    public ResponseEntity<Bayi> save(@RequestBody BayiSaveRequestDto dto) {
        return ResponseEntity.ok(bayiService.save(dto));
    }
    @PostMapping(ADDCAR)
    public ResponseEntity<Bayi> addCar(@RequestBody BayiSaveRequestDto dto, @RequestBody AracSaveRequestDto adto) {
        return ResponseEntity.ok(bayiService.addCarToBayi(dto, adto));
    }
}

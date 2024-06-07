package com.cagri.arackiralama.controller;

import com.cagri.arackiralama.dto.request.AracSaveRequestDto;
import com.cagri.arackiralama.entity.Arac;
import com.cagri.arackiralama.service.AracService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.cagri.arackiralama.config.RestApis.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(ARAC)
public class AracController {
 private final AracService aracService;

 @PostMapping(SAVE)
 public ResponseEntity<Arac> save(@RequestBody AracSaveRequestDto dto) {
     return ResponseEntity.ok(aracService.save(dto));
 }

}

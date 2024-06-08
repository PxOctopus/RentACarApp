package com.cagri.arackiralama.controller;

import com.cagri.arackiralama.dto.request.AracSaveRequestDto;
import com.cagri.arackiralama.dto.request.MusteriSaveRequestDto;
import com.cagri.arackiralama.entity.Arac;
import com.cagri.arackiralama.entity.Musteri;
import com.cagri.arackiralama.mapper.MusteriMapper;
import com.cagri.arackiralama.service.MusteriService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.cagri.arackiralama.config.RestApis.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(MUSTERI)
public class MusteriController {
    private final MusteriService musteriService;
    @PostMapping(SAVE)
    public ResponseEntity<Musteri> save(@RequestBody MusteriSaveRequestDto dto) {
        return ResponseEntity.ok(musteriService.save(dto));
    }
}

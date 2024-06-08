package com.cagri.arackiralama.controller;

import com.cagri.arackiralama.dto.request.KiralamaSaveRequestDto;
import com.cagri.arackiralama.entity.Kiralama;
import com.cagri.arackiralama.service.KiralamaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.cagri.arackiralama.config.RestApis.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(KIRALAMA)
public class KiralamaController {
    private final KiralamaService kiralamaService;

    @PostMapping(ADD)
    public ResponseEntity<Kiralama> add(@RequestBody KiralamaSaveRequestDto dto) {
        return ResponseEntity.ok(kiralamaService.save(dto));
    }

}

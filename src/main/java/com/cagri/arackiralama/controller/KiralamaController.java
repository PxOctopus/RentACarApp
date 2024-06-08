package com.cagri.arackiralama.controller;

import com.cagri.arackiralama.dto.request.KiralamaSaveRequestDto;
import com.cagri.arackiralama.entity.Kiralama;
import com.cagri.arackiralama.exception.AracKiralamaException;
import com.cagri.arackiralama.exception.ErrorType;
import com.cagri.arackiralama.service.KiralamaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

import static com.cagri.arackiralama.config.RestApis.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(KIRALAMA)
public class KiralamaController {
    private final KiralamaService kiralamaService;

    @PostMapping(ADD)
    public ResponseEntity<String> add(@RequestBody @Valid KiralamaSaveRequestDto dto) {
        if (Objects.isNull(dto.getMusteri().getId())) {
            if (Objects.isNull(dto.getMusteri().getAd()) ||
                    Objects.isNull(dto.getMusteri().getSoyad()) ||
                    Objects.isNull(dto.getMusteri().getTcKimlikNo())) {
                throw new AracKiralamaException(ErrorType.CUSTOMER_INVALID_PARAMETER_ERROR);
            }
        }
        kiralamaService.save(dto);
        return ResponseEntity.ok("Islem basarili!");
    }

}


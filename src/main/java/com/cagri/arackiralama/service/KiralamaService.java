package com.cagri.arackiralama.service;

import com.cagri.arackiralama.dto.request.KiralamaSaveRequestDto;
import com.cagri.arackiralama.entity.Arac;
import com.cagri.arackiralama.entity.Kiralama;
import com.cagri.arackiralama.exception.AracKiralamaException;
import com.cagri.arackiralama.exception.ErrorType;
import com.cagri.arackiralama.mapper.KiralamaMapper;
import com.cagri.arackiralama.repository.KiralamaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static com.cagri.arackiralama.utility.enums.AracDurum.KIRADA;
import static com.cagri.arackiralama.utility.enums.AracDurum.MUSAIT;

@Service
@RequiredArgsConstructor
public class KiralamaService {
    private final KiralamaRepository repository;

    public Kiralama save(KiralamaSaveRequestDto dto) {

        Arac arac = repository.findById(dto.getArac().getId())
                .orElseThrow(() -> new IllegalArgumentException("Arac bulunamadi")).getArac();

        if (arac.getDurum() == MUSAIT) {
            Kiralama kiralama = KiralamaMapper.INSTANCE.fromKiralamaSaveDto(dto);
            kiralama.setArac(arac);
            kiralama.setMusteri(dto.getMusteri());
            arac.setDurum(KIRADA);
            return repository.save(kiralama);
        } else {
            throw new AracKiralamaException(ErrorType.BAD_REQUEST_ERROR);
        }
    }
}

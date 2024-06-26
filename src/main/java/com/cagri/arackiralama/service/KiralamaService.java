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

import java.util.Objects;
import java.util.Optional;

import static com.cagri.arackiralama.utility.enums.AracDurum.KIRADA;
import static com.cagri.arackiralama.utility.enums.AracDurum.MUSAIT;

@Service
@RequiredArgsConstructor
public class KiralamaService {
    private final KiralamaRepository repository;
    private final MusteriService musteriService;
    private final AracService aracService;

    public Kiralama save(KiralamaSaveRequestDto dto) {
        Long musteriId = dto.getMusteri().getId();
        if (Objects.isNull(musteriId)) {
            musteriId = musteriService.saveAndGetId(dto.getMusteri().getAd(),
                    dto.getMusteri().getSoyad(),
                    dto.getMusteri().getTcKimlikNo(),
                    dto.getMusteri().getAdres(),
                    dto.getMusteri().getTelefon());

        }
        if (!aracService.existById(dto.getArac().getId())) {
            throw new AracKiralamaException(ErrorType.VEHICLE_NOT_FOUND_ID_ERROR);

        }
        return repository.save(KiralamaMapper.INSTANCE.fromKiralamaSaveDto(dto));
    }
}


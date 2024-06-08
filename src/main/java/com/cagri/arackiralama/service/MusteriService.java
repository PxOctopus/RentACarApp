package com.cagri.arackiralama.service;

import com.cagri.arackiralama.dto.request.MusteriSaveRequestDto;
import com.cagri.arackiralama.entity.Arac;
import com.cagri.arackiralama.entity.Musteri;
import com.cagri.arackiralama.mapper.MusteriMapper;
import com.cagri.arackiralama.repository.MusteriRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MusteriService {
private final MusteriRepository repository;
    public Musteri save(MusteriSaveRequestDto dto) {
        return repository.save(MusteriMapper.INSTANCE.fromMusteriSaveDto(dto));
    }
}

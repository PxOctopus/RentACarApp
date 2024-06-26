package com.cagri.arackiralama.service;

import com.cagri.arackiralama.dto.request.AracSaveRequestDto;
import com.cagri.arackiralama.dto.request.BayiSaveRequestDto;
import com.cagri.arackiralama.entity.Arac;
import com.cagri.arackiralama.entity.Bayi;
import com.cagri.arackiralama.mapper.AracMapper;
import com.cagri.arackiralama.mapper.BayiMapper;
import com.cagri.arackiralama.repository.AracRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AracService {
    private final AracRepository repository;

    public Arac save(AracSaveRequestDto dto) {
        return repository.save(AracMapper.INSTANCE.fromAracSaveDto(dto));
    }

    public boolean existById(Long id) {
        return repository.existsById(id);
    }
}

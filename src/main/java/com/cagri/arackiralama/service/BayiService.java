package com.cagri.arackiralama.service;

import com.cagri.arackiralama.dto.request.AracSaveRequestDto;
import com.cagri.arackiralama.dto.request.BayiSaveRequestDto;
import com.cagri.arackiralama.entity.Bayi;
import com.cagri.arackiralama.mapper.BayiMapper;
import com.cagri.arackiralama.repository.BayiRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BayiService {
    private final BayiRepository repository;

    public Bayi save(BayiSaveRequestDto dto) {
        return repository.save(BayiMapper.INSTANCE.fromBayiSaveDto(dto));
    }


}

package com.cagri.arackiralama.mapper;

import com.cagri.arackiralama.dto.request.KiralamaSaveRequestDto;
import com.cagri.arackiralama.entity.Kiralama;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface KiralamaMapper {
    KiralamaMapper INSTANCE = Mappers.getMapper(KiralamaMapper.class);

    Kiralama fromKiralamaSaveDto(KiralamaSaveRequestDto dto);

}

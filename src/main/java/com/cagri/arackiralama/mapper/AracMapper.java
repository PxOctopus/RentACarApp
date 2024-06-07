package com.cagri.arackiralama.mapper;

import com.cagri.arackiralama.dto.request.AracSaveRequestDto;
import com.cagri.arackiralama.dto.request.BayiSaveRequestDto;
import com.cagri.arackiralama.entity.Arac;
import com.cagri.arackiralama.entity.Bayi;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AracMapper {
    AracMapper INSTANCE = Mappers.getMapper(AracMapper.class);

    Arac fromAracSaveDto(AracSaveRequestDto dto);


}

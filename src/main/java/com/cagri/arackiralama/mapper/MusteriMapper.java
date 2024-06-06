package com.cagri.arackiralama.mapper;

import com.cagri.arackiralama.dto.request.MusteriSaveRequestDto;
import com.cagri.arackiralama.entity.Musteri;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MusteriMapper {
    MusteriMapper INSTANCE = Mappers.getMapper(MusteriMapper.class);

    Musteri fromMusteriSaveDto(MusteriSaveRequestDto dto);
}

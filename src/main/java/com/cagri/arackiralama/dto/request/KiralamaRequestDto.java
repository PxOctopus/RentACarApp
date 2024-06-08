package com.cagri.arackiralama.dto.request;

import com.cagri.arackiralama.entity.Arac;
import com.cagri.arackiralama.entity.Musteri;

import java.time.LocalDate;

public record KiralamaRequestDto(
        LocalDate tarih,
        LocalDate teslimTarihi,
        Double odemeTutari,

        Musteri musteri,

        Arac arac
) {
}

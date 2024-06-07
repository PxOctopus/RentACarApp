package com.cagri.arackiralama.dto.request;

import com.cagri.arackiralama.entity.Arac;
import com.cagri.arackiralama.entity.Bayi;
import com.cagri.arackiralama.entity.Musteri;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class KiralamaSaveRequestDto {
    Musteri musteri;
    Arac arac;
    Bayi bayi;
    LocalDateTime tarih;
    LocalDateTime teslimTarihi;

}

package com.cagri.arackiralama.dto.request;

import com.cagri.arackiralama.entity.Arac;
import com.cagri.arackiralama.entity.Bayi;
import com.cagri.arackiralama.entity.Musteri;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class KiralamaSaveRequestDto {
    LocalDate tarih = LocalDate.now();
    LocalDate teslimTarihi;
    Double odemeTutari;

    /**
     * eger musteri kayitli ise, musteri listesinden secilere id bilgisi iletilir. Ayrıca musteri
     * bilgileri cekilmez
     */
    Musteri musteri;

    Arac arac;


}

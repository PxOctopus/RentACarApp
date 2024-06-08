package com.cagri.arackiralama.dto.request;

import com.cagri.arackiralama.entity.Bayi;
import com.cagri.arackiralama.utility.enums.AracDurum;
import com.cagri.arackiralama.utility.enums.AracRenk;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AracSaveRequestDto {
    String marka;
    String model;
    String plaka;
    Double km;
    Double kiralamaBedeli;
    AracRenk renk;
    AracDurum durum = AracDurum.MUSAIT;
    Bayi bayi;
}

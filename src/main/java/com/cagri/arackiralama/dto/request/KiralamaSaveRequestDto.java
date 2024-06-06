package com.cagri.arackiralama.dto.request;

import com.cagri.arackiralama.entity.Arac;
import com.cagri.arackiralama.entity.Musteri;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class KiralamaSaveRequestDto {
    Musteri musteri;
    Arac arac;
}

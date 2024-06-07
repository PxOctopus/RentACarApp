package com.cagri.arackiralama.dto.request;

import com.cagri.arackiralama.entity.Arac;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BayiSaveRequestDto {
    String ad;
    String adres;
    List<Arac> aracListesi;

}

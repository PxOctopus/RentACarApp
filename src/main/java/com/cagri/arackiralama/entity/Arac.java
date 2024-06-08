package com.cagri.arackiralama.entity;

import com.cagri.arackiralama.utility.enums.AracDurum;
import com.cagri.arackiralama.utility.enums.AracRenk;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // get,set toString
@AllArgsConstructor // parametreli constructorlarin tumu
@NoArgsConstructor // default constructor
@Builder
@Entity
@Table(name = "tbl_arac")
public class Arac {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id icin otomatik artan
    Long id;
    String marka;
    String model;
    String plaka;
    Double km;
    Double kiralamaBedeli;

    @Enumerated(EnumType.STRING)
    @Builder.Default
    AracDurum durum = AracDurum.MUSAIT;
    @Enumerated(EnumType.STRING)
    AracRenk renk;

    @ManyToOne
    @JoinColumn(name = "bayi_id")
    Bayi bayi;

}

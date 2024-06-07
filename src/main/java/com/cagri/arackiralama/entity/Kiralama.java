package com.cagri.arackiralama.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data // get,set toString
@AllArgsConstructor // parametreli constructorlarin tumu
@NoArgsConstructor // default constructor
@Builder
@Entity
@Table(name = "tbl_kiralama")
public class Kiralama {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id icin otomatik artan
    Long id;
    @OneToOne
    Musteri musteri;
    @OneToOne
    Arac arac;
    @OneToOne
    Bayi bayi;
    LocalDateTime tarih = LocalDateTime.now();
    LocalDateTime teslimTarihi; // en fazla 5 gun kiralanabilir olacak nasıl yazarım?

}

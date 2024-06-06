package com.cagri.arackiralama.repository;

import com.cagri.arackiralama.entity.Kiralama;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KiralamaRepository extends JpaRepository<Kiralama, Long> {
}

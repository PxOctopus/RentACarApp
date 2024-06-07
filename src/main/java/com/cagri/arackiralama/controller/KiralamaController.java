package com.cagri.arackiralama.controller;

import com.cagri.arackiralama.service.KiralamaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.cagri.arackiralama.config.RestApis.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(KIRALAMA)
public class KiralamaController {
    private final KiralamaService kiralamaService;

}

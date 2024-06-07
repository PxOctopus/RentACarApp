package com.cagri.arackiralama.controller;

import com.cagri.arackiralama.service.MusteriService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.cagri.arackiralama.config.RestApis.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(MUSTERI)
public class MusteriController {
    private final MusteriService musteriService;
}

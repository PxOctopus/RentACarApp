package com.cagri.arackiralama.controller;

import com.cagri.arackiralama.service.BayiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.cagri.arackiralama.config.RestApis.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(BAYI)
public class BayiController {
private final BayiService bayiService;

}

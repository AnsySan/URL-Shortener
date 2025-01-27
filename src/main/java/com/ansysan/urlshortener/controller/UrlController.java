package com.ansysan.urlshortener.controller;

import com.ansysan.urlshortener.dto.Request;
import com.ansysan.urlshortener.dto.Response;
import com.ansysan.urlshortener.service.url.UrlService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Valid
@RestController
@RequiredArgsConstructor
public class UrlController {

    private final UrlService urlService;

    @GetMapping("/{hash}")
    public RedirectView getRedirectView(@PathVariable("hash") String hash) {
        return urlService.getRedirectView(hash);
    }

    @PostMapping("/url")
    public Response createShortUrl(@RequestBody Request dto) {
        return urlService.createShortUrl(dto);
    }
}
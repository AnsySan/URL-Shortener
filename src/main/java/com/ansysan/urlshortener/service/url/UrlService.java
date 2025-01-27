package com.ansysan.urlshortener.service.url;

import com.ansysan.urlshortener.dto.Request;
import com.ansysan.urlshortener.dto.Response;
import org.springframework.web.servlet.view.RedirectView;

public interface UrlService {

    RedirectView getRedirectView(String hash);

    Response createShortUrl(Request dto);
}

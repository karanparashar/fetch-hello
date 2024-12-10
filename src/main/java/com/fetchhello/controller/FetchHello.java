package com.fetchhello.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hello")
@Slf4j
public class FetchHello {

    @GetMapping("/fetchString")
    public ResponseEntity<String> fetchString() {
        log.info("Trace ID: {} ", MDC.get("traceId"));
        return ResponseEntity.ok("Hello ");
    }

    @GetMapping("/status")
    public ResponseEntity<String> getStatus() {
        log.info("TraceId: {}", MDC.get("traceId"));
        return ResponseEntity.ok("Up");
    }
}

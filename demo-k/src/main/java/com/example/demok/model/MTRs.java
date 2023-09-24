package com.example.demok.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MTRs {
    int resultCode;
    String timestamp;
    int status;
    String message;
    ErrorInfo error;

    @NoArgsConstructor
    @Data
    public static class ErrorInfo {
        private String errorCode;
        private String errorMsg;

    }
}

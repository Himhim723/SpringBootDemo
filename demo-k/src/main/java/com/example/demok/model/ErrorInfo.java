package com.example.demok.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ErrorInfo {
    private String errorCode;
    private String errorMsg;

    // Constructors, getters, and setters
}

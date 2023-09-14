package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
public class SmsRequest {

        @NotBlank
        private final String login;

        @NotBlank
        private final String pass;

        @NotBlank
        private final String compte;

        @NotBlank
        private final String op;

        @NotBlank
        private final String customized;

        @NotBlank
        private final String destNum; // destination

        @NotBlank
        private final String msg; // OTP

        @NotBlank
        private final String type;

        @NotBlank
        private final String auto_detect;

        @NotBlank
        private final String dt;

        @NotBlank
        private final String hr;

        @NotBlank
        private final String mn;

        @NotBlank
        private final String label;

        @NotBlank
        private final String ref;
}
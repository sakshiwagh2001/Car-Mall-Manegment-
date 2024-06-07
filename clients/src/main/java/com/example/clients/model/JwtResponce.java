package com.example.clients.model;

import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
public class JwtResponce {
    private String username;
    private String jwtToken;
}

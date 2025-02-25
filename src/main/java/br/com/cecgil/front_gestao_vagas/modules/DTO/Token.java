package br.com.cecgil.front_gestao_vagas.modules.DTO;

import java.util.List;

import lombok.Data;

@Data
public class Token {

    private String access_token;
    private List<String> roles;
    private Long expires_in;

    
}

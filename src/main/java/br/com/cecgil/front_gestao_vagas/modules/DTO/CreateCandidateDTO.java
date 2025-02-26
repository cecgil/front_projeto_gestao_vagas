package br.com.cecgil.front_gestao_vagas.modules.DTO;

import lombok.Data;

@Data
public class CreateCandidateDTO {

    private String username;
    private String password;
    private String name;
    private String email;
    private String description;
    
}

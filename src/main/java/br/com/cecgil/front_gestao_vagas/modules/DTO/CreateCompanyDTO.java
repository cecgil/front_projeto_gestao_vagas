package br.com.cecgil.front_gestao_vagas.modules.DTO;

import lombok.Data;

@Data
public class CreateCompanyDTO {

    private String username;
    private String email;
    private String website;
    private String description;
    private String name;
    private String password;
    
}

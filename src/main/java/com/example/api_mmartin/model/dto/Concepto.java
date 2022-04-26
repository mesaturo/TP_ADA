package com.example.api_mmartin.model.dto;

import lombok.*;

/*import javax.persistence.Entity;*/
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString


public class Concepto implements Serializable {

    private String capitulo;
    private String concepto;
    private String pregunta;

}

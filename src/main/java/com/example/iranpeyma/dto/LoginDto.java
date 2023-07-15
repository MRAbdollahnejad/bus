package com.example.iranpeyma.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LoginDto {

    String uName;

    byte[] pass;

}

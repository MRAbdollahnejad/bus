package com.example.iranpeyma.command;

import lombok.*;
import lombok.experimental.FieldDefaults;



@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LoginCommand {

    String uName;

    byte[] pass;

}

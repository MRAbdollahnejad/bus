package com.example.iranpeyma.command;

import com.example.iranpeyma.entity.Trip;
import com.example.iranpeyma.entity.Users;
import com.example.iranpeyma.entity.enums.Gender;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import java.util.UUID;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TicketCommand {

    UUID uuid=UUID.randomUUID();
    Gender gender;
    String owner;
    Users users;
    Trip trip;
}

package com.example.iranpeyma.entity;

import com.example.iranpeyma.base.entity.BaseEntity;
import com.example.iranpeyma.entity.enums.Gender;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Ticket extends BaseEntity<Long> {

    @Column(unique = true)
    UUID uuid=UUID.randomUUID();

    @Enumerated(EnumType.STRING)
    Gender gender;

    String owner;

    String ownerCode;

    @ManyToOne
    Users users;

    @ManyToOne
    Trip trip;

}

package com.example.iranpeyma.entity;

import com.example.iranpeyma.domain.entity.BaseEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
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

    String owner;

}

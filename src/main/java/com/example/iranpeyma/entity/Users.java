package com.example.iranpeyma.entity;

import com.example.iranpeyma.base.entity.BaseEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Users extends BaseEntity<Long> {

    @Column(unique = true)
    String uName;
    byte[] pass;

}

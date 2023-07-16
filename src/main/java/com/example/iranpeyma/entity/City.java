package com.example.iranpeyma.entity;

import com.example.iranpeyma.base.entity.BaseEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class City extends BaseEntity<Long> {

    @Column(unique = true)
    String cityName;

}

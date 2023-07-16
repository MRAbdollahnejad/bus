package com.example.iranpeyma.entity;

import com.example.iranpeyma.base.entity.BaseEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Trip extends BaseEntity<Long> {
    @ManyToOne
    City startCity;

    @ManyToOne
    City destinationCity;

    @Column(name = "local_time", columnDefinition = "TIME")
    LocalTime localTime;

    @Column(name = "local_date", columnDefinition = "DATE")
    LocalDate localDate;

    @Column(unique = true)
    UUID uuid=UUID.randomUUID();


}

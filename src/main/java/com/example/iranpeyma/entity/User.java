package com.example.iranpeyma.entity;

import com.example.iranpeyma.base.entity.BaseEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User extends BaseEntity<Long> {

    @Column(unique = true)
    String uName;
    String pass;

    @OneToMany
    List<Ticket> ticketList;

}

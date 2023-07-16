package com.example.iranpeyma.command;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TripSearchCommand {
    String startCity;
    String destinationCity;
    LocalDate localDate;
}

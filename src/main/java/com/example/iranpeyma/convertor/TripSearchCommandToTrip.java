package com.example.iranpeyma.convertor;

import java.time.LocalDate;

public class TripSearchCommandToTrip {
    public LocalDate convertServletDateToJavaDate(String date){
        String[] split = date.split("-");
        String year=split[0];
        String month=split[1];
        String day=split[2];
        return LocalDate.of(Integer.parseInt(year),Integer.parseInt(month),Integer.parseInt(day));
    }
}

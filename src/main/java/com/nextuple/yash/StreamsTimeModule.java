package com.nextuple.yash;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class StreamsTimeModule {
    public static void main(String gg[])
    {
        LocalDateTime dt=LocalDateTime.now();
        ZoneId zoneId=ZoneId.of("America/Atka");
        ZonedDateTime zdt=ZonedDateTime.of(dt,zoneId);
        System.out.println(zdt.toString());

        zoneId=ZoneId.of("Australia/Sydney");
        zdt=ZonedDateTime.of(dt,zoneId);
        System.out.println(zdt.toString());

        zoneId=ZoneId.of("Asia/Jakarta");
        zdt=ZonedDateTime.of(dt,zoneId);
        System.out.println(zdt.toString());

        zoneId=ZoneId.of("Europe/London");
        zdt=ZonedDateTime.of(dt,zoneId);
        System.out.println(zdt.toString());

        zoneId=ZoneId.of("America/Chicago");
        zdt=ZonedDateTime.of(dt,zoneId);
        System.out.println(zdt.toString());

        zoneId=ZoneId.of("Asia/Kolkata");
        zdt=ZonedDateTime.of(dt,zoneId);
        System.out.println(zdt.toString());

    }
}

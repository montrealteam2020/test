package com.demo.application.datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class InstantParseAndConverting {

    public static void main(String[] args) {
        Instant openDate = createInstant();//
        openDate = openDate.plus(Duration.ofDays(1));
        ZonedDateTime openDateZoneTime = openDate.atZone(ZoneId.of("America/New_York"));
        String monthString = openDateZoneTime.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        String monthFormatted=monthString.substring(0,1).toUpperCase()+monthString.substring(1).toLowerCase();
        int day=openDateZoneTime.getDayOfMonth();
        int year= openDateZoneTime.getYear();
    }

    private static Instant createInstant() {
        return Instant.now();
    }

}

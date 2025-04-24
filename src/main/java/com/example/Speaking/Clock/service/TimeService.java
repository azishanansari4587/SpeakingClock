package com.example.Speaking.Clock.service;
import org.springframework.stereotype.Service;

@Service
public class TimeService {

    private static final String[] HOURS = {
            "twelve", "one", "two", "three", "four", "five", "six",
            "seven", "eight", "nine", "ten", "eleven", "twelve"
    };

    private static final String[] MINUTES = {
            "zero", "one", "two", "three", "four", "five", "six", "seven",
            "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty",
            "twenty one", "twenty two", "twenty three", "twenty four",
            "twenty five", "twenty six", "twenty seven", "twenty eight",
            "twenty nine", "thirty", "thirty one", "thirty two", "thirty three",
            "thirty four", "thirty five", "thirty six", "thirty seven",
            "thirty eight", "thirty nine", "forty", "forty one", "forty two",
            "forty three", "forty four", "forty five", "forty six",
            "forty seven", "forty eight", "forty nine", "fifty",
            "fifty one", "fifty two", "fifty three", "fifty four",
            "fifty five", "fifty six", "fifty seven", "fifty eight",
            "fifty nine"
    };

    public String convertTimeToWords(String time) {
        try {
            if (time.equals("00:00")) return "It's Midnight";
            if (time.equals("12:00")) return "It's Midday";

            String[] parts = time.split(":");
            if (parts.length != 2) return "Invalid time format. Use HH:mm";

            int hour = Integer.parseInt(parts[0]);
            int minute = Integer.parseInt(parts[1]);

            if (hour < 0 || hour > 23 || minute < 0 || minute > 59)
                return "Invalid time range.";

            String hourWord = HOURS[hour % 12];
            String minuteWord = (minute == 0) ? "o'clock" : MINUTES[minute];
            String amPm = (hour < 12) ? "AM" : "PM";
            return "It's " + hourWord + " " + minuteWord + " " + amPm;
        } catch (Exception e) {
            return "Error processing time: " + e.getMessage();
        }
    }

}
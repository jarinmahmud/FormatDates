package com.ps;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

        public class FormatDates {
            public static void main(String[] args) {
                LocalDateTime current = LocalDateTime.now();

                // Format 1: 09/05/2021
                String format1 = DateTimeFormatter.ofPattern("MM/dd/yyyy").format(current);
                System.out.println(format1);

                // Format 2: 2021-09-05
                String format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(current);
                System.out.println(format2);

                // Format 3: September 5, 2021
                String format3 = DateTimeFormatter.ofPattern("MMMM d, yyyy").format(current);
                System.out.println(format3);

                // Format 4: Sunday, Sep 5, 2021 10:02
                String format4 = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm").format(current);
                System.out.println(format4);

                // Format 5:
                String format5 = DateTimeFormatter.ofPattern("h:mm 'on' dd-MMM-yyyy").format(current);
                System.out.println(format5);
            }
        }

package com.javaquest1.doctorwho;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoctorController {
    @GetMapping("/")
    public String home() {
        return"<ul>" +
                "<li><a href='/doctor/1'>Doctor 1</a></li>" +
                "<li><a href='/doctor/10'>Doctor 10</a></li>" +
                "<li><a href='/doctor/13'>Doctor 13</a></li>" +
                "<li><a href='/other'>Other Route</a></li>" +
                "</ul>";
    }

    @GetMapping("/doctor/{number}")
    public String getDoctorName(@PathVariable int number) {
        String doctorName = "";
        switch (number) {
            case 1: doctorName = "William Hartnell";
            break;
            case 10: doctorName = "David Tennant";
            break;
            case 13: doctorName = "Jodie Whittaker";
            break;
            default: doctorName = "Unknown Doctor";
        }
        return "Doctor" + number + ": " + doctorName;
    }

    @GetMapping("/other")
    public String otherRoute() {
        return "This is another route.";
    }
}

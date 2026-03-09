package com.aa.clinic.controller;


import com.aa.clinic.entity.Appointment;
import com.aa.clinic.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {
    @Autowired
    AppointmentService appointmentService;
    @GetMapping("/user/greeting")
    public String greeting(){
        return "HI. Good Day!!";
    }
    @PostMapping("/user/create")
    public ResponseEntity<String> createAppointment(@RequestBody Appointment appointment){
        appointmentService.saveAppointment(appointment);
        return ResponseEntity.ok("The object is commited");
    }
    @GetMapping("/Admin/GetAllAppointments")
    public List<Appointment> getAllAppointments(){
        return appointmentService.getAppointments();
    }

}

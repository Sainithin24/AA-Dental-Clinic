package com.aa.clinic.service;


import com.aa.clinic.entity.Appointment;
import com.aa.clinic.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {
    @Autowired
    AppointmentRepository appointmentRepository;
    public void saveAppointment(Appointment appointment){
        appointmentRepository.save(appointment);
    }
    public List<Appointment> getAppointments(){
        return appointmentRepository.findAll();
    }
}

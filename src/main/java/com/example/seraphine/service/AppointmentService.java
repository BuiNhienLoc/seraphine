package com.example.seraphine.service;

import com.example.seraphine.model.Appointment;
import java.util.Optional;
import java.util.List;
import java.util.Set;

public interface AppointmentService {
    void saveAppointment(Appointment appointment);
    List<Appointment> getAllAppointments();
    Optional<Appointment> getAppointmentById(Long id);
    Appointment updateAppointment(Long id, Appointment appointment);
    void deleteAppointment(Long id);
    void bookAppointment(Long user_id, Long appointment_id);
    Appointment addAppointmentToDoctor(Long doctor_id, Appointment new_appointment);
    void exportAppointmentInfo(Long id);
    Set<Appointment> showUserAppointments(Long user_id);
    List<Appointment> showDoctorsAppointments(Long doctor_id);
}

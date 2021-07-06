package com.accenture.tagtrainingspring.screening;
import com.accenture.tagtrainingspring.patient.Patient;
public class ScreeningService {

    public boolean isPatientScreening(Screening screening,Patient patient){
        return screening.getPatient().getId().equals(patient.getId());
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class SurgerySystem {
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;
    private ArrayList<Appointment> appointments;

    public SurgerySystem() {
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
        appointments = new ArrayList<>();
    }
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }
        public void removeDoctor(Doctor doctor) {
        doctors.remove(doctor);
    }
   public void addPatient(Patient patient) {
        patients.add(patient);
 
    }


}

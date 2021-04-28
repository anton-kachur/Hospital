import java.util.List;

public class HospitalizationParametresForPatient {
    private Patient patient;
    private int num_in_querry;
    private String treatment_start_date;
    private int room;

    HospitalizationParametresForPatient(Patient p, int n, String td, int r) {
        this.patient = p;
        this.num_in_querry = n;
        this.treatment_start_date = td;
        this.room = r;
    }

    public Patient getPatient() {
        return patient;
    }

    public String getStartDate() {
        return treatment_start_date;
    }
}

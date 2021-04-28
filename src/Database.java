import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Database{
    private List<Patient> patients = new ArrayList<>();

    Database(List<Patient> p) {
        this.patients = p;
    }
    Database() {}

    public void setPatients(List<Patient> p) {
        patients.addAll(p);
    }


    public String generateRandomNumber(int size) {
        StringBuffer num = new StringBuffer(size);
        for (int i = 0; i<size; i++)
            num.append(new Random().nextInt(9));
        return num.toString();
    }


    public void getPatients() {
        for (Patient pp: patients) {
            System.out.println(Arrays.toString(pp.getAll()));
        }
    }


    public Patient findPatient(Patient p) {
        for (Patient pp: patients)
            if (pp.getAll()[4].equals("")) {
                if (Arrays.equals(Arrays.copyOfRange(pp.getAll(), 0, 3), Arrays.copyOfRange(p.getAll(), 0, 3))) {
                    pp.setRegistrationNumber(generateRandomNumber(5));
                    return pp;
                }
            } else {
                if (Arrays.equals(Arrays.copyOfRange(pp.getAll(), 0, 4), Arrays.copyOfRange(p.getAll(), 0, 4))) {
                    return pp;
                }
            }

        System.out.println("Patient not found.");
        return null;
    }


    public void changePatient(Patient p) {
        //ToDo
    }
}


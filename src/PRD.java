import java.util.*;

public class PRD {
    Database db = new Database();
    List<HospitalizationParametresForPatient> hp;

    PRD() {}

    public String generateRandomNumber(int size) {
        StringBuffer num = new StringBuffer(size);
        for (int i = 0; i<size; i++)
            num.append(new Random().nextInt(9));
        return num.toString();
    }


    public void setPatientsToDB(List<Patient> p) {
        // Генерируем регистрационный номер
        for (Patient pp: p) {
            if (pp.getAll()[4] == null)
                pp.setRegistrationNumber(generateRandomNumber(5));
        }
        db.setPatients(p);
    }


    public RegCard createRegCard(Patient p) {
        return new RegCard(p, "+"+generateRandomNumber(9).toString(),
                generateRandomNumber(1)+1, "InsuranceComp4All", generateRandomNumber(7));
    }


    public void setQuery(List<Patient> p) {
        int i = 1;
        hp = new ArrayList<>();
        Collections.shuffle(p);
        for (Patient pp: p) {
            hp.add(new HospitalizationParametresForPatient(pp, i, "99/99/9999", new Random().nextInt(23)));
            i++;
        }
    }


    public List<HospitalizationParametresForPatient> getQuery() {
        return hp;
    }


    public void getPatientsFromDB() {
        db.getPatients();
    }

    public Patient findPatient(Patient p) {
        Patient founded_patient = db.findPatient(p);
        if (founded_patient == null) {
            Scanner scanner = new Scanner("Does patient want to change his/her data?(y/n) ");
            if (scanner.nextLine().equals("y")) {
                db.changePatient(p);
            } else {
                return null;
            }
        }

        return founded_patient;
    }

}

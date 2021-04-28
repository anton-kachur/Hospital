import java.util.*;

public class Doctor {
    String id;
    // Очередь дял пациентов до назначения госпитализации
    List<Patient> patients = new ArrayList<>();
    // Очередь для пациентов с госпитализацией
    List<HospitalizationParametresForPatient> hp;
    // Курсы лечения
    List<CourseOfTreatment> ct;

    Doctor(List<Patient> p) {
        this.patients = p;
        this.id = generateRandomNumber(10);
    }
    Doctor() {
        this.id = generateRandomNumber(10);
    }


    public String generateRandomNumber(int size) {
        StringBuffer num = new StringBuffer(size);
        for (int i = 0; i<size; i++)
            num.append(new Random().nextInt(9));
        return num.toString();
    }


    public void reception(List<Patient> p) {
        this.patients = p;
    }

    //ToDo для большего набора пациентов
    public List<Patient> getReceptionPatients() {
        List<Patient> res = new ArrayList<>();
        for (int i = 0; i < 1; i++)
            res.add(patients.get(new Random().nextInt(patients.size())));
        System.out.println("getReceptionPatients"+res);
        return res;
    }


    public void setQuery(List<HospitalizationParametresForPatient> h) {
        this.hp = h;
    }


    public void createCourseOfTreatment(int amount, Patient p) {
        ct = new ArrayList<>();
        for (HospitalizationParametresForPatient pp: hp) {
            if (pp.getPatient().getAll()[0].equals(p.getAll()[0])) {
                for (int i = 0; i<amount; i++) {
                    ct.add(new CourseOfTreatment(new String[]{p.getAll()[4], this.id,
                            "RandomCourseName", pp.getStartDate(),
                            "99/99/99999", "Patient has a disease"}));
                }
            }
        }
    }


    public List<CourseOfTreatment> getCoursesOfTreatment() {
        for (CourseOfTreatment c: ct) {
            System.out.println("Treatment course: " + Arrays.toString(c.getAll()));
        }
        return ct;
    }

}

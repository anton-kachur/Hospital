import java.util.*;

public class Main {
    public static void main(String []argv) {
        //Установка пациентов
        Patient p1 = new Patient(new String[]{"John", "Morris", "12/12/2000", "SomeStreet"});
        Patient p2 = new Patient(new String[]{"Alex", "Belmont", "11/01/2001", "SomeStreet2"});

        //Создание доктора
        Doctor d1 = new Doctor();
        d1.reception(Arrays.asList(p1, p2));

        //Создание рецепшена
        PRD prd = new PRD();
        //Регистрация пациентов
        prd.setPatientsToDB(d1.getReceptionPatients());

        // Доктор дает указание регистратуре установить очередь и детали приема пациентов
        prd.setQuery(d1.getReceptionPatients());
        // Регистратура формирует очерель и передает ее доктору
        d1.setQuery(prd.getQuery());

        // ToDo Для большего кол-ва пациентов
        // Пациент приходит на лечение, регистратура ищет его в базе
        System.out.println("\nPatient in base: " + prd.findPatient(p1));
        prd.getPatientsFromDB();
        // Вариант, если пациент не помнит свой номер
        p1.setRegistrationNumber("");
        System.out.println("\nPatient with no reg_num: " + prd.findPatient(p1));
        prd.getPatientsFromDB();

        // ToDo Для большего кол-ва пациентов
        // Пациент получает карточку если он есть в базе
        p1.setRegCard(prd.createRegCard(p1));
        System.out.println("\nPatient's registration card: " + Arrays.toString(p1.getAll()) + Arrays.toString(p1.getRegCard()));

        // Пример: один пациент может лечиться у 2-х и больше врачей
        //Doctor d2 = d1;
        //d2.createCourseOfTreatment(2, p1);
        d1.createCourseOfTreatment(2, p1);
        d1.getCoursesOfTreatment();

        // Создание Мед. Секретариата и обращение к нему
        MedSecretary m = new MedSecretary(d1.getCoursesOfTreatment());
        System.out.println(m.getCourse());
    }
}

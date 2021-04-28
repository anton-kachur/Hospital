public class CourseOfTreatment {
    private String patient_id;
    private String doctor_id;
    private String course_name;
    private String start_date;
    private String end_date;
    private String notes;

    CourseOfTreatment(String[] a) {
        this.patient_id = a[0];
        this.doctor_id = a[1];
        this.course_name = a[2];
        this.start_date = a[3];
        this.end_date = a[4];
        this.notes = a[5];
    }

    public String[] getAll() {
        return new String[]{this.patient_id, this.doctor_id, this.course_name, this.start_date, this.end_date, this.notes};
    }
}

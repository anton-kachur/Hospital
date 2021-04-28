import java.util.List;

public class MedSecretary {
    List<CourseOfTreatment> courses;

    MedSecretary(List<CourseOfTreatment> c) {
        this.courses = c;
    }

    public List<CourseOfTreatment> getCourse() {
        return courses;
    }
}

public class Patient {
    private String name;
    private String surname;
    private String birth_date;
    private String adress;
    private String registration_number = null;
    private RegCard reg_card = null;

    Patient(String[] a) {
        this.name = a[0];
        this.surname = a[1];
        this.birth_date = a[2];
        this.adress = a[3];
    }

    public void setRegistrationNumber(String rn) {
        this.registration_number = rn;
    }
    public void setRegCard(RegCard c) { this.reg_card = c; }
    public String[] getRegCard() {
        return reg_card.getAll();
    }
    public String[] getAll() {
        return new String[]{this.name, this.surname, this.birth_date, this.adress, this.registration_number};
    }
}

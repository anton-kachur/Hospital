public class RegCard {
    Patient patient;
    private String phone;
    private String blood_group;
    private String insurance_company;
    private String policy_num;

    RegCard(Patient p, String phone, String bg, String i_c, String p_n) {
        this.patient = p;
        this.phone = phone;
        this.blood_group = bg;
        this.insurance_company = i_c;
        this.policy_num = p_n;
    }


    public String[] getAll() {
        return new String[]{this.phone, this.blood_group, this.insurance_company, this.policy_num};
    }
}

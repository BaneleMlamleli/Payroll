package domain;

public class EmployeeGender {

    private int genderID;
    private int empNumber;

    private EmployeeGender(){

    }

    public EmployeeGender(Builder builder) {

        this.empNumber = builder.empNumber;
        this.genderID = builder.genderID;

    }

    public int getGenderID() {
        return genderID;
    }

    public void setGenderID(int genderID) {
        this.genderID = genderID;
    }

    public int getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(int empNumber) {
        this.empNumber = empNumber;
    }

    @Override
    public String toString() {
        return "EmployeeGender{" +
                "empNumber='" + empNumber + '\'' +
                ", genderID='" + genderID + '\'' +
                '}';
    }

    public static class Builder {

        private int genderID;
        private int empNumber;

        public Builder empNumber(int empNumber) {
            this.empNumber = empNumber;
            return this;
        }

        public Builder genderID(int genderID) {
            this.genderID = genderID;
            return this;

        }

        public EmployeeGender build() {
            return new EmployeeGender(this);
        }

    }
}

package homework8_2;

public class Patient {
    private int treatmentPlan; //целочисленный код плана лечения
    private Doctor doctor; //ссылка на назначенного врача (Doctor)

    //Используем инкапсуляцию — поля закрыты (private), доступ через геттеры и сеттеры.

    public int getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setTreatmentPlan(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}


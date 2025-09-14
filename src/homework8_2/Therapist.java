package homework8_2;

public class Therapist extends Doctor {
    @Override
    void treat() {
        System.out.println("Терапевт лечит: проводит осмотры, назначает анализы, направляет к узким специалистам.");
    }

    public void assignDoctor(Patient patient) {
        if (patient.getTreatmentPlan() == 1) {
            patient.setDoctor(new Surgeon());
            System.out.println("Терапевт назначил хирурга.");
        } else if (patient.getTreatmentPlan() == 2) {
            patient.setDoctor(new Dentist());
            System.out.println("Терапевт назначил дантиста.");
        } else {
            patient.setDoctor(new Therapist());
            System.out.println("Терапевт назначил терапевта.");
        }
        patient.getDoctor().treat();
    }
}

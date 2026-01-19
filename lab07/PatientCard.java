import java.util.ArrayList;

public class PatientCard {
    private ArrayList<String> medicalHistory = new ArrayList<>();
    private ArrayList<String> allergies = new ArrayList<>();
    private ArrayList<String> medications = new ArrayList<>();
    public ArrayList<String> getMedicalHistory() {
        return new ArrayList<>(medicalHistory);
    }
    public ArrayList<String> getAllergies() {
        return new ArrayList<>(allergies);
    }
    public ArrayList<String> getMedications() {
        return new ArrayList<>(medications);
    }
    public void addHistory(String entry)
    {
        medicalHistory.add(entry);
    }
    public void addAllergies(String allergy)
    {
        allergies.add(allergy);
    }
    public void addMedication(String medication)
    {
        medications.add(medication);
    }
    @Override
    public String toString()
    {
        return "PAtientCard{" + "medicalHistory=" + medicalHistory +" , allergies=" + allergies +
                ", medications=" + medications + '}';
    }
}

package homework1;

public class Registry implements IRegistry{

    public void registerPatient(IPatient patient) {
        IMedicalCard medicalCard = new MedicalCard();
        medicalCard.searchMedicalCard(patient);
        patient.setRoomNumber(getRoomNumber());
    }
    private int getRoomNumber(){
        return 204;
    }
}

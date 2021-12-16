package homework1;

public class Patient implements IPatient{
    private IMedicalCard medicalCard;
    private int roomNumber;

    public void askForHelp(){
        System.out.println("Пациент обратился за помощью");
    }

    public void setCard (MedicalCard card){
        this.medicalCard = medicalCard;
        System.out.println("Карта выдана пациенту");
    }
    public void setRoomNumber(int roomNumber){
        this.roomNumber = roomNumber;
        System.out.println("Врач ожидает в кабинете " + roomNumber);
    }




}

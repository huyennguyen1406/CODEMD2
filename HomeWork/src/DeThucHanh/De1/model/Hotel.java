package DeThucHanh.De1.model;

public class Hotel{
   private int dateOfHire;
   private String kindOfRoom;
   private double roomRates;

   public Hotel() {
   }

    public Hotel(int dateOfHire, String kindOfRoom, double roomRates) {
        this.dateOfHire = dateOfHire;
        this.kindOfRoom = kindOfRoom;
        this.roomRates = roomRates;
    }

    public int getDateOfHire() {
        return dateOfHire;
    }

    public void setDateOfHire(int dateOfHire) {
        this.dateOfHire = dateOfHire;
    }

    public String getKindOfRoom() {
        return kindOfRoom;
    }

    public void setKindOfRoom(String kindOfRoom) {
        this.kindOfRoom = kindOfRoom;
    }

    public double getRoomRates() {
        return roomRates;
    }

    public void setRoomRates(double roomRates) {
        this.roomRates = roomRates;
    }


    public void displayRoom() {
        System.out.printf("%-15d", dateOfHire);
        System.out.printf("%-15s", kindOfRoom);
        System.out.printf("%-15f", roomRates);
        System.out.println();
    }
}
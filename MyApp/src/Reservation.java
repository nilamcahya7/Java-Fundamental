import dataStatic.Room;

public class Reservation {
  public static void main(String[] args) {
    Reservation reservation = new Reservation();
    reservation.historyTransaction();
  }

  public void historyTransaction() {
    System.out.println("Nomor | User ID | Room ID | Status | Begin Reservation | End Reservation | Submit Transaction");
    System.out.println("-----------------------------------------------------------------------------------------------");

    for (int i = 0; i < Room.user_id.length; i++) {
      System.out.format("%d  |    %d   |     %d     |   %d     |     %s     |    %s    |   %s   \n", 
        i + 1, Room.user_id[i], Room.room_id[i], Room.status_id[i], Room.begin_reservation[i], Room.end_reservation[i], Room.submit_transaction[i]);
    }
  }
}

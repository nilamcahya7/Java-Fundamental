// /**
//  * Hello
//  */
// public class Hello {

//   public static void main(String[] args) {
//     System.out.println("Hello!");
//   }
// }

// public static String[] bookingRoom(int id, int user_id, int status_id, String begin_reservation, String end_reservation) {
//   String[] bookingRoom = new String[5];
//   if (id <= 0 || user_id <= 0 || status_id < 0 || begin_reservation.isEmpty() || end_reservation.isEmpty()) {
//     return new String[]{"Error: Parameter input tidak valid."};
//   };

//     bookingRoom[0] = "Room ID: " + id;
//     bookingRoom[1] = "User ID: " + user_id;
//     bookingRoom[2] = "Status ID: " + status_id;
//     bookingRoom[3] = "Begin Reservation: " + begin_reservation;
//     bookingRoom[4] = "End Reservation: " + end_reservation;

//       return bookingRoom;
// };

// String[] response = bookingRoom(1, 1, 1, "2024-07-20", "2024-07-25");
//       for (String msg : response) {
//         System.out.println(msg);
//       }
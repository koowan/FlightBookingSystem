import java.util.*;

public class StaffAccounts {

  private ArrayList<Staff> staffs = new ArrayList<Staff>();


  public void register(Staff staff) {
    staffs.add(staff);
  }

  public Staff lookup(String email) {
    for (Staff staff : staffs) {
      if (staff.getEmail().equals(email)) {
        return staff;
      }
    }
    return null;
  }

}

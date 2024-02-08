import java.util.ArrayList;
import java.util.HashMap;

public class DSusingMap {
    public static void main(String[] args) {
      UserList user = new UserList();
      user.set(1,33);
      user.set(2,55);
      user.set(8,99);
     System.out.println(user.get(1));
     user.set(1,999);
     System.out.println(user.get(1));
    }
}
/**
 * 
 */
 class Users {
    int id;
    int balance;
    Users(int i ,int b){
      id = i;
      balance =b;
    }

    
}
class UserList{
  HashMap<Integer,Integer>m = new HashMap<>();
  UserList(){
    m = new HashMap<>();
  }
  int get(int i){
    return m.get(i);
  }
  void set(int i ,int b){
    m.put(i, b);
  }
}

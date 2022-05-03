public class User extends permission {

         public  int id;
         public int role;
         public String name;
         public String Email;
         public int dob;
         public String useraddress;
         public double usercontno;

    User() {
        super();
    }
    //methods

    static  class main{
        public static void main(String[] args) {

        }
    }
         public  int getId(){
              return id;
    }
         public int getRole(){
              return role;
    }
         public  String getname(){
               return name;
    }
         public  String getEmail(){
               return Email;
    }
         public  String getUseraddress(){
                return useraddress;
    }
         public  double getUsercontno(){
                return usercontno;
    }
}


import javax.management.relation.Role;
import java.security.PrivateKey;

public class permission  {

    int id;
    String description;
    String type;
    String data;
    int password;

    permission(int id, String description, String type, String data, int password) {
        super();
        this.id = id;
        this.description = description;
        this.type = type;
        this.data = data;
        this.password = password;

    }

    public permission(int id) {
        this();
    }

    public permission() {
        super();
    }

    class Passanger {
        permission Parmission;
    }
}














/*  Passanger(int id, String description, String type, String data, int password) {
                super(id, description, type, data, password);
            }
        }
*/
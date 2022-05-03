public class Role extends permission {

    public int id;
    public  String title;
    public String description;
    static String deleteRole;
    static String addRole;
    static String searchRole;
    static String editRole;

    Role(int id) {
        super();
    }

    public Role() {
    }

    static class main{

        // methods
        public void EditRoleDetails(){

            System.out.println("addRole"+addRole);
            System.out.println("editRole"+editRole);
            System.out.println("deleteRole"+deleteRole);
            System.out.println("searchRole"+searchRole);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static String getDeleteRole() {
        return deleteRole;
    }

    public static void setDeleteRole(String deleteRole) {
        Role.deleteRole = deleteRole;
    }

    public static String getAddRole() {
        return addRole;
    }

    public static void setAddRole(String addRole) {
        Role.addRole = addRole;
    }

    public static String getSearchRole() {
        return searchRole;
    }

    public Role(int id, String description, String type, String data, int password) {
        super(id, description, type, data, password);
    }

    public static void setSearchRole(String searchRole) {
        Role.searchRole = searchRole;
    }

    public static String getEditRole() {
        return editRole;
    }

    public static void setEditRole(String editRole) {
        Role.editRole = editRole;
    }
}




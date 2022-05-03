public class FlightEnquiry {
        int id;
        String type;
        String title;
        String description;
        int date;

        public FlightEnquiry(int id, String type, String title, String description, int date) {
                this.id = id;
                this.type = type;
                this.title = title;
                this.description = description;
                this.date = date;
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getType() {
                return type;
        }

        public void setType(String type) {
                this.type = type;
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

        public int getDate() {
                return date;
        }

        public void setDate(int date) {
                this.date = date;
        }
}

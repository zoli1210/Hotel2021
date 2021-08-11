package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

    @Entity
    public class OrderData {

        @GeneratedValue
        @Id
        private Long id;
        private String name;
        private String email;
        private String roomtype;
        private Number head;
        private String supply;
        private Date startdate;
        private Date leavedate;

        public OrderData() {
        }

        public OrderData(String name, Long id, String email, String roomtype, Number head, String supply, Date startdate, Date leavedate) {
            this.name = name;
            this.id = id;
            this.email = email;
            this.roomtype = roomtype;
            this.head = head;
            this.supply = supply;
            this.startdate = startdate;
            this.leavedate =leavedate;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getRoomtype() {
            return roomtype;
        }

        public void setRoomtype(String roomtype) {
            this.roomtype = roomtype;
        }

        public Number getHead() {
            return head;
        }

        public void setHead(Number head) {
            this.head = head;
        }

        public String getSupply() {
            return supply;
        }

        public void setSupply(String supply) {
            this.supply = supply;
        }

        public Date getStartdate() {
            return startdate;
        }

        public void setStartdate(Date startdate) {
            this.startdate = startdate;
        }

        public Date getLeavedate() {
            return leavedate;
        }

        public void setLeavedate(Date leavedate) {
            this.leavedate = leavedate;
        }
    }

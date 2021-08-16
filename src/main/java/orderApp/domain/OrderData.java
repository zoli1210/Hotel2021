package orderApp.domain;

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
        private String roomType;
        private int head;
        private String supply;
        private Date startDate;
        private Date leaveDate;

        public OrderData() {
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

        public String getRoomType() {
            return roomType;
        }

        public void setRoomType(String roomtype) {
            this.roomType = roomtype;
        }

        public int getHead() {
            return head;
        }

        public void setHead(int head) {
            this.head = head;
        }

        public String getSupply() {
            return supply;
        }

        public void setSupply(String supply) {
            this.supply = supply;
        }

        public Date getStartDate() {
            return startDate;
        }

        public void setStartDate(Date startdate) {
            this.startDate = startdate;
        }

        public Date getLeaveDate() {
            return leaveDate;
        }

        public void setLeaveDate(Date leavedate) {
            this.leaveDate = leavedate;
        }
    }

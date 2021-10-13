package FlightReservationSystem;
public class Passenger {
    private Address address;
    private Contact contact;
    private static int idCounter;
    private int id;
    private static class Contact {
        public String name, phone, emailId;
        public Contact(String name, String phone, String emailId) {
            this.name = name;
            this.phone = phone;
            this.emailId = emailId;
        }
        public void updateContactDetails(String name, String phone,String emailId){
            this.name=name;
            this.phone=phone;
            this.emailId=emailId;
            System.out.println("Updated Contact Details");
        }
    }
        private static class Address {
            public String street,city, state;
            public Address(String street, String city, String state) {
                this.street = street;
                this.city = city;
                this.state = state;
            }
            public void updateAddressDetails(String street, String city, String state){
                this.street=street;
                this.city=city;
                this.state=state;
                System.out.println(" Updated Address Details");}
    }

    public Passenger(String name, String phone, String emailId,String street, String city, String state){
        this.id=idCounter++;
        this.contact= new Contact(name, phone, emailId);
        this.address= new Address(street, city, state);
    }
    public int getPassengerCount(){
        return idCounter;
    }

    public Contact getContact() {
        return contact;
    }

    public  Address getAddress(){
        return address;
    }

        public String getContactDetails(){
            return  contact.name+" "+contact.phone+" " +contact.emailId+" ";
        }
        public String getAddressDetails() {
            return address.street+" " + address.city+" "+address.state;
        }
    }

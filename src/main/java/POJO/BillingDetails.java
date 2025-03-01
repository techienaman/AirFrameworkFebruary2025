package POJO;

public class BillingDetails {


    public BillingDetails(builderBillingAddress builderBillingAddress){
        this.firstName=builderBillingAddress.getFirstName();
        this.lastName=builderBillingAddress.getLastName();
     //   this.country=builderBillingAddress.getCountry();
        this.streetAddress=builderBillingAddress.getStreetAddress();
        this.town=builderBillingAddress.getTown();
        this.state=builderBillingAddress.getState();
        this.zipCode=builderBillingAddress.getZipCode();
        this.phone=builderBillingAddress.getPhone();
        this.emailAddress=builderBillingAddress.getEmailAddress();

    }

    private String firstName;
    private String lastName;
    private String companyName;
    private String country;
    private String streetAddress;

    private String town;
    private String state;
    private String zipCode;
    private String phone;
    private String emailAddress;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCountry() {
        return country;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getTown() {
        return town;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmailAddress() {
        return emailAddress;
    }


    public static class builderBillingAddress{
        private String firstName;
        private String lastName;
        private String companyName;
        private String country;
        private String streetAddress;

        private String town;
        private String state;
        private String zipCode;

        private String phone;
        private String emailAddress;
        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getCompanyName() {
            return companyName;
        }

        public String getCountry() {
            return country;
        }

        public String getStreetAddress() {
            return streetAddress;
        }

        public String getTown() {
            return town;
        }

        public String getState() {
            return state;
        }

        public String getZipCode() {
            return zipCode;
        }

        public String getPhone() {
            return phone;
        }

        public String getEmailAddress() {
            return emailAddress;
        }


        public builderBillingAddress(String firstName,String lastName,String streetAddress,String town,String zipCode,String emailAddress){
            this.firstName=firstName;
            this.lastName=lastName;
            this.streetAddress=streetAddress;
            this.town=town;
         //   this.state=state;
            this.zipCode=zipCode;
            this.phone=phone;
            this.emailAddress=emailAddress;
        }

        public BillingDetails build(){
            return new BillingDetails(this);
        }


    }







}

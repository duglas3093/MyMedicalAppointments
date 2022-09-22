package model;

public abstract class User {
    private int id;
    private String name;
    private String email;
    private String address;
    private String phonenumber;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        if (phonenumber.length() > 8){
            System.out.println("El numero de telefono debe ser de 8 digitos maximo");
        }else if(phonenumber.length() == 8){
            this.phonenumber = phonenumber;
        }
    }

    @Override
    public String toString() {
        return "model.User: " + name + " Email: "+email+
                "\nAddress: "+address+" Phone: "+phonenumber;
    }

    public abstract void showDataUser();
}

package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{
    private String speciality;
    private ArrayList<AviableAppointment> aviableAppointments = new ArrayList<>();

    public Doctor(String name, String email, String speciality) {
        super(name, email);
        System.out.println("El nombre del doctor es: " + name);
        this.speciality = speciality;
    }
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }



    public void addAviableAppointment(String date, String time){
        aviableAppointments.add(new Doctor.AviableAppointment(date,time));
    }

    public ArrayList<AviableAppointment> getaviableAppointments(){
        return aviableAppointments;
    }

    @Override
    public String toString() {
        return super.toString()+"\nSpeciality: "+speciality+"\nAviable:"+aviableAppointments.toString();
    }

    @Override
    public void showDataUser(){
        System.out.println("Empleado de Hospital: Cruz roja");
        System.out.println("Departamento: Cancerologia");
    }

    public static class AviableAppointment {
        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");

        public AviableAppointment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate(String DATE) {
            return date;
        }
        public String getDate() {
            return format.format(date);
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Avaible Appointments \nDate: " + date + "\nTime: " + time;
        }
    }
}

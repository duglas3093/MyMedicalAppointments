package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UIPatientMenu {

    public static void showPatientMenu() {
        int response = 0 ;
        do{
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome "+UIMenu.patientLogget.getName());
            System.out.println("1. Book an Appointment");
            System.out.println("2. My apponintment");
            System.out.println("0. Logout");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextInt());
            switch (response){
                case 1:
                    showBookAppointmentMenu();
                    break;
                case 2:
                    showPatientMyAppointments();
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
                default :
                    break;
            }
        }while (response!=0);
    }

    private static void showBookAppointmentMenu() {
        int response = 0;
        do {
            System.out.println(":: Book an appointmentd");
            System.out.println(":: Select date:");
            Map<Integer,Map<Integer, Doctor>> doctors = new TreeMap<>();
            int k = 0;
            for (int i = 0; i < UIDoctorMenu.doctorsAvailableAppointments.size(); i++) {
                ArrayList<Doctor.AviableAppointment> availableAppointments = UIDoctorMenu.doctorsAvailableAppointments.get(i).getaviableAppointments();
                Map<Integer, Doctor> doctorAppointments = new TreeMap<>();
                for (int j = 0; j < availableAppointments.size(); j++) {
                    k++;
                    System.out.println(k+". "+availableAppointments.get(j).getDate());
                    doctorAppointments.put(Integer.valueOf(j), UIDoctorMenu.doctorsAvailableAppointments.get(i));
                    doctors.put(Integer.valueOf(k), doctorAppointments);
                }
            }
            Scanner sc = new Scanner(System.in);
            int responseDateSelected = Integer.valueOf(sc.nextLine());
            Map<Integer, Doctor> doctorAvailableSelected = doctors.get(responseDateSelected);
            Integer indexDate = 0;
            Doctor doctorSelected = new Doctor("", "", "");
            for (Map.Entry<Integer, Doctor> doc : doctorAvailableSelected.entrySet()) {
                indexDate = doc.getKey();
                doctorSelected = doc.getValue();
            }
            System.out.println( doctorSelected.getName()+
                    ". Date: " +
                    doctorSelected.getaviableAppointments().get(indexDate).getDate() +
                    ". Time: " +
                    doctorSelected.getaviableAppointments().get(indexDate).getTime()
                    );
            System.out.println("Confirm your appointment: \n1. Yes\n2. Change data");
            response = Integer.valueOf(sc.nextLine());
            if (response == 1) {
                UIMenu.patientLogget.addAppointmentDoctors(
                        doctorSelected,
                        doctorSelected.getaviableAppointments().get(indexDate).getDate(null),
                        doctorSelected.getaviableAppointments().get(indexDate).getTime()
                );
                showPatientMenu();
            }
        } while (response != 0);
    }

    private static void showPatientMyAppointments() {
        int response = 0;
        do {
            System.out.println(":: My Appointments");
            if (UIMenu.patientLogget.getAppointmentDoctors().size() == 0) {
                System.out.println("Don't have appointments");
                break;
            }
            for (int i = 0; i < UIMenu.patientLogget.getAppointmentDoctors().size(); i++) {
                int j = i + 1;
                System.out.println(j + ". " +
                        "Date: " + UIMenu.patientLogget.getAppointmentDoctors().get(i).getDate() +
                        "Time: " + UIMenu.patientLogget.getAppointmentDoctors().get(i).getTime() +
                        "\nDoctor: " + UIMenu.patientLogget.getAppointmentDoctors().get(i).getDoctor()
                );
            }
            System.out.println("0. Return");
        } while (response != 0);
    }
}

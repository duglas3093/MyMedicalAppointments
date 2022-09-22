package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class UIDoctorMenu {

    public static ArrayList<Doctor> doctorsAvailableAppointments = new ArrayList<>();

    public static void showDoctorMenu() {
        int response = 0 ;
        do{
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome "+UIMenu.doctorLogget.getName());
            System.out.println("1. Add Avaible Appointment");
            System.out.println("2. My Scheduled apponintment");
            System.out.println("0. Logout");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextInt());
            switch (response){
                case 1:
                    showAddAvialableApponintmentsMenu();
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
                default :
                    break;
            }
        }while (response!=0);
    }

    private static void showAddAvialableApponintmentsMenu(){
        int response = 0;
        do {
            System.out.println();
            System.out.println("::Add Availabel Appointment");
            System.out.println(":: Select a Month");
            for (int i = 0; i < 3;i++){
                int j = i + 1;
                System.out.println(j+". "+UIMenu.MONTHS[i]);
            }
            System.out.println("0. Return");
            Scanner sc = new Scanner(System.in);
            Scanner scString = new Scanner(System.in);
            response = Integer.valueOf(sc.nextInt());
            if(response > 0 && response < 4){
                int monthSelect = response;
                System.out.println(monthSelect+". "+UIMenu.MONTHS[monthSelect-1]);
                System.out.println("Insert the available: [dd/mm/yyyy]");
                String date = scString.nextLine();
                System.out.println("Your date is: "+date+"\n1. Correct \n2. Change Date");
                int responseDate = Integer.valueOf(scString.nextLine());
                if (responseDate == 2) continue;
                int responseTime = 0;
                String time = "";
                do {
                    System.out.println("Insert the available for date: " + date + " [16:00]");
                    time = scString.nextLine();
                    System.out.println("Your time is: " + time + "\n1. Correct \n2. Change Time");
                    responseTime = Integer.valueOf(sc.nextInt());
                } while (responseTime == 2);

                UIMenu.doctorLogget.addAviableAppointment(date,time);
                checkDoctorAvailableApponintments(UIMenu.doctorLogget);

            }else if(response == 0){
                showDoctorMenu();
            }
        } while (response != 0);
    }

    private static void checkDoctorAvailableApponintments(Doctor doctor) {
        if(doctor.getaviableAppointments().size() > 0
            && !doctorsAvailableAppointments.contains(doctor)){
            doctorsAvailableAppointments.add(doctor);
        }
    }
}

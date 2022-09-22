import model.Doctor;
import model.ISchedulable;
import model.Patient;
import model.User;

import java.util.Date;

import static ui.UIMenu.showMenu;

public class Main {
    public static void main(String[] args) {

        showMenu();
//        Doctor myDoctor = new Doctor("Douglas","douglas@mail.com","general Medic");
//        myDoctor.addAviableAppointment(new Date(),"4pm");
//        myDoctor.addAviableAppointment(new Date(),"6pm");
//        myDoctor.addAviableAppointment(new Date(), "1pm");

        /*for (model.Doctor.AviableAppointment aA : myDoctor.getaviableAppointments() ){
            System.out.println(aA.getDate()+" "+aA.getTime());
        }*/

//        System.out.println(myDoctor);
//
//        User user = new Doctor("marco","marco@mail.com","pediatria");
//        user.showDataUser();
//        User userPat = new Patient("marco", "marco@mail.com");
//        userPat.showDataUser();
//
//        User user1 = new User("Douglas","douglas@mail.com") {
//            @Override
//            public void showDataUser() {
//                System.out.println("Doctor");
//                System.out.println("Hospital: Cruz verde");
//                System.out.println("departamento: Geriatria");
//            }
//        };
//        user1.showDataUser();

        /*ISchedulable iScheduler = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {
                System.out.println();
            }
        }*/
//        model.Patient patient = new model.Patient("Douglas","douglas@mail.com");
//        System.out.println(patient);
//        System.out.println(myDoctor.name);
//        System.out.println(myDoctor.speciality);
//
//        model.Patient patient = new model.Patient("jose","mail@mail.com");
    }
}

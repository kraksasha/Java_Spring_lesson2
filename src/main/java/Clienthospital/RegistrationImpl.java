package Clienthospital;

public class RegistrationImpl implements Registration {

    @Override
    public void getCab(String s){
        if (s.equals("Терапевт")){
            System.out.println("Вам в кабинет 116");
        } else if (s.equals("Офтальмолог")){
            System.out.println("Вам в кабинет 124");
        } else if (s.equals("Хирург")){
            System.out.println("Вам в кабинет 145");
        } else if (s.equals("Лор")){
            System.out.println("Вам в кабинет 113");
        }
    }

}

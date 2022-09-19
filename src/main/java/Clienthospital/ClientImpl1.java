package Clienthospital;

public class ClientImpl1 implements Client{

    private Registration registration;

    public Registration getRegistration() {
        return registration;
    }

    public void setRegistration(Registration registration) {
        this.registration = registration;
    }

    @Override
    public void foundNumberCab(String doctor) {
        System.out.println("Мне нужен " + doctor);
        registration.getCab(doctor);
    }
}

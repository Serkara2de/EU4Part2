package day44_oopReview.callcenter;

public class WhatsApp extends MessagingApp implements VoiceCallable,VideoCallable{


    @Override
    public void sendMessage(String msg) {
        System.out.println("Whatsapp sending a message "+msg);
    }

    @Override
    public void videoCall() {
        System.out.println("I am not able make video call now");

    }

    @Override
    public void call(String contact) {
        System.out.println(contact+" is calling");

    }

    /*
    @Override
    public void accept(){
    }
    */
}

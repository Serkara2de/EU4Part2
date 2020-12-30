package day44_oopReview.callcenter;

public class CallCenter {

    public static void main(String[] args) {
        WhatsApp wa = new WhatsApp();

        wa.launch();
        wa.allOSCompatible = true;
        wa.isFree = true;
        wa.name = "Whatsapp";
        wa.call("Serkan");
        wa.sendMessage("Thank you");
        wa.videoCall();
        wa.accept();

        VoiceCallable.decline();
        System.out.println(VoiceCallable.CAN_CALL);


        wa.getCount();
        wa.setCount(4);




    }
}

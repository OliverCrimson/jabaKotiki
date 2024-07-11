import main.java.animals.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik kotikOne = new Kotik("Vasya", "Mew", 5, 5);
        Kotik kotikTwo = new Kotik();
        kotikTwo.setName("Yoba");
        kotikTwo.setVoice("Chirik-chirik");
        kotikTwo.setSatiety(4);
        kotikTwo.setWeight(7);



        String[] activities = kotikOne.liveAnotherDay();
        System.out.println(kotikOne.getName() + " activities for the past day: ");
        for (String activity : activities) {
            if (activity != null) {
                System.out.println(activity);
            }
        }

        boolean voiceMatch = compareVoice(kotikOne, kotikTwo);

        if (voiceMatch) {
            System.out.println("Kotiki govoryat odinakovo");
        } else {
            System.out.println("Kotiki govoryat ne odinakovo");
        }

        System.out.println("Kotikov segodnya: " + Kotik.getKotiksCounter());
    }

    public static boolean compareVoice(Kotik kotik1, Kotik kotik2) {
        return kotik1.getVoice().equals(kotik2.getVoice());
    }

}

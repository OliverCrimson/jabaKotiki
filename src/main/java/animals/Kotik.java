package main.java.animals;

import java.util.Random;

public class Kotik {
    private String name;
    private String voice;
    private int satiety;
    private int weight;
    private static int count = 0;
    private static final int METHODS = 5;

    // Constructor with params
    public Kotik(String name, String voice, int satiety, int weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
        count++;
    }

    // Constructor without params
    public Kotik() {
        this.name = "Yoba";
        this.voice = "Wof-Wof";
        this.satiety = 5;
        this.weight = 10;
        count++;
    }

    // getter counter kotikov
    public static int getKotiksCounter() {
        return count;
    }

    // eat method
    public void eat(int food) {
        satiety += food;
        //System.out.println(name + " has eaten " + food + "food");
    }

    // eat overload
    public void eat(int food, String foodName) {
        satiety += food;
        //System.out.println(name + " has eaten " + food + " of " + foodName);
    }

    // eat overload bare
    public void eat() {
        eat(2, "fish");
    }

    // play method
    public boolean play() {
        if (satiety > 0) {
            //System.out.println(name + " ready to play!" + voice + "!");
            satiety--;
            return true;
        } else {
            //System.out.println(name + " is too hungry to play shit, buddy. Feed this motherfucker");
            return false;
        }
    }

    // hunt method
    public boolean hunt() {
        if (satiety > 0) {
            //System.out.println(name + " is ready for a good hunt!");
            satiety--;
            return true;
        } else {
            //System.out.println(name + " aint gonna hunt, feed it first, buddy!");
            return false;
        }
    }

    // walk method
    public boolean walk() {
        if (satiety > 0) {
            //System.out.println(name + " is ready to walk!" + voice + "!");
            satiety--;
            return true;
        } else {
            //System.out.println(name + " is too hungry for a walk!");
            return false;
        }
    }

    //sleep method
    public boolean sleep() {
        if (satiety > 0) {
            //System.out.println(name + " is ready to sleep!" + voice + "!");
            satiety--;
            return true;
        } else {
            //System.out.println(name + " is too hungry to sleep!");
            return false;
        }
    }

    // wash method
    public boolean wash() {
        if (satiety > 0) {
            //System.out.println(name + " is ready to wash its ass!");
            count--;
            return true;
        } else {
            //System.out.println(name + " is too hungry to wash its ass!");
            return false;
        }
    }

    // activities method
    public String[] liveAnotherDay() {
        String[] activities = new String[24];
        Random random = new Random();

        for (int hour = 0; hour < 24; hour++) {
            int action = random.nextInt(METHODS + 1);

            switch (action) {
                case 0:
                    activities[hour] = hour + " slept";
                    sleep();
                    break;
                case 1:
                    activities[hour] = hour + " washed ass";
                    wash();
                    break;
                case 2:
                    activities[hour] = hour + " payed";
                    if (!play()) {
                        eat(3, "some food");
                    }
                    break;
                case 3:
                    activities[hour] = hour + " had food";
                    eat();
                    break;
                case 4:
                    activities[hour] = hour + " hunted";
                    hunt();
                    break;
            }
        }

        return activities;
    }

    // name setter
    public void setName(String name) {
        this.name = name;
    }

    // name getter
    public String getName() {
        return name;
    }

    // voice setter
    public void setVoice(String voice) {
        this.voice = voice;
    }

    // voice getter
    public String getVoice() {
        return voice;
    }

    // weight setter
    public void setWeight(int weight) {
        this.weight = weight;
    }

    // weight getter
    public int getWeight() {
        return weight;
    }

    // satiety setter
    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    // satiety getter
    public int getSatiety() {
        return weight;
    }

}



































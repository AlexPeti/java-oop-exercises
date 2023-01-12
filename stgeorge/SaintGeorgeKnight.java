package gr.aueb.cf.exercisesch14oop.stgeorge;

public class SaintGeorgeKnight {
    private static final SaintGeorgeKnight INSTANCE = new SaintGeorgeKnight();

    private SaintGeorgeKnight() {};

    public static SaintGeorgeKnight getInstance() {
        return INSTANCE;
    }

    public void embarkOnMission() {
        System.out.println("God for Harry, England and Saint George!");
    }
}

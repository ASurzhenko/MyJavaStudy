package patterns.singleton;

/**
 * Created by User on 03.06.2016.
 */
public final class TheGod implements God {

    private static TheGod instance;

    /*private static class Holder {
        static final TheGod instance = new TheGod();
    }*/

    public static TheGod getInstance() {
        if (instance == null) {
            synchronized (TheGod.class) {
                if (instance == null) {
                    instance = new TheGod();
                }
            }
        }
        return instance;
        //return Holder.instance;
    }

    private TheGod() {
        System.out.println("God always been here!");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public final void create() {
        System.out.println("All the world in 7 days");
    }

    @Override
    public void heal() {
        System.out.println("Stand up and go!");
    }

    @Override
    public String getName() {
        return "God";
    }

    public static void prophet() {
        System.out.println("Jesus");
    }

    public static void clear() {
        instance = null;
    }
}

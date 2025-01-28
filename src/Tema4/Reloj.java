package Tema4;


public class Reloj {

    public Reloj() {

        hours = 0;
        minutes = 0;
        seconds = 0;
        pm = true;
    }

    public Reloj(int hours, int minutes, int seconds) {

        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void setHours(int hours) {

        if (hours < 24 && hours >= 0) {
            this.hours = hours;
        }
    }

    public void setMinutes(int minutes) {

        if (minutes < 60 && minutes >= 0) {
            this.minutes = minutes;
        }
    }

    public void setSeconds(int seconds) {

        if (seconds < 60 && seconds >= 0) {
            this.seconds = seconds;
        }
    }

    public static void darHora(boolean pm, int hours, int minutes, int seconds) {

        if (!pm) {
            System.out.println("%02d:%02d:%02d" + hours + minutes + seconds );
        } else if (hours < 12) {
            System.out.println("%02d:%02d:%02d:AM" + hours + minutes + seconds);
        } else {
            hours = hours - 12;
            System.out.println("%02d:%02d:%02d:PM" + hours + minutes + seconds);
        }
    }

    public static boolean isPm(int am) {

        if (am == 0) return true;
        else return false;
    }

    public int getHours() {
        return hours;
    }

    public boolean getPm() {
        return pm;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setPm(boolean pm) {


        this.pm = pm;
    }

    @Override
    public String toString() {
        return "Reloj{" +
                "pm=" + pm +
                ", hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }

    private boolean pm;
    private int hours;
    private int minutes;
    private int seconds;
}

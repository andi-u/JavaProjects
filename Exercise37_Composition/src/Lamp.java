public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;

    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn() {
        System.out.println("Lamp -> Turning on");
    }

    public String getStyle() {
        return this.style;
    }

    public boolean isBattery(){
        return this.battery;
    }

    public int getGlobRating(){
        return this.globRating;
    }
}

/*
Create a class and name it Lamp. Inside this class should be declared three member variables:
- style of type String,
- battery of type boolean, and
- globRating of type int.
All variables should be marked private.
A constructor needs to be created which accepts the three member
variables as parameters. In addition, four methods should also be created:
- turnOn() has no return type and should print a message that the lamp is being turned on;
- getStyle() returns the lamp style;
- isBattery returns the value of battery; and
- getGlobRating() returns the globRating of the lamp.

To be sure that the correct output is generated so your code passes the evaluation, use the following
statements in your code:
System.out.println("Lamp -> Turning on"); should be used in the turnOn() method of the Lamp class.
 */

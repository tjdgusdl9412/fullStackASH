public class Computerparts {
    private String desktop;
    private String mouse;
    private int keyboard;
    private int headset;

    public Computerparts(){

    }
    public Computerparts(String desktop, String mouse, int keyboard, int headset) {
        this.desktop = desktop;
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.headset = headset;
    }
    public String getDesktop() {
        return desktop;
    }
    public void setDesktop(String desktop) {
        this.desktop = desktop;
    }
    public String getMouse() {
        return mouse;
    }
    public void setMouse(String mouse) {
        this.mouse = mouse;
    }
    public int getKeyboard() {
        return keyboard;
    }
    public void setKeyboard(int keyboard) {
        this.keyboard = keyboard;
    }
    public int getHeadset() {
        return headset;
    }
    public void setHeadset(int headset) {
        this.headset = headset;
    }
    @Override

    public String toString() {
        return " [desktop=" + desktop + ", headset=" + headset + "개" + ", keyboard=" + keyboard + "개" + ", mouse=" + mouse + "]";
    }

}
    

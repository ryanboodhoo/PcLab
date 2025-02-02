public class PcLab {

    private Case pcCase;
    private Motherboard motherboard;
    private Monitor monitor;

    public PcLab(Case pcCase, Motherboard motherboard, Monitor monitor) {
        this.pcCase = pcCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }

    public Case getPcCase() {
        return pcCase;
    }

    public void setPcCase(Case pcCase) {
        this.pcCase = pcCase;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "PcLab{" +
                "pcCase=" + pcCase +
                ", motherboard=" + motherboard +
                ", monitor=" + monitor +
                '}';
    }

    void drawLogo() {
         monitor.drawPixel(5,5,"red");
    }

    public void description() {
        System.out.println("Welcome to Worst Buy! Below is the description of the PC on sale today:");
        System.out.println(pcCase + "\n" + monitor + "\n" + motherboard);
    }


    public void powerUp() {
         pcCase.pressPowerButton();
         drawLogo();
         motherboard.loadProgram("Windows 10");
    }


}

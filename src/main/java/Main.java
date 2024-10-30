public class Main {
    public static void main(String[] args) {


        Resolution resolution = new Resolution(50,50);
         Monitor monitor =new Monitor(resolution, 24, "50x50");
         Dimension dimensions = new Dimension(200, 200, 100);
         Case pcCase = new Case("Windows xp", "Microsoft", "220 volts", dimensions);
         Motherboard motherBoard = new Motherboard("sony23", "Sony", 2, 4, "sony-bios");

        PcLab pcLab = new PcLab(pcCase, motherBoard, monitor);

        pcLab.description();

        pcLab.powerUp();






    }
}
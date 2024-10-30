public class Monitor  {


    private String resolution;
    private int modelNumber;
    private String manufacturerName ;

    public Monitor(Resolution manufacturerName, int modelNumber, String resolution) {
        this.manufacturerName = String.valueOf(manufacturerName);
        this.modelNumber = modelNumber;
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public void drawPixel(int x, int y, String color) {
        System.out.println("Drawing pixel at (" + x + ", " + y + ") with color: " + color);
    }


    @Override
    public String toString() {
        return "Monitor{" +
                "resolution='" + resolution + '\'' +
                ", modelNumber=" + modelNumber +
                ", manufacturerName='" + manufacturerName + '\'' +
                "} ";
    }
}

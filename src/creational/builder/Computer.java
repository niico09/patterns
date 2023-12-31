package creational.builder;

public class Computer {

    private String cpu;
    private String ram;
    private String storage;
    private String gpu;
    private String monitor;
    private boolean hasBluetooth;
    private boolean hasWifi;

    private Computer() {
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public String getGpu() {
        return gpu;
    }

    public String getMonitor() {
        return monitor;
    }

    public boolean isHasBluetooth() {
        return hasBluetooth;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    static class ComputerBuilder{
        private Computer computer;

        public ComputerBuilder() {
            this.computer = new Computer();
        }

        public ComputerBuilder setCpu(String cpu) {
            this.computer.cpu = cpu;
            return this;
        }

        public ComputerBuilder setRam(String ram) {
            this.computer.ram = ram;
            return this;
        }

        public ComputerBuilder setStorage(String storage) {
            this.computer.storage = storage;
            return this;
        }

        public ComputerBuilder setGpu(String gpu) {
            this.computer.gpu = gpu;
            return this;
        }

        public ComputerBuilder setMonitor(String monitor) {
            this.computer.monitor = monitor;
            return this;
        }

        public ComputerBuilder setHasBluetooth(boolean hasBluetooth) {
            this.computer.hasBluetooth = hasBluetooth;
            return this;
        }

        public ComputerBuilder setHasWifi(boolean hasWifi) {
            this.computer.hasWifi = hasWifi;
            return this;
        }

        public Computer build(){
            return this.computer;
        }
    }

}


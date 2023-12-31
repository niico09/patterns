package creational.builder;

public class Main {

    public static void main(String[] args) {

        var computer = new Computer.ComputerBuilder()
                .setCpu("Intel i7")
                .setRam("16GB")
                .setStorage("1TB")
                .setGpu("Nvidia RTX 2080")
                .setMonitor("27 inch")
                .setHasBluetooth(true)
                .setHasWifi(true)
                .build();

        System.out.println(computer.getCpu());
        System.out.println(computer.getRam());
        System.out.println(computer.getStorage());
        System.out.println(computer.getGpu());
        System.out.println(computer.getMonitor());
        System.out.println(computer.isHasBluetooth());
        System.out.println(computer.isHasWifi());

    }
}

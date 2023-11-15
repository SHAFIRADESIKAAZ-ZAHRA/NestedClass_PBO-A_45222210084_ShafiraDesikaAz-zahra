package Operasi;

public class Main {
    public static void main(String[] args) {
        CPU myKomputer = new CPU(15000000, "Lenovo");

        CPU.Processor i7 = myKomputer.new Processor(8, "Intel", "i7");
        CPU.RAM rs32GB = myKomputer.new RAM(32, "Samsung");
        CPU.Harddisk hd1TB = myKomputer.new Harddisk("SSD", 1000);
        CPU.Motherboard mb = myKomputer.new Motherboard("AMD", "B550");
        CPU.PowerSupply psu = myKomputer.new PowerSupply("Corsair", 750);
        CPU.VGACard vga = myKomputer.new VGACard("NVIDIA", "RTX 3080");

        myKomputer.getCPUInfo();
        i7.getProcessorInfo();
        rs32GB.getInfoRAM();
        hd1TB.getInfoHarddisk();
        mb.getInfoMotherboard();
        psu.getInfoPowerSupply();
        vga.getInfoVGACard();
    }
}
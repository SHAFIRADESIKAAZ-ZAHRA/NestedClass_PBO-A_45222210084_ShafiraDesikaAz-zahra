package Operasi;

import java.text.NumberFormat;
import java.util.Locale;
public class CPU {
    private double harga;
    private String merek;

    public CPU(double harga, String merek) {
        this.harga = harga;
        this.merek = merek;
    }
    public class Processor {
        int cores;
        String manufacturer;
        String name;

        Processor(int cores, String manufacturer, String name) {
            this.cores = cores;
            this.manufacturer = manufacturer;
            this.name = name;
        }

        public void getProcessorInfo() {
            System.out.println("Jumlah core: " + this.cores);
            System.out.println("Pabrik: " + this.manufacturer);
            System.out.println("Processor: " + this.name);
        }
    }

    public class RAM {
        int jumlahRAM;
        String manufacturer;

        RAM(int jumlahRAM, String manufacturer) {
            this.jumlahRAM = jumlahRAM;
            this.manufacturer = manufacturer;
        }

        public void getInfoRAM() {
            System.out.println("Jumlah RAM: " + this.jumlahRAM);
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }

    public void getCPUInfo() {
        Locale localeID = new Locale("in", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);
        System.out.println("Komputer Merek: " + this.merek);
        System.out.println("Harga: " + formatRupiah.format(this.harga));
    }

    public class Harddisk {
        String type;
        int capacity;

        Harddisk(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }

        public void getInfoHarddisk() {
            System.out.println("Tipe Harddisk: " + this.type);
            System.out.println("Kapasitas Harddisk: " + this.capacity + " GB");
        }
    }

    public class Motherboard {
        String chipset;
        String model;

        Motherboard(String chipset, String model) {
            this.chipset = chipset;
            this.model = model;
        }

        public void getInfoMotherboard() {
            System.out.println("Chipset Motherboard: " + this.chipset);
            System.out.println("Model Motherboard: " + this.model);
        }
    }

    public class PowerSupply {
        String brand;
        int wattage;
        PowerSupply(String brand, int wattage) {
            this.brand = brand;
            this.wattage = wattage;
        }
        public void getInfoPowerSupply() {
            System.out.println("Merek Power Supply: " + this.brand);
            System.out.println("Wattage Power Supply: " + this.wattage + " Watt");
        }
    }

    public class VGACard {
        String brand;
        String series;
        VGACard(String brand, String series) {
            this.brand = brand;
            this.series = series;
        }
        public void getInfoVGACard() {
            System.out.println("Merek VGA Card: " + this.brand);
            System.out.println("Series VGA Card: " + this.series);
        }
    }
}
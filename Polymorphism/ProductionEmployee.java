import java.util.Date;

public class ProductionEmployee extends Employee {
    private double wagePerItem;
    private int itemsProduced;

    public ProductionEmployee(String name, String noKTP, double wagePerItem, int itemsProduced, Date birthDate) {
        super(name, noKTP, birthDate);
        setWagePerItem(wagePerItem);
        setItemsProduced(itemsProduced);
    }

    public void setWagePerItem(double wagePerItem) {
        this.wagePerItem = wagePerItem;
    }

    public double getWagePerItem() {
        return wagePerItem;
    }

    public void setItemsProduced(int itemsProduced) {
        this.itemsProduced = itemsProduced;
    }

    public int getItemsProduced() {
        return itemsProduced;
    }

    public double earnings() {
        return getWagePerItem() * getItemsProduced();
    }

    public String toString() {
        return String.format("Karyawan produksi:\n%s\nUpah per Barang: %.2f\nJumlah Barang Diproduksi: %d",
                super.toString(), getWagePerItem(), getItemsProduced());
    }
}
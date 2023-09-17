public class NumberConverter {

    private int decimalNumber;
    private String binaryNumber;
    private String hexNumber;

    // Setter
    public void setDecimalNumber(int decimalNumber) {
        this.decimalNumber = decimalNumber;
        this.binaryNumber = Integer.toBinaryString(decimalNumber);
        this.hexNumber = Integer.toHexString(decimalNumber).toUpperCase();
    }

    public void setBinaryNumber(String binaryNumber) {
        this.binaryNumber = binaryNumber;
        this.decimalNumber = Integer.parseInt(binaryNumber, 2);
        this.hexNumber = Integer.toHexString(this.decimalNumber).toUpperCase();
    }

    public void setHexNumber(String hexNumber) {
        this.hexNumber = hexNumber.toUpperCase();
        this.decimalNumber = Integer.parseInt(hexNumber, 16);
        this.binaryNumber = Integer.toBinaryString(this.decimalNumber);
    }

    // Getter
    public int getDecimalFromBinary() {
        return Integer.parseInt(binaryNumber, 2);
    }

    public int getDecimalFromHex() {
        return Integer.parseInt(hexNumber, 16);
    }

    public String getBinaryFromDecimal() {
        return Integer.toBinaryString(decimalNumber);
    }

    public String getBinaryFromHex() {
        return Integer.toBinaryString(getDecimalFromHex());
    }

    public String getHexFromDecimal() {
        return Integer.toHexString(decimalNumber).toUpperCase();
    }

    public String getHexFromBinary() {
        return Integer.toHexString(getDecimalFromBinary()).toUpperCase();
    }

}

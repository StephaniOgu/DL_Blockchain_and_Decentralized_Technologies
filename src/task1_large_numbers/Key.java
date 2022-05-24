package task1_large_numbers;

import java.math.BigInteger;

public class Key {
    int bitLength;
    static String value;

    Key(int length) {
        this.bitLength = length;
        value = getRandomValue();
    }

    private String getRandomValue() {
        StringBuilder value = new StringBuilder();
        int temBitLength = this.bitLength;
        while (temBitLength > 0) {
            int random_int = (int) Math.floor(Math.random() * (1 + 1) + 0);
            value.append(random_int);
            --temBitLength;
        }
        BigInteger decimalValue = new BigInteger(String.valueOf(value), 2);
        return decimalValue.toString(16);
    }

    public BigInteger getRange() {
        return getTwoBinaryMaxValue().add(new BigInteger("1"));
    }

    private BigInteger getTwoBinaryMaxValue() {
        StringBuilder twoBinaryMaxValue = new StringBuilder();
        while (bitLength > 0) {
            twoBinaryMaxValue.append("1");
            --bitLength;
        }
        return new BigInteger(twoBinaryMaxValue.toString(), 2);
    }

    public long getBruteforceTime() {
        long startTime = System.nanoTime();
        System.out.println(value);
        for (BigInteger a = BigInteger.ZERO; a.compareTo(new BigInteger(this.value, 16)) < 0; a = a.add(new BigInteger("1"))) ;
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}

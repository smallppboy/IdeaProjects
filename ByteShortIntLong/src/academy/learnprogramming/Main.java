package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myValue = 1000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer  Minimum Value = " + myMinIntValue);
        System.out.println("Integer  Maximum Value = " + myMaxIntValue);
        System.out.println("Busted  Max Value = " + (myMaxIntValue + 1));
        System.out.println("Busted  Min Value = " + (myMinIntValue - 1));

        int maxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte  Minimum Value = " + myMinByteValue);
        System.out.println("Byte  Maximum Value = " + myMaxByteValue);

        short myMinshortValue = Short.MIN_VALUE;
        short myMaxshortValue = Short.MAX_VALUE;
        System.out.println("Short  Minimum Value = " + myMinshortValue);
        System.out.println("Short  Maximum Value = " + myMaxshortValue);

        long myMinlongValue = Long.MIN_VALUE;
        long myMaxlongValue = Long.MAX_VALUE;
        System.out.println("Long  Minimum Value = " + myMinlongValue);
        System.out.println("Long  Maximum Value = " + myMaxlongValue);

        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;
        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinshortValue / 2);
    }
}

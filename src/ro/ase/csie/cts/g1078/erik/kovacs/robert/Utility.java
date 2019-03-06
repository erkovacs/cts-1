package ro.ase.csie.cts.g1078.erik.kovacs.robert;

public class Utility {

    static public double getValueFromObject(Object value) {
        double receivedValue = 0;
        if(value instanceof Double)
            receivedValue = (Double)value;
        else
            throw new UnsupportedOperationException("Wrong type");
        return receivedValue;
    }

    static public String getRandomString(int n) {
        // Template string
        String chars = "0123456789abcdefghijklmnopqrstuvxyz";

        // create StringBuilder length of n
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            // generate a random number between 0 and n
            int index = (int) (chars.length() * Math.random());

            // add Character one by one to end of sb
            sb.append(chars.charAt(index));
        }
        return sb.toString();
    }
}
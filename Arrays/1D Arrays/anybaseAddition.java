public class anybaseAddition {
    public static int getSum(int n1, int n2, int base) {
        int carry = 0;
        int result = 0;
        int multiplier = 1;

        while (n1 > 0 || n2 > 0 || carry > 0) {
            int digit1 = n1 % 10;
            int digit2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;

            int sum = digit1 + digit2 + carry;

            carry = sum / base;
            sum = sum % base;

            result += sum * multiplier;

            multiplier *= 10;

        }

        return result;
    }
}

class Codechef {
    public static void main(String[] args) {
        // Total bill amount
        int totalBill = 500;

        // Amount paid by customer
        int amountPaid = 450;

        // Using the Not Equal To (!=) operator in a boolean expression
        boolean isPaymentIncomplete = (amountPaid != totalBill);

        // Printing the result directly
        System.out.println("Payment incomplete: " + isPaymentIncomplete);

        // Another case where the customer pays the full amount
        amountPaid = 500;

        isPaymentIncomplete = (amountPaid != totalBill);
        System.out.println("Payment incomplete: " + isPaymentIncomplete);
    }
}
package book;

public class ObjectOrientedDemo {
    public static void main(String[] args) throws InterruptedException {
        Staff staff = new Staff("Peter");
        staff.setHoursWorked(160);
        int pay = staff.calculatePay(1000, 400);
        Thread.sleep(700);
        System.out.println("Pay = "+ pay);

        Thread.sleep(1500);

        Staff staff2 = new Staff("Jhonny", "Vegas");
        staff2.setHoursWorked(150);
        int pay2 = staff2.calculatePay();
        Thread.sleep(900);
        System.out.println("Pay= "+pay2);

        Thread.sleep(3000);
        System.out.println("\n\n Updating Jhonny Hours Worked to -10");
        staff2.setHoursWorked(-10);
        System.out.println("\nHours Worked = " + staff2.getHoursWorked());
        pay2 = staff2.calculatePay();
        System.out.println("Pay = "+ pay2);
    }
}

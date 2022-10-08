import org.junit.Assert;
import org.junit.Test;

// Các test case được sinh bởi phương pháp bảng quyết định

public class CalculateBillTest_2 {
    @Test
    public void calculateBill_Test1() {
        final int expected = -1;
        final int actual = CalculateBill.calculateBill(0, "Sinh hoạt");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateBill_Test2() {
        final int expected = 73440;
        final int actual = CalculateBill.calculateBill(40, "Sinh hoạt");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateBill_Test3() {
        final int expected = 156600;
        final int actual = CalculateBill.calculateBill(80, "Sinh hoạt");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateBill_Test4() {
        final int expected = 361800;
        final int actual = CalculateBill.calculateBill(160, "Sinh hoạt");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateBill_Test5() {
        final int expected = 590760;
        final int actual = CalculateBill.calculateBill(240, "Sinh hoạt");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateBill_Test6() {
        final int expected = -1;
        final int actual = CalculateBill.calculateBill(0, "Kinh doanh");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateBill_Test7() {
        final int expected = 87480;
        final int actual = CalculateBill.calculateBill(30, "Kinh doanh");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateBill_Test8() {
        final int expected = 233280;
        final int actual = CalculateBill.calculateBill(80, "Kinh doanh");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateBill_Test9() {
        final int expected = 524880;
        final int actual = CalculateBill.calculateBill(180, "Kinh doanh");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateBill_Test10() {
        final int expected = 729000;
        final int actual = CalculateBill.calculateBill(250, "Kinh doanh");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateBill_Test11() {
        final int expected = -1;
        final int actual = CalculateBill.calculateBill(-20, "Sản xuất");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateBill_Test12() {
        final int expected = 91800;
        final int actual = CalculateBill.calculateBill(50, "Sản xuất");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateBill_Test13() {
        final int expected = 165240;
        final int actual = CalculateBill.calculateBill(90, "Sản xuất");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateBill_Test14() {
        final int expected = 257040;
        final int actual = CalculateBill.calculateBill(140, "Sản xuất");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateBill_Test15() {
        final int expected = 403920;
        final int actual = CalculateBill.calculateBill(220, "Sản xuất");

        Assert.assertEquals(expected, actual);
    }
}

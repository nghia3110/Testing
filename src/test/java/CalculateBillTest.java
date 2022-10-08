import org.junit.Assert;
import org.junit.Test;

// Các test case được sinh bởi phương pháp phân hoạch tương đương
public class CalculateBillTest {

    @Test
    public void calculateBill_Test1() {
        final int expected = 55080;
        final int actual = CalculateBill.calculateBill(30, "Sinh hoạt");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateBill_Test2() {
        final int expected = 135000;
        final int actual = CalculateBill.calculateBill(70, "Sinh hoạt");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateBill_Test3() {
        final int expected = 334800;
        final int actual = CalculateBill.calculateBill(150, "Sinh hoạt");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateBill_Test4() {
        final int expected = 500040;
        final int actual = CalculateBill.calculateBill(210, "Sinh hoạt");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateBill_Test5() {
        final int expected = 116640;
        final int actual = CalculateBill.calculateBill(40, "Kinh doanh");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateBill_Test6() {
        final int expected = 233280;
        final int actual = CalculateBill.calculateBill(80, "Kinh doanh");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateBill_Test7() {
        final int expected = 466560;
        final int actual = CalculateBill.calculateBill(160, "Kinh doanh");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateBill_Test8() {
        final int expected = 699840;
        final int actual = CalculateBill.calculateBill(240, "Kinh doanh");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateBill_Test9() {
        final int expected = 73440;
        final int actual = CalculateBill.calculateBill(40, "Sản xuất");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateBill_Test10() {
        final int expected = 110160;
        final int actual = CalculateBill.calculateBill(60, "Sản xuất");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateBill_Test11() {
        final int expected = 330480;
        final int actual = CalculateBill.calculateBill(180, "Sản xuất");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateBill_Test12() {
        final int expected = 459000;
        final int actual = CalculateBill.calculateBill(250, "Sản xuất");

        Assert.assertEquals(expected, actual);
    }
}

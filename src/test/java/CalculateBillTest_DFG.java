import org.junit.Assert;
import org.junit.Test;

// Các ca kiểm thử được sinh ra từ các đường đi với độ phủ All-c-use/some-p-use

public class CalculateBillTest_DFG {
    @Test
    public void calculateBill_Test1() {
        final int expected = 91800;
        final int actual = CalculateBill.calculateBill(50, "Sinh hoạt");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateBill_Test2() {
        final int expected = 178200;
        final int actual = CalculateBill.calculateBill(90, "Sinh hoạt");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateBill_Test3() {
        final int expected = 388800;
        final int actual = CalculateBill.calculateBill(170, "Sinh hoạt");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateBill_Test4() {
        final int expected = 621000;
        final int actual = CalculateBill.calculateBill(250, "Sinh hoạt");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateBill_Test5() {
        final int expected = 291600;
        final int actual = CalculateBill.calculateBill(100, "Kinh doanh");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateBill_Test6() {
        final int expected = 257040;
        final int actual = CalculateBill.calculateBill(140, "Sản xuất");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateBill_Test7() {
        final int expected = -1;
        final int actual = CalculateBill.calculateBill(200, "Cơ quan hành chính");

        Assert.assertEquals(expected, actual);
    }
}

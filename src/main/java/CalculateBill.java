public class CalculateBill {
    public static int calculateBill(int x, String t) {
        double res = 0;
        if(x < 1) return -1;
        switch (t){
            case "Sinh hoạt":
                if(x <= 50) {
                    res = x * 1700 * 1.08;
                } else if(x <= 100) {
                    res = (50 * 1700 + (x - 50) * 2000) * 1.08;
                } else if (x <= 200) {
                    res = (50 * 1700 + 50 * 2000 + (x - 100) * 2500) * 1.08;
                }else{
                    res = (50 * 1700 + 50 * 2000 + 100 * 2500 + (x - 200) * 2800) * 1.08;
                }
                break;
            case "Kinh doanh":
                res = x * 2700 * 1.08;
                break;
            case "Sản xuất":
                res = x * 1700 * 1.08;
                break;
            default:
                res = -1;
                break;
        }
        return (int) res;
    }

    public static void main(String[] args) {
        int x = 73440;

        System.out.println(calculateBill(40, "Sinh hoạt") == x);
    }
}

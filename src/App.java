public class App {
    public static void main(String[] args) throws Exception {
        
        Frazione f = new Frazione(2,3);
        Frazione f1 = new Frazione(4,8);
        Frazione f2 = new Frazione(3,5);

        Frazione sum = f.add(f1);
        Frazione mul = f.multiply(f2);
        Frazione div = f.divide(f2);
        Frazione sub = f2.subtract(f1);

        System.out.println(sum);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(sub);

    }
}

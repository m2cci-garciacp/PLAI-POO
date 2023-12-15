public class AppRationals {
    public static void main(String[] args) {
        Rational rational = new Rational(2, 3);

        System.out.println(rational.getNum() + "/" + rational.getDen());
        System.out.println(rational.toString());

        Rational rational2 = new Rational(-4, 6);
        if (rational.equalTo(rational2)) {
            System.out.println(rational.toString() + "=" + rational2.toString());
        } else {
            System.out.println(rational.toString() + "!=" + rational2.toString());
        }

        rational2.setNum(3);
        rational2.setDen(3);
        if (rational.equalTo(rational2)) {
            System.out.println(rational.toString() + "=" + rational2.toString());
        } else {
            System.out.println(rational.toString() + "!=" + rational2.toString());
        }

        rational2.setNum(4);
        rational2.setDen(6);
        if (rational.equalTo(rational2)) {
            System.out.println(rational.toString() + "=" + rational2.toString());
        } else {
            System.out.println(rational.toString() + "!=" + rational2.toString());
        }

        rational2.setNum(-4);
        rational2.setDen(6);
        if (rational.equalTo(rational2)) {
            System.out.println(rational.toString() + "=" + rational2.toString());
        } else {
            System.out.println(rational.toString() + "!=" + rational2.toString());
        }

        rational2.setNum(-4);
        rational2.setDen(-6);
        if (rational.equalTo(rational2)) {
            System.out.println(rational.toString() + "=" + rational2.toString());
        } else {
            System.out.println(rational.toString() + "!=" + rational2.toString());
        }

        System.out.println("----------------\nSum");
        rational2.setNum(4);
        rational2.setDen(-2);
        System.out.print(rational.toString() + " + " + rational2.toString());
        rational.sum(rational2);
        System.out.println("=" + rational.toString());
        rational2.setNum(1);
        rational2.setDen(3);
        System.out.print(rational.toString() + " + " + rational2.toString());
        rational.sum(rational2);
        System.out.println("=" + rational.toString());

        System.out.println("----------------\nMult");
        rational2.setNum(4);
        rational2.setDen(-2);
        System.out.print(rational.toString() + " * " + rational2.toString());
        rational.mult(rational2);
        System.out.println("=" + rational.toString());

        System.out.println("----------------\nMult");
        rational2.setNum(4);
        rational2.setDen(-2);
        System.out.print(rational.toString() + " * " + rational2.toString());
        rational.mult(rational2);
        System.out.println("=" + rational.toString());

        System.out.println("----------------\nPGCD");
        rational.setNum(42);
        rational.setDen(368);
        rational2.setNum(42);
        rational2.setDen(42);
        rational.reduce();
        rational2.reduce2();
        System.out.println(rational.toString());
        System.out.println(rational2.toString());
    }
}

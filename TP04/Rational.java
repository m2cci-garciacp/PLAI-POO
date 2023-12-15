
public class Rational {

    private int num = 0;
    private int den = 1;

    public Rational(int num, int den) {
        this.num = num;
        this.den = den;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
        this.reduce();
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        if (den == 0)
            throw new IllegalArgumentException("Dénominateur nul");
        this.den = den;
        this.reduce();
    }

    public String toString() {
        return num + "/" + den;
    }

    public void reduce() {
        if (den < 0) {
            num = -num;
            den = -den;
        }
        for (int i = 2; i <= Math.max(num, den); i++) {
            if (num % i == 0 && den % i == 0) {
                num /= i;
                den /= i;
                i--;
            }
        }
    }

    public void reduce2() {
        if (den < 0) {
            num = -num;
            den = -den;
        }
        int diviseur = pgcd(num, den);
        num /= diviseur;
        den /= diviseur;
    }

    public Rational reduceTo() {
        Rational r = new Rational(num, den);
        return r;
    }

    public boolean equalTo(Rational r) {
        return this.num == r.num && this.den == r.den;
    }

    public void sum(Rational r) {
        this.num = this.num * r.den + this.den * r.num;
        this.den = this.den * r.den;
        this.reduce();
    }

    public void subs(Rational r) {
        this.num = this.num * r.den - this.den * r.num;
        this.den = this.den * r.den;
        this.reduce();
    }

    public void mult(Rational r) {
        this.num = this.num * r.num;
        this.den = this.den * r.den;
        this.reduce();
    }

    public void div(Rational r) {
        this.num = this.num * r.den;
        this.den = this.den * r.num;
        this.reduce();
    }

    private int pgcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return pgcd(b, a % b);
        }
    }

}
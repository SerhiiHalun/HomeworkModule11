package Task4;

public class RandomAlgorithm {
    private  long a,c,m;

    public RandomAlgorithm(long a, long c, long m) {
        this.a = a;
        this.c = c;
        this.m = m;
    }
    public  long next(long n){

        return (a*n+c)%m;
    }
}

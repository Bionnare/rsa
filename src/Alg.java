import java.math.BigInteger;
import java.util.Scanner;

public class Alg {
    public static void main(String[] args) {

        long m = 19;
        int p = 0, q = 0;
        int n, fi;
        int e = 0;
        int d = 0;
        long c = 0;
        boolean pbool = false, qbool = false, ebool = false;
        Scanner scanner = new Scanner(System.in);


        while (!pbool) {
            System.out.print("??????? ??????? ????? P : ");
            p = scanner.nextInt();

            pbool = true;
            for (int a = 2; a < p; a++) { // ??????? ????? ??? ???
                if (p % a == 0) {
                    System.out.println("??????!");
                    pbool = false;
                    break;
                }
            }
        }

        while(!qbool) {
            System.out.print("??????? ??????? ????? Q : ");
            q = scanner.nextInt();

            qbool = true;
            for (int a = 2; a < q; a++) { // ??????? ????? ??? ???
                if (q % a == 0) {
                    System.out.println("??????!");
                    qbool = false;
                    break;
                }
            }
        }


        n = p * q;
        fi = (p-1)*(q-1);

        while(!ebool) {
            double z = 2 + Math.random() * 8; //double z = 2 + Math.random() * (fi - 2);
            e = (int) z;
            ebool = true;
            for (int a = 2; a <= e; a++) {
                if (e % a == 0) {
                    if (fi % a == 0) {
                        ebool = false;
                        break;
                    }
                }
            }
        }

        for(int o = 2; ; o++){
            if ((o * e) % fi == 1){
                d = o;
                break;
            }
        }

        //e = 5;
        //d = 17;

        System.out.println("???????? ???? - (" + e + ", " + n + ")");
        System.out.println("???????? ???? - (" + d + ", " + n + ")");


        c = pow(m, e, n);
        //long x = (long) Math.pow(m, e);
        //System.out.println("x = " + x);
        //c = x % n;
        System.out.println("????????????? ????????? = " + c);

        m = pow(c, d, n);
        //long y = (long) Math.pow(c, d);
        //System.out.println("y = " + y);
        //m = y % n;
        System.out.println("?????????????? ????????? = " + m);


    }

    public static long pow(long m, int e, long mod){

        long x = m;
        for(int i =0; i< e-1; i++){

            x = (x*m)%mod;

        }
        System.out.println("x = " + x);
        return x;
    }
}
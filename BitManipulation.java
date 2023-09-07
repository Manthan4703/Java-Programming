public class BitManipulation {

    public static void oddOrEven(int n){
        int bitmask = 1;
        if((n & bitmask)==0){
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }
    }

    public static int getIthBit(int n, int i){
        int bitmask = 1<<i;
        if((n&bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static int setIthBit(int n, int i){
        int bitmask = 1<<i;
        return n|bitmask;
    }

    public static int clearIthBit(int n, int i){
        int bitmask = ~(1<<i);
        return n&bitmask;
    }

    public static int updateIthBit(int n, int i, int newBit){
        // if(newBit==0){
        //     clearIthBit(n, i);
        // }
        // else{
        //     setIthBit(n, i);
        // }

        n = clearIthBit(n, i);
        int bitMask = newBit<<i;
        return n|bitMask;
    }

    public static int clearLastIBits(int n, int i){
        int bitMask = (~0)<<i;
        return n & bitMask;        
    }
    public static int clearIToJBits(int n, int i, int j){
        int a = (-1)<<(j+1);
        int b = (1<<i)-1;

        int bitMask = a|b;
        return n & bitMask;
    }

    public static boolean isPowerOfTwo(int n){
        return (n&(n-1)) == 0;
    }

    public static int countSetBits(int n){
        int count = 0;
        while(n!=0){
            if((n&1) == 1){
                count++;
            }
            n=n>>1;
        }
        return count;
    }

    public static int fastExpo(int a, int n){
        int ans = 1;

        while(n>0){
            if((n&1) != 0){    //checking LSB
                ans *=a ;                
            }
            a*=a;
            n = n>>1;
        }

        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fastExpo(8, 3));      
    }
}

//import java.util.Arrays;

public class task_14 {
    public static void main(String[] args) {
        int [] s = {2,5,1,8,4,3,6};
        for (int i = s.length - 1; i>0; i--){
            for (int j=0; j<i; j++){
                if (s[j] > s [j+1]) {
                    int x = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = x;
                }
            }
        }
       // System.out.println(Arrays.toString(s));

    }
}

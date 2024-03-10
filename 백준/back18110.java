import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class back18110 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result=0;

        int testCase=Integer.parseInt(br.readLine());
        ArrayList<Integer> level = new ArrayList<>();
        for(int i=0;i<testCase;i++){
            level.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(level);

        int cut = (int)Math.round(testCase*0.15);
        for(int i=cut; i<testCase-cut;i++){
            result+=level.get(i);
        }
        result=(int)Math.round((double)result/(testCase-cut*2));
        System.out.println(result);
    }
}

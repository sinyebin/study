package 백준;
import java.util.*;
public class back11279 {
    static ArrayList <Integer> heap;
    public static void insert(int val){
        heap.add(val);
        int p=heap.size()-1;
        while(p>1&&heap.get(p/2)<heap.get(p)){
            int tmp=heap.get(p/2);
            heap.set(p/2,val);
            heap.set(p,tmp);
            p/=2;
        }
    }
    public static int delete(){
        if(heap.size()-1<1){
            return 0;
        }
        int deleteitem=heap.get(1);
        heap.set(1,heap.get(heap.size()-1));
        heap.remove(heap.size()-1);
        int pos=1;
        while((pos*2)<heap.size()){
            int max=heap.get(pos*2);
            int maxPos=pos*2;
            if(((pos*2+1)<heap.size())&&max<heap.get(pos*2+1)){
                max=heap.get(pos*2+1);
                maxPos=pos*2+1;
            }
            if(max<heap.get(pos)){
                break;
            }
            int tmp=heap.get(pos);
            heap.set(pos,heap.get(maxPos));
            heap.set(maxPos,tmp);
            pos=maxPos;
        }
        return deleteitem;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        heap=new ArrayList<>();
        heap.add(0);
        int num=scanner.nextInt();
        heap=new ArrayList<>();
        heap.add(0);
        for(int i=0;i<num;i++){
            int val=scanner.nextInt();
            if(val==0){
                System.out.println(delete());
            }else{
                insert(val);
            }
        }
    }
}

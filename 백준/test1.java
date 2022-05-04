public class test1 {
    public static void main(String args[]){
        int A=53;
        int B= 1953;
        int answer=solution(A,B);
    }
    public static int solution(int A, int B) {
        int answer=-1;
        char[] arr1=(""+A).toCharArray();
        char[] arr2=(""+B).toCharArray();
        boolean check=true;
        for(int i=0;i<arr2.length-arr1.length+1;i++){
            check=true;
            int k=i;
            for(int j=0;j<arr1.length;j++){
                if(arr1[j]==arr2[k]){
                    k++;
                }else{
                    check=false;
                    break;
                }
            }
            if(check){
                answer=i;
                break;
            }
        }
        return answer;
    }
}

package 프로그래머스;

public class keypad {
    public static void main(String args[]){
        int[]numbers={1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand="right";
        solution(numbers,hand);
    }
    static String solution(int[] numbers, String hand) {
        String answer = "";
           int l=10;
           int r=12;
           for(int i=0;i<numbers.length;i++){
               if (numbers[i]==0){
                   numbers[i]=11;
               }
               if(numbers[i]==1||numbers[i]==4||numbers[i]==7){
                   answer+='L';
                   l=numbers[i];
               }else if(numbers[i]==3||numbers[i]==6||numbers[i]==9){
                   answer+='R';
                   r=numbers[i];
               }else{
                   int num1=0;
                   int num2=0;
                   int l1=l;
                   int r1=r;
                   if(l1%3==1){
                       l1+=1;
                       num1++;
                   }
                   if(r1%3==0){
                       r1-=1;
                       num2++;
                   }
                   
                   if(numbers[i]==2||numbers[i]==5||numbers[i]==8||numbers[i]==11){
                       
                       while(l1!=numbers[i]){
                           if(l1>numbers[i]){
                               l1-=3;
                               num1++;
                           }else{
                               l1+=3;
                               num1++;
                           }
                       }           
                                                  
                       for(int j=0;j<4;j++){
=                           if(r1==numbers[i]){
                               break;
                           }else{
                               if(r1>numbers[i]){
                                   r1-=3;
                                   num2++;
                               }else{
                                   r1+=3;
                                   num2++;
                               }
                                
                           }
                       }    
                      
                   }
                   if(num1>num2){
                       r=r1;
                       answer+='R';
                   }else if(num2>num1){
                       l=l1;
                       answer+='L';
                   }else if(hand.equals("right")){
                       r=r1;
                       answer+="R";
                   }else if(hand.equals("left")){
                       l=l1;
                       answer+='L';
                   }
               }
           }
           return answer;
       }
}

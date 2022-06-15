package 백준;
import java.util.*;
public class back4949 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Stack <String>stack=new Stack<>();
        while(true){
            String str=scanner.nextLine();
            stack.clear();
            if(str.equals(".")){
                break;
            }
            boolean check=true;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='('){
                    stack.push("(");
                }else if(str.charAt(i)==')'){
                    if(!stack.empty()){
                        if(stack.peek().equals("(")){
                            stack.pop();
                        }else{
                            check=false;
                            break;
                        }
                    }else{
                        check=false;
                        break;
                    }
                }else if(str.charAt(i)=='['){
                    stack.push("[");
                }else if(str.charAt(i)==']'){
                    if(!stack.empty()){
                        if(stack.peek().equals("[")){
                            stack.pop();
                        }else{
                            check=false;
                            break;
                        }
                    }else{
                        check=false;
                        break;
                    }
                }
            }
            if(check){
                if(!stack.empty()){
                    System.out.println("no");
                }else{
                    System.out.println("yes");
                }               
            }else{
                System.out.println("no");
            }
        }
        
    }
}

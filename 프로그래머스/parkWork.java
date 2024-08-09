public class parkWork {
    public static void main(String[] args) {
        String [] park={"OSO", "OOO", "OXO", "OOO"};
        String [] routes={"E 2","S 3","W 1"};
        solution(park, routes);
    }
    public static int[] solution(String[] park, String[] routes) {
        int x=-1;
        int y=-1;
    
        char parkArray[][]= new char[park.length][park[0].length()];
        for(int i=0;i<park.length;i++){
            parkArray[i]=park[i].toCharArray();
            if(park[i].contains("S")){
                x=park[i].indexOf("S");
                y=i;
            }
        }

        for(int i=0;i<routes.length;i++){

            String way = routes[i].split(" ")[0];
            int len = Integer.parseInt(routes[i].split(" ")[1]);

            int nx = x;
            int ny = y;

            for(int j=0;j<len;j++){
                if(way.equals("E")){
                    nx++;
                }
                if(way.equals("W")){
                    nx--;
                }
                if(way.equals("S")){
                    ny++;
                }
                if(way.equals("N")){
                    ny--;
                }
                
                if(nx>=0 &&ny>=0 && ny<parkArray.length&&nx<parkArray[0].length){
                    if(parkArray[ny][nx]=='X'){
                        break;
                    }
                    if(j==len-1){
                        x=nx;
                        y=ny;
                    }
                }
            }
        }
        int[] answer = {y,x};
        return answer;
    }
}

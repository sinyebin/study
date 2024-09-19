package 프로그래머스;

public class skillTree {
    public static void main(String[] args) {
        String skill = "CBD";
        String []skill_trees={"BACDE", "CBADF", "AECB", "BDA"};
        solution(skill, skill_trees);
    }

    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for(String str: skill_trees){
            answer += checkValid(skill, str)?1:0;
        }
        return answer;
    }

    public static boolean checkValid(String skill, String str){
        int beforeSkill=0;
        for(int i=0;i<skill.length();i++){
            int index=str.indexOf(skill.charAt(i));
            if(index==-1){
                index=Integer.MAX_VALUE;
            }
            if(beforeSkill>index){
                return false;
            }
            beforeSkill=index;
        }
        return true;
    }
}

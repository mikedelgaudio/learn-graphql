import java.io.*;


/**
 * toolkit
 */
public class toolkit {

    public static int steps(String[] toolList, int startingPos, int count, String dest) {
        
        // int pos = 1;
        // int neg = 1;

        // for(int i = 0; i < toolList.length; i++){
        //     if(toolList[i] == dest){
        //         break;
        //     }
        //     pos++;
        // }

        // for(int j = toolList.length - 1; j >= 0; j--){

        //     if(toolList[j] == dest){
        //         break;
        //     }
        //     neg++;
        // }

        // return Math.min(pos, neg);

        // base cases
        // if (Math.abs(startingPos) > l)
        //     return Integer.MAX_VALUE;
     
        if (dest == toolList[startingPos])
            return count;
 
        // at each point we can go either way
 
        // if we go on positive side
        int pos = steps(toolList, startingPos + count + 1,
                        count + 1, dest);
 
        // if we go on negative side
        int neg = steps(toolList, startingPos - count - 1,
                        count + 1, dest);
 
        // minimum of both cases
        return Math.min(pos, neg);
    }
    public static void main(String[] args) {
        String[] lis = {"v", "g", "s", "d" };
        String tool = "s";
        System.out.println("Number of moves required to reach " + tool +": " + steps(lis, 1, 1, tool));
    }
}


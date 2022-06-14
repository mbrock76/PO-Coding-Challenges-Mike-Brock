
import java.util.*;
import java.util.stream.Collectors;

public class Main
{
    public static void printMedian(String[] lines){
        
        ArrayList<Integer> temp = new ArrayList<Integer>();
        //stream.map.collect not working, have to do it the hard way 
        for(String each:lines){
            String[] myarr = each.split("[^0-9]");
            for(String mychar:myarr){
                temp.add(Integer.parseInt(mychar));
            }
        }
        Collections.sort(temp);
        
        double median = 0.0;
        if(temp.size() % 2 == 0){

            median = ((double)temp.get((temp.size()/2)-1) + (double)temp.get(temp.size()/2))/2;
        }else{
            
            median = temp.get((int)temp.size()/2);
        }
        
        System.out.println(median);
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter one line of data for each array, where the numbers are separated by a non-number:");
        
        String[] lines = new String[2];
        int i = 0;
        while(i < 2){
            lines[i] = sc.nextLine();
            i++;
        }
        
        sc.close ();

        printMedian(lines);
        
    }
}

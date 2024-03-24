package PTA;
import java.util.*;
import java.io.*;
public class test06{
    public static void main(String[]args){
        QuickInput sc = new QuickInput();
        PrintWriter out = new PrintWriter(System.out);
        
        HashMap<String,String> map = new HashMap<>();
        int T = sc.nextInt();
        sc.nextLine();
        while (T-->0){
            String s1 = sc.nextLine();
            String ss[] =s1.split(" ");
            map.put(ss[1],ss[0]+"_"+ss[2]);
            
        }

        int n = sc.nextInt();
        for (int i = 0;i<n;i++){
            int t1 = sc.nextInt();
            String s1 = map.get(String.valueOf(t1)); // Convert t1 to a string
            String []q = s1.split("_");
              out.println(q[0]+" "+q[1]);




              
            
        }

         out.close();
        
        
    }
}

class  QuickInput
{
    BufferedReader buf;
    StringTokenizer tok;
     QuickInput(){
        buf = new BufferedReader(new InputStreamReader(System.in));
    }
    boolean hasNext(){
        while(tok == null || !tok.hasMoreElements()){
            try{
                tok = new StringTokenizer(buf.readLine());
            }catch(Exception e){
                return false;
            }
        }
        return true;
    }
    String next(){
        if(hasNext()) return tok.nextToken();
        return null;
    }
    int nextInt(){
        return Integer.parseInt(next());
    }
    long nextLong(){
        return Long.parseLong(next());
    }
    double nextDouble(){
        return Double.parseDouble(next());
    }

       String nextLine() {
        try {
            return buf.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}

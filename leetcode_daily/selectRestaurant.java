package leetcode_daily;
import java.util.*;


public class selectRestaurant {
    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        class Node{
            int id;
            int rating;
            int veganFriendly;
            int price;
            int distance;
            public Node(int i,int r,int v,int p,int d ){
                id = i;
                rating = r;
                veganFriendly = v;
                price = p;
                distance = d;
            }
        }
               

        PriorityQueue<Node> pq = new PriorityQueue<>((o1,o2)->o1.rating==o2.rating?o2.id-o1.id:o2.rating-o1.rating);
        int len = restaurants.length;
        for (int i = 0;i<len;i++){  
            int[]resInfo = restaurants[i];
            int id = resInfo[0];
            int rating = resInfo[1];
            int isveganFriendly = resInfo[2];
            int price = resInfo[3];
            int distance = resInfo[4];
            
            if ((veganFriendly==0||isveganFriendly==1)&& distance<=maxDistance&& price<=maxPrice){
                Node node = new Node(id,rating,isveganFriendly,price,distance);
                pq.offer(node);
            }

            
        }
      
        List<Integer> temp = new ArrayList<>();
        while(!pq.isEmpty()){
            temp.add(pq.poll().id);
        }
     
        return temp;
    }
}

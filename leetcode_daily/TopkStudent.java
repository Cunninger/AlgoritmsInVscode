// package leetcode_daily;

// import java.util.ArrayList;
// import java.util.List;

// public class TopkStudent {
//     public List<Integer> topStudents(String[] positive_feedback, String[] negative_feedback, String[] report, int[] student_id, int k) {
//         public class Node{
//             public int Id;
//             public int score;
         
//             public Node(int i,int s){
//                 score = s;
//                 Id = i;
//             }
//         }
//         List<Integer> ans = new ArrayList<>();
//         PirorityQueue<Node> pq = new PirorityQueue<>((o1,o2)->(o1.score!=o2.score?o2.score-o1.score:o1.Id-o2.Id))

//         HashSet<String> postiveSet = new HashSet<>();
//         HashSet<String> negativeSet = new HashSet<>();
//         for (int i = 0;i<positive_feedback.length();i++){
//             postiveSet.add(positive_feedback[i]);
//         }
//         for (int i = 0;i<negative_feedback.length();i++){
//             negativeSet.add(negative_feedback[i]);
//         }

     

//         for (int i = 0;i<student_id.length;i++){
//             int pCnt = 0;
//             int nCnt = 0;
//             String reportStr = report[i];// 获得这个学生的评语
//             String []arrByNone = reportStr.split(" ");// 把评语分割为若干单个字符串
//             for (int j = 0;j<arrByNone.length;j++){
//                  if (postiveSet.contains(arrByNone[j])){
//                     pCnt++;
//                 }
//                 if (negativeSet.contains(arrByNone[j])){
//                     nCnt++;
//                 }
//             }
           



//             Node newNode = new Node(student_id[i],pCnt*3-nCnt);
//             pq.add(newNode);
//         }

//         while (k-->0){
//            ans.add(pq.poll()); 
//         }
//         return ans;
//     }
// }

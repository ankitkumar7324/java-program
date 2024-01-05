import java.util.PriorityQueue;
public class connect_N_ropes {
    public static void main(String[] args) {
        int rope[] = {4,3,2,6};
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for(int i=0;i<rope.length;i++)
            {
                pq.add(rope[i]);
            }
            int mincost = 0;
            
            while(pq.size() > 1)
            {
                int num = pq.remove();
                int num2 = pq.remove();
                mincost += (num+num2);
                pq.add(num+num2);
            }

            System.out.println(mincost);

    }    
}

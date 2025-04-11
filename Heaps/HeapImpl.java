import java.util.ArrayList;

/**
 * HeapImpl
 */
public class HeapImpl {

    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int a)
        {
            arr.add(a);

            //child index
            int x = arr.size()-1;
            int par = (x-1)/2;

            while (arr.get(x)<arr.get(par)) {
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x-1)/2;
            }
            
        }

        public int peak(){
            return arr.get(0);      
            } 

        public int remove()
        {
            int data = arr.get(0);

            //swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            // remove Last Index
            arr.remove(arr.get(arr.size()-1));

            //Call Heapify
            heapify(0);

            return data;

        }

        private void heapify(int i)
        {
            int right  = 2*i+2;
            int left = 2*i+1;
            int minInx = i;
 
            if (left < arr.size() && arr.get(left)<arr.get(minInx)) {
                minInx = left;
            }

            if (right < arr.size() && arr.get(right) < arr.get(minInx)) {
                minInx = right;
            }

            if(minInx != i) 
            {
                //swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minInx));
                arr.set(minInx,temp );


                heapify(minInx);

            }
        }

        public boolean isEmpty()
        {
            return arr.size()==0;
        }
    }

    public static void main(String[] args) {
       Heap h = new Heap();
       h.add(3);
       h.add(4);
       h.add(1);
       h.add(5);

       while (!h.isEmpty()) {
         System.out.print(h.peak()+" ");
          h.remove();
       }
    }
}

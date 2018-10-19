package chapter11;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

import static chapter6.Print.print;

public class ListIteratorion {
    public static void main(String[] args){
        List<String> pets=new ArrayList<String>();
        pets.add("aaisy.bai");
        pets.add("bave.bai");
        pets.add("caisy.ju");
        pets.add("daisy.wu");
        ListIterator<String> it=pets.listIterator();
        while(it.hasNext()){
            print(it.next()+" "+it.nextIndex()+" "+it.previousIndex());
        }
        while(it.hasPrevious()){
            print(it.previous().charAt(0));
        }

        LinkedList<Integer> l=new LinkedList<Integer>();
        l.add(11);
        l.add(26);
        l.add(35);
        l.add(47);
        print(l.getFirst());
        print(l.getLast());
        print(l.element());
        print(l.peek());
        print(l.remove());
        print(l.removeFirst());

        Stack<String> stack=new Stack<String>();
        for(String s:"my name is daisy bai".split(" ")){
            stack.push(s);
        }
        while(!stack.empty()){
            print(stack.pop());
        }

        Random random=new Random(47);
        Set<Integer> intset=new HashSet<Integer>();
        for(int i=0;i<100;i++){
            intset.add(random.nextInt(30));
        }
        Collections.addAll(intset,33,34,45,56);
        print(intset);
        print(intset.contains(33));

        Set<Integer> intset1=new HashSet<Integer>();
        Collections.addAll(intset1,44,33,45,57);
        print(intset.containsAll(intset1));

        SortedSet<Integer> set=new TreeSet<Integer>();
        for(int i=0;i<100;i++){
            set.add(random.nextInt(30));
        }
        print(set);

        Set<String> words=new TreeSet<String>();
        Map<Integer,Integer> map=new HashMap<Integer, Integer>();
        for(int i=0;i<10000;i++){
            int r=random.nextInt(20);
            Integer t=map.get(r);
            map.put(r,t==null?1:t+1);
        }
        print(map);

        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<10;i++){
            queue.offer(random.nextInt(i+10));
        }
        print(queue);
        Queue<Character> qc=new LinkedList<>();
        for(char c:"mynameisdaisybai".toCharArray()){
            qc.offer(c);
        }
        print(qc);

        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        for(int i=0;i<10;i++)
            priorityQueue.add(random.nextInt(i+10));
        print(priorityQueue);

        List<Integer> ints=Arrays.asList(12,34,56,78,9);
        priorityQueue=new PriorityQueue<Integer>(ints);
        print(priorityQueue);

        priorityQueue=new PriorityQueue<Integer>(ints.size(),Collections.reverseOrder());
        priorityQueue.addAll(ints);
        print(priorityQueue);
    }
}

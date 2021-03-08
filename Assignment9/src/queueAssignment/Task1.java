package queueAssignment;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Task1 {
//Understand Queue. Find difference between LinkedList Vs PriorityQueue, Perform CRUD operations on Queue
	public static void main(String[] args) {
	/*Queues are FIFO(First In First Out).
	 * .poll removes first element
	 * .peek shows first element without removing
	 * 	Priority Queues                         LinkedList
	 * -doesnt permit null                     -allows null
	 * -default order by natural order         -default order by insertion
	 *  
	 */
		Queue<Integer> q1 = new LinkedList<Integer>();
		q1.add(100);
		q1.add(110);
		q1.add(null);
		q1.add(null);
		q1.add(200);
		q1.add(100);
		q1.add(110);
		System.out.println("Queue LinkedList: ");
		System.out.println(q1);
		

		Queue<Integer> q2 = new PriorityQueue<Integer>();
		q2.add(100);
		q2.add(110);
		//q2.add(null);
		q2.add(200);
		q2.add(100);
		q2.add(200);
		q2.add(110);
		q2.add(200);
		q2.add(110);
		System.out.println("\n\nQueue PriorityQueue: ");
		System.out.println(q2);
		
		System.out.println("\nThe head of the queue is: " + q2.peek());
		
		System.out.println("Removing the head of queue");
		q2.poll();
		System.out.println(q2);
		
		q2.poll();
		System.out.println(q2);
		System.out.println("Current head of queue: "+ q2.peek());

	}
}

package javLabDemo;

import java.util.LinkedList;
import java.util.Scanner;

class DoublyLinkedlist<T> {
	private LinkedList<T>list=new LinkedList<>();
	
public void insertfront(T element) {
	list.addFirst(element);
}
public void insertend(T element) {
	list.addLast(element);
}
public void insertanypos(int index,T element) {
	list.add(index,element);
}
public void remove(int index) {
	list.remove(index);
}
public void display() {
	for(T element:list) {
		System.out.println(element+" ");
	}
	System.out.println();
}
}
public class DoublyLinkedList{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DoublyLinkedlist<Integer>doublyLinkedList=new DoublyLinkedlist<Integer>();
		int choice,element,index;
		boolean condition=true;
		while(condition) {
			System.out.println("Enter your choice:\n"
					+"1.Insertion At Front\n"
					+"2.Insertion At End\n"
					+"3.Insertion At Any Position\n"
					+"4.Delete\n"
					+"5.Display\n"
					+"6.Exit");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:		
				System.out.println("Enter the element:");
				element=sc.nextInt();
				doublyLinkedList.insertfront(element);
				break;		
				
			case 2:
				System.out.println("Enter the element:");
				element=sc.nextInt();
				doublyLinkedList.insertend(element);
				break;
				
			case 3:
				System.out.println("Enter the element:");
				element=sc.nextInt();
				System.out.println("Enter the position:");
				index=sc.nextInt();
				doublyLinkedList.insertanypos(index,element);
				break;
				
			case 4:
				System.out.println("Enter the position:");
				index=sc.nextInt();
				doublyLinkedList.remove(index);
				break;
				
			case 5:
				System.out.println("The elements are:");
				doublyLinkedList.display();
				break;
				
			case 6:
				condition=false;
				break;
				
			}
		}sc.close();
	}
}


import java.util.Scanner;

public class LinkedListCheck
{
	static LinkedList mon=new LinkedList();
	public static void main(String[] args){
	
		Scanner in=new Scanner(System.in);
		Scanner sc=new Scanner(System.in);
		String ch=null;
		do{
		System.out.println("Choose the no. of the action you want to perform :");
		System.out.println("1.Adding elements");
		System.out.println("2.Deleting elements");
		System.out.println("3.Displaying the Linked List");
		int choice=sc.nextInt();
		switch(choice){
		case 1:
			System.out.println("Enter -1 to stop inserting elements :");
			int i=in.nextInt();
			while(i!=-1){
				mon.add(i);
				i=in.nextInt();
			}
			System.out.println("Linked List after insertion :");
			mon.display();
			break;
		case 2:
			System.out.println("Enter the element you want to delete :");
			int r=in.nextInt();
			mon.remove(r);
			System.out.println("Linked List after deletion :");
			mon.display();
			break;
		case 3:
			System.out.println("Linked List Display :");
			mon.display();
			break;
		default:
			System.out.println("Wrong option");
			break;
		}
		System.out.println("Would you like to continue y/n");
		ch=sc.next();
		}while(ch.equalsIgnoreCase("y"));
		System.out.println("----- End of the Operations on Linked List ------");
		sc.close();
		in.close();
	}
	
}


class LinkedList 
{
	
	int data;
	LinkedList next;
	static int i=0;
	LinkedList first=null;
	LinkedList tail=null;
	LinkedList prev=null;
    public LinkedList setValues(int data,LinkedList next){
		LinkedList ll1=new LinkedList();
		ll1.data=data;
		ll1.next=next;
		return ll1;
	}
public void add(int data){
		LinkedList ll2=setValues(data,null);
		if (i==0){
			first=ll2;
			tail=ll2;
			prev=ll2;
		}
		else if (i==1){
			first.next=ll2;
			prev=first;
			tail=ll2;
		}
		else{
			prev=tail;
			tail.next=ll2;
			tail=ll2;
		}
		i++;
	}
	public void display(){
		for (LinkedList ll=first;ll!=null;ll=ll.next){
			System.out.print(ll.data+ "--> ");
		}
		System.out.println("End of the Linked List");
	}
	public void remove(int data){
		LinkedList llp=first;
		int count=0;
		if (data==first.data){
			first=first.next;
		}
		for (LinkedList ll=first;ll!=null;ll=ll.next){
			if (ll.data==data){
				llp.next=ll.next;
				count++;
			}
			else
				llp=ll;
		}
		tail=llp;
		if (count==0)
			System.out.println("Such element doesn't exist");
	}
	/*public static void main(String[] args){
		LinkedList l1=new LinkedList();
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.display();
		l1.remove(3);
		l1.display();
		
	}*/
		
}




import java.util.*;
class Node
{
	int data;
	Node next;

	Node(int d_data)
	{
		data=d_data;
		next=null;
	}

	void append(Node obj)
	{
		manipulating_Node temp=this;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=obj;
	}

	void insert(int data,int new_data)
	{
		Node temp=this;
		while(temp.data!=data)
		{
			temp=temp.next;
		}
		Node new_node=new Node(new_data);
		new_node.next=temp.next;
		temp.next=new_node;
	}

	void display()
	{
		Node temp=this;
		while(temp.next!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.print(temp.data);
	}
	void insert_beg(int data)
	{
		Node head=this;
		Node new_node=new Node(data);
		new_node.next=head;
		head=new_node;
	}
	void delete()
	{
		Node temp=this;
		boolean flag = true;

		if(temp.data == data)
		{
			while(temp.next.data == data)
			{
				temp = temp.next;
				while(temp.next != null)
				{
					flag = false;
				}
				if(flag == false)
				{
					break;
				}else{
					
				}
			}
		}
	}
} 

class SinglyLinkedList
{
		Node Nodes[]=new Node[5];
		for(int i=0;i<5;i++)
		{
			Nodes[i]=new Node(sc.nextInt());
		}
		for(int i=1;i<5;i++)
		{
			Nodes[0].append(Nodes[i]);
		}	
		Nodes[0].display();

		do{
				System.out.println("which Operation Do You Want To Perform ?");
				System.out.println("1) Inserion 2) Deletion 3) Exit");
				int op=sc.nextInt();
				if(op==1)
				{
					System.out.println("1) Inserion at Beginning 2) Inserion at Specific Data 3) Inserion at the last:");
					int ins=sc.nextInt();
					if(ins==1)
					{
						System.out.println("Enter Data of new node:");
						int data=sc.nextInt();
						Nodes[0].insert_beg(data);
					}
					else if(ins==2)
					{
						System.out.println("\nAfter which data you want to add new node ?");
						int find_data=sc.nextInt();
						Nodes[0].insert(find_data,sc.nextInt());
						System.out.println("After adding Node :");
						Nodes[0].display();
					}
					else if(ins==3)
					{
						System.out.println("Enter Data of new node:");
						Nodes[0].append(sc.nextInt());
					}
					else
					{
						System.out.println("Invalid choice");
					}
				}
			}while(op!=3);
}
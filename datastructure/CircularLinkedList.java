package datastructure;

public class CircularLinkedList

{  


    public class Node

    {  

        int data;  

        Node next;  

        public Node(int data) 

        {  

            this.data = data;  

        }  

    }   

    public Node head = null;  

    public Node tail = null;  


    public void insert(int data)

    {  


        Node newNode = new Node(data);  



        if(head == null) 

        {  

            head = newNode;  

            tail = newNode;  

            newNode.next = head;  

        }  

        else 

        {  

            tail.next = newNode;  

            tail = newNode;  

            tail.next = head;  

        }  

    }   

    public void displaylist() 

    {  

        Node current = head; 


        if(head == null)

        {  

            System.out.println("The given list is empty");  

        }  

        else 

        {  


            System.out.println("The data in the circular linked list are: ");  

             do{  


                System.out.print(" "+ current.data);  

                current = current.next;  

            }

            while(current != head);  

            System.out.println();  

        }  

    }   

    public static void main(String[] args) 

    {  


        CircularLinkedList newList = new CircularLinkedList();  


        newList.insert(1);

        newList.insert(3);

        newList.insert(5);

        newList.insert(7);

        newList.insert(9);

        newList.displaylist();  

    }  

}  
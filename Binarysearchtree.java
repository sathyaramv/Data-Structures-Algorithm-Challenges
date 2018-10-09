package algosprobs;

public class Binarysearchtree {
	
	class Node{    //Node class
		int key;
		Node left,right;
		public Node(int item) {
			key=item;
		    left=right=null;
		}
	}
   static Node root;
   Binarysearchtree(){  //constructor to declare root=0;
	   root= null;
   }
   
   void insert(int key) {
	   root=insertRec(root,key);    //call insertRec to update position of root
   }

   Node insertRec(Node root,int key){//returns the correct root 
	   if(root==null) {
		   root=new Node(key);
		   return root;
	   }
	   if(key<root.key)
	 root.left=insertRec(root.left,key);
	   else if(key> root.key)
		   root.right=insertRec(root.right,key);
	   return root;
   }
   void inorder() {
	   inorderRec(root);
   }
   void inorderRec(Node root) {//prints in order
	   if(root!= null) {
		   inorderRec(root.left);
		   System.out.println(root.key);
		   inorderRec(root.right);
	   }
   }
   
   public Node search(Node root, int key) //searches key
   {
	   if(root==null || root.key==key)
		   return root;
	   if(root.key>key)
		   return(search(root.left,key));
	   
	   return search(root.right,key); 
   }
   
   
   public static void main(String[] args) {
	   Binarysearchtree tree= new Binarysearchtree();
	   tree.insert(50); 
       tree.insert(30); 
       tree.insert(20); 
       tree.insert(40); 
       tree.insert(70); 
       tree.insert(60); 
       tree.insert(80); 
       tree.inorder(); 
       root=tree.search(root,70);
       System.out.println(root.key+"yes");
   }
   
}

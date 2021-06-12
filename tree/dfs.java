// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data=data;
        left=null;
        right=null;
    }
}
class HelloWorld {
    static Node root;
    static int res;
    static void dfs(Node root, int val)
    {
        if(root==null)
        {
            return;
        }
        val=val*10;
        val+=root.data;
        if(root.left==null  && root.right==null)
        {
            res+=val;
        }
        dfs(root.left, val);
        dfs(root.right, val);
    }
    public static void main(String[] args) {
        
        root=new Node(1);
        root.left=new Node(1);
        root.right=new Node(1);
        root.left.left=new Node(1);
        root.left.right=new Node(1);
        root.right.right=new Node(1);
        root.right.left=new Node(1);
        dfs(root, 0);
        System.out.println(res);
    }
}
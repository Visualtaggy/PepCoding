// 1. You are given a partially written BinaryTree class.
// 2. You are required to find the root of largest sub-tree which is a BST. Also, find the number of nodes in that sub-tree.
// 3. Input is managed for you. 

// Note -> Please refer the question video for clarity.

import java.io.*;
import java.util.*;

public class LargestBstSubtree {
  public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data, Node left, Node right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }

  public static class Pair {
    Node node;
    int state;

    Pair(Node node, int state) {
      this.node = node;
      this.state = state;
    }
  }

  public static Node construct(Integer[] arr) {
    Node root = new Node(arr[0], null, null);
    Pair rtp = new Pair(root, 1);

    Stack<Pair> st = new Stack<>();
    st.push(rtp);

    int idx = 0;
    while (st.size() > 0) {
      Pair top = st.peek();
      if (top.state == 1) {
        idx++;
        if (arr[idx] != null) {
          top.node.left = new Node(arr[idx], null, null);
          Pair lp = new Pair(top.node.left, 1);
          st.push(lp);
        } else {
          top.node.left = null;
        }

        top.state++;
      } else if (top.state == 2) {
        idx++;
        if (arr[idx] != null) {
          top.node.right = new Node(arr[idx], null, null);
          Pair rp = new Pair(top.node.right, 1);
          st.push(rp);
        } else {
          top.node.right = null;
        }

        top.state++;
      } else {
        st.pop();
      }
    }

    return root;
  }

  public static void display(Node node) {
    if (node == null) {
      return;
    }

    String str = "";
    str += node.left == null ? "." : node.left.data + "";
    str += " <- " + node.data + " -> ";
    str += node.right == null ? "." : node.right.data + "";
    System.out.println(str);

    display(node.left);
    display(node.right);
  }
  
  //creating custom class 
  public static class BSTpair{
      boolean isBST;
      int min;
      int max;
      Node root_val;
      int size;
     
  }
  
  public static BSTpair isBST(Node node){
      if(node == null){
          BSTpair base = new BSTpair();
          base.min = Integer.MAX_VALUE;
          base.max = Integer.MIN_VALUE;
          base.isBST = true;
          base.root_val = null;
          base.size = 0;
          return base;
      }
      
      BSTpair node_left =  isBST(node.left);
      BSTpair node_right = isBST(node.right);
      
      BSTpair mp = new BSTpair();
      mp.isBST = node_left.isBST && node_right.isBST &&
      (node.data >= node_left.max && node.data <= node_right.min);
      
      mp.min = Math.min(node.data,Math.min(node_left.min,node_right.min));     
      mp.max = Math.max(node.data,Math.max(node_left.max,node_right.max));

      
      if(mp.isBST){
            mp.root_val = node;
            mp.size = node_left.size + node_right.size + 1;
      }
      else if(node_left.size > node_right.size){
          mp.root_val = node_left.root_val;
          mp.size = node_left.size;
      }
      else{
          mp.root_val = node_right.root_val;
          mp.size = node_right.size;
      }
      
      return mp;
  }
  
  
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Integer[] arr = new Integer[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      if (values[i].equals("n") == false) {
        arr[i] = Integer.parseInt(values[i]);
      } else {
        arr[i] = null;
      }
    }

    Node root = construct(arr);
    
    // write your code here
    BSTpair answer = isBST(root);
    System.out.println(answer.root_val.data +"@"+answer.size);
  }

}
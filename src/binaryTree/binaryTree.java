package binaryTree;

class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class binaryTree {
    private TreeNode root;

    public binaryTree() {
        this.root = null;
    }

    public void addNode(int data) {
        root = addNodeRecursive(root, data);
    }

    private TreeNode addNodeRecursive(TreeNode node, int data) {
        if (node == null) {
            return new TreeNode(data);
        }

        if (data < node.data) {
            node.left = addNodeRecursive(node.left, data);
        } else if (data > node.data) {
            node.right = addNodeRecursive(node.right, data);
        }else{
            //value exists
            return node;
        }

        return node;
    }

    public boolean search(int data) {
        return searchRecursive(root, data);
    }

    private boolean searchRecursive(TreeNode node, int data) {
        if (node == null) {
            return false;
        }

        if (data == node.data) {
            return true;
        } else if (data < node.data) {
            return searchRecursive(node.left, data);
        } else {
            return searchRecursive(node.right, data);
        }
    }

    public void inOrderTraversal() {
        inOrderTraversalRecursive(root);
    }

    private void inOrderTraversalRecursive(TreeNode node) {
        if (node != null) {
            inOrderTraversalRecursive(node.left);
            System.out.print(node.data + " ");
            inOrderTraversalRecursive(node.right);
        }
    }

    public void preOrderTraversal() {
        preOrderTraversalRecursive(root);
    }

    private void preOrderTraversalRecursive(TreeNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrderTraversalRecursive(node.left);
            preOrderTraversalRecursive(node.right);
        }
    }

    public void postOrderTraversal() {
        postOrderTraversalRecursive(root);
    }

    private void postOrderTraversalRecursive(TreeNode node) {
        if (node != null) {
            postOrderTraversalRecursive(node.left);
            postOrderTraversalRecursive(node.right);
            System.out.print(node.data + " ");
        }
    }
}
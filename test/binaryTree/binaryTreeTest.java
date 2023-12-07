package binaryTree;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @Test
    void testInsertPlusSearch(){
        binaryTree bt = new binaryTree();
        bt.addNode(2);
        bt.addNode(3);
        bt.addNode(4);



        assertTrue(bt.search(4));
        assertFalse(bt.search(5));
    }

    @Test
    void testPreorder(){
        binaryTree binaryTree = new binaryTree();
        binaryTree.addNode(50);
        binaryTree.addNode(30);
        binaryTree.addNode(70);
        binaryTree.addNode(20);
        binaryTree.addNode(40);
        binaryTree.addNode(60);
        binaryTree.addNode(80);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        //this listens to the data output form the code
        System.setOut(new PrintStream(outContent));

        binaryTree.preOrderTraversal();
        assertEquals("50 30 20 40 70 60 80 ", outContent.toString());

        //testing if the output with bytearrayoutputstream is really correct
        System.out.print("2");
        assertNotEquals("50 30 20 40 70 60 80 ", outContent.toString());
    }

    @Test
    void testPostOrder(){
        binaryTree binaryTree = new binaryTree();
        binaryTree.addNode(50);
        binaryTree.addNode(30);
        binaryTree.addNode(70);
        binaryTree.addNode(20);
        binaryTree.addNode(40);
        binaryTree.addNode(60);
        binaryTree.addNode(80);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        //this listens to the data output form the code
        System.setOut(new PrintStream(outContent));

        binaryTree.postOrderTraversal();
        assertEquals("20 40 30 60 80 70 50 ", outContent.toString());
    }

    @Test
    void testPreOrder(){
        binaryTree binaryTree = new binaryTree();
        binaryTree.addNode(50);
        binaryTree.addNode(30);
        binaryTree.addNode(70);
        binaryTree.addNode(20);
        binaryTree.addNode(40);
        binaryTree.addNode(60);
        binaryTree.addNode(80);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        //this listens to the data output form the code
        System.setOut(new PrintStream(outContent));

        binaryTree.preOrderTraversal();
        assertEquals("50 30 20 40 70 60 80 ", outContent.toString());
    }

}
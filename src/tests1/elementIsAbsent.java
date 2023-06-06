import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class elementIsAbsent extends  Main.BinaryTree{
    @Test
    public void elementIsAbsent() {
        //Build tree 1
        Main.Node node1_1 = new Main.Node("Vitaliy" , "Grigoryev" , 16);
        Main.Node node1_2 = new Main.Node("Kirill" , "Kondratyev" , 24) ;
        Main.Node node1_3 = new Main.Node("Vova", "1", 3) ;
        Main.Node node1_4 = new Main.Node("Ivan", "1", 4) ;
        Main.Node node1_5 = new Main.Node("Sergio", "1", 5) ;
        Main.Node node1_6 = new Main.Node("Dima", "1", 6) ;
        Main.Node node1_7 = new Main.Node("Igor", "1", 7) ;
        Main.Node node1_8 = new Main.Node("Ilya", "1", 8) ;
        node1_1.left = node1_2;
        node1_1.right = node1_3;
        node1_2.left = node1_4;
        node1_2.right = node1_5;
        node1_4.left = node1_7;
        node1_4.right = node1_8;
        node1_3.left = node1_6;
        //build tree 2
        Main.Node node2_1 = new Main.Node("Vitaliy" , "Grigoryev" , 16);
        Main.Node node2_2 = new Main.Node("Kirill" , "Kondratyev" , 24) ;
        Main.Node node2_3 = new Main.Node("Vova", "1", 3) ;
        Main.Node node2_4 = new Main.Node("Ivan", "1", 4) ;
        Main.Node node2_5 = new Main.Node("Sergio", "1", 5) ;
        Main.Node node2_6 = new Main.Node("Dima", "1", 6) ;
        Main.Node node2_7 = new Main.Node("Igor", "1", 7) ;
        Main.Node node2_8 = new Main.Node("Ilya", "1", 8) ;
        node2_1.left = node2_2;
        node2_1.right = node2_3;
        node2_2.left = node2_4;
        node2_2.right = node2_5;
        node2_4.left = node2_7;
        node2_4.right = node2_8;
        node2_3.left = node2_6;
        elementIsAbsent f = new elementIsAbsent();
        Assertions.assertEquals(node1_1, node2_1);
        Assertions.assertEquals(node1_2, node2_2);
        Assertions.assertEquals(node1_3, node2_3);
        Assertions.assertEquals(node1_4, node2_4);
        Assertions.assertEquals(node1_5, node2_5);
        Assertions.assertEquals(node1_6, node2_6);
        Assertions.assertEquals(node1_7, node2_7);
        Assertions.assertEquals(node1_8, node2_8);
    }
}

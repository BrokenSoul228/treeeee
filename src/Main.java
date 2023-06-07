import com.binaryTree.BinaryTree;
import com.binaryTree.Node;
import com.binaryTree.Person;
import org.junit.Test;

import java.util.List;

public class Main {
    public static void main(String[] args){
        BinaryTree<Person> tree = new BinaryTree<Person>();
        Person Kirill = new Person(13, "Kirill", "Litvinenko");
        Person Alice = new Person(33, "Alice", "Abramova");
        Person Bob = new Person(33, "Bob", "Samoilov");
        Person Seva = new Person(33, "Seva", "Abramov");
        Person Lev = new Person(23, "Seva", "Abramov");
        tree.add(Kirill);
        tree.add(Alice);
        tree.add(Bob);
        tree.add(Seva);
        tree.output(tree.getRoot());
        System.out.print(tree.contains(tree.getRoot(), Alice));
        System.out.println(tree.getRoot());
        /*System.out.println(tree.contains(, Kirill));
        if (tree.contains(tree.root, 12)){
        System.out.println(tree.find(tree.root, 12));*/
    }
}


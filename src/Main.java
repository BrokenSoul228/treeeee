import com.binaryTree.BinaryTree;
import com.binaryTree.Person;



public class Main {
    public static void main(String[] args){
        BinaryTree<Person> tree = new BinaryTree<>();
        Person Kirill =new Person(13, "Kirill", "Litvinenko");
        Person Alice =new Person(33, "Alice", "Abramova");
        Person Bob =new Person(16, "Bob", "Samoilov");
        Person Seva =new Person(15, "Seva", "Abramov");
        Person Lev =new Person(23, "Lev", "Abramov");
        tree.add(Alice);
        tree.add(Kirill);
        tree.add(Bob);
        tree.add(Lev);
        tree.add(Seva);
        tree.output(tree.getRoot());
        System.out.println(tree.contains(tree.getRoot(), Lev));

    }
}


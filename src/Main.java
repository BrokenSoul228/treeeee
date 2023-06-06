
import java.util.Objects;

public class Main {
    public static void main(String[] args){
        Person Andrey = new Person("Andrey", "Minkov", 31);
        BinaryTree tree = new BinaryTree();
        tree.createBinaryTree();
        tree.add(Andrey.Firstname, Andrey.Lastname, Andrey.age);
        tree.OutPut(tree.root);
        System.out.println(tree.contains(tree.root, 12));
        if (tree.contains(tree.root, 12)){
            System.out.println(tree.find(tree.root, 12));
        }

    }
    static class Person {
        String Firstname;
        String Lastname;
        Integer age;
        public Person(String Firstname, String Lastname ,Integer age){
            this.Firstname = Firstname;
            this.Lastname = Lastname;
            this.age = age;
        }
    }
    static class Node {
        Integer age;
        String firstName;

        String lastName;
        Node left;
        Node right;

        Node(String firstName ,String lastName, Integer  age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.left = null;
            this.right = null;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return Objects.equals(age, node.age) && Objects.equals(firstName, node.firstName) && Objects.equals(lastName, node.lastName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(age, firstName, lastName);
        }
    }
    static class BinaryTree {
        int age;
        Node root;
        private Node addElement (String firstName, String lastName, Node current,int age){                    //добавляем елемент
            if (current == null){
                return new Node(firstName, lastName, age);
            }
            if (current.age > age){
                current.left =addElement(firstName, lastName, current.left , age);
            }
            else if (current.age < age){
                current.right = addElement(firstName, lastName,current.right, age);
            }
            else {
                return current;
            }
            return current;

        }

        public boolean contains(Node current, Integer age){                                         //проверка на нахождение этого элемента в дереве
            if (current == null){
                return false;
            }
            if (current.age == age){
                return true;
            }
            return age < (current.age) ? contains(current.left, age) : contains(current.right, age);
        }

        private String find(Node current,Integer age){                                         //проверка на нахождение этого элемента в дереве
            if (age == current.age){
                return current.firstName + " " + current.lastName;
            }
            return age < (current.age) ? find(current.left, age) : find(current.right, age);
        }

        private BinaryTree createBinaryTree(){                                                      //создание дерева и дочерних элементов
            this.add("Dima" , "Abramov" , 43);
            this.add("Vova" , "Avgustov" , 12);
            this.add("Vitaliy" , "Grigoryev" , 16);
            this.add("Kirill" , "Kondratyev" , 24);
            this.add("Vasilyi" , "Obratkov" , 11);
            this.add("Vova" , "Avgustov" , 15);
            this.add("Vitaliy" , "Grigoryev" , 24);
            this.add("Kirill" , "Kondratyev" , 22);
            this.add("Vasilyi" , "Obratkov" , 21);
            return this;
        }

        public void add(String firstName , String lastName, int age) {
            root = addElement(firstName, lastName, root, age);
        }


        public void OutPut(Node root) {
            if (root != null && root.left != null && root.right != null) {
                System.out.println("  " + root.age + "\n" + root.left.age + " " + root.right.age);
            }
            if (root != null && root.left != null && root.right == null) {
                System.out.println("  " + root.age + "\n" + root.left.age);
            }
            if (root != null && root.left == null && root.right != null) {
                System.out.println("  " + root.age + "\n" + root.right.age);
            }
            if (root.left != null) {
                OutPut(root.left);
            }
            if (root.right != null) {
                OutPut(root.right);
            }
        }
    }
}

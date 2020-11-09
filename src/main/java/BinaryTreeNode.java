

class BinaryTreeNode {
    int mValue;
    BinaryTreeNode left;
    BinaryTreeNode right;

    public BinaryTreeNode(int value){
        mValue = value;
        left = null;
        right = null;
    }

    public int getValue(){
        return mValue;
    }

    public void setValue(int value){
        mValue = value;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void setLeft(BinaryTreeNode node){
        left = node;
    }

    public void setRight(BinaryTreeNode node){
        right = node;
    }
}

class BinaryTree {
    BinaryTreeNode root;
    String result = "";

    public String traverse_tree(BinaryTreeNode node){
        if (node != null) {
            traverse_tree(node.left);
            result += (node.mValue) + " " ;
            traverse_tree(node.right);
        }
        return result;
    }

    public String traverse_tree_1(BinaryTreeNode node){
        if (result != "") { result = ""; }
        return traverse_tree(node);
    }


  /*  public int traverse_tree_to_fetch_index(BinaryTreeNode node, int index) {
        int to_return = 0;
        try {
            to_return = 0;
            boolean found = false;
            while (index_to_pass != index) {
                traverse_tree(node.left);
                index_to_pass += 1;
                if (index_to_pass == index) {
                    to_return = (node.mValue);
                    found = true;
                    break;
                }
                traverse_tree(node.right);
            }
            if (found == true) {
                return to_return;
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
        return to_return;
    }

    int index_to_pass = 0;

    public String traverse_tree_index(BinaryTreeNode node, int index){
        if (index_to_pass != 0) {index_to_pass = 0;};
        return traverse_tree(node);
    }  */



    private BinaryTreeNode add_value_recursive(BinaryTreeNode node, int value){
        if (node == null){
            return new BinaryTreeNode(value);

        }

            if (node.mValue>value) {
                node.left = add_value_recursive(node.left, value);
            }
            else if (node.mValue<value){
                node.right = add_value_recursive(node.right, value);
            }
            else {
                return node;
            }
            return node;

    }

    public void add_value(int value) {
        root = add_value_recursive(root,value);
    }



}

class SearchSet {
    int mElements;
    BinaryTree treeImplementation = new BinaryTree();

    public void insert(int value){
        treeImplementation.add_value(value);
    }

    public String search_set(){
        String s = treeImplementation.traverse_tree_1(treeImplementation.root);
        return s;
    }

    public boolean contains(int checking){
        boolean to_return = false;
        String list_of_el = search_set();
        String[] list_split = list_of_el.split(" ");
        for (String e : list_split) {
            if (Integer.parseInt(e) == checking){
                to_return = true;
            }
        }
        return to_return;
    }

    public int getNumberElements(){
        String list_of_el = search_set();
        String[] list_split = list_of_el.split(" ");
        return list_split.length;
    }
}

class FunctionalArray{
    BinaryTree treeImplementation = new BinaryTree();

    FunctionalArray(int size) {
        for (int i = 0; i<size; i++){
            treeImplementation.add_value(0);
        }
    }


    int get(int index){
        String s = treeImplementation.traverse_tree_1(treeImplementation.root);
        String[] list_split = s.split(" ");
        int to_return = 0;
        int i = 0;
        for (String element : list_split){
            i++;
            if (i == index) {
                to_return = Integer.parseInt(element);
            }
        }
        return to_return;
    }



}

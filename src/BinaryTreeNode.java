

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

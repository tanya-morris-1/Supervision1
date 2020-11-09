import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
class BinaryTreeNodeTest {
    @Test
    public void tree_sets_root(){

    // ARRANGE
    BinaryTree test_tree = new BinaryTree();

    // ACT
    test_tree.add_value(1);
    int result = test_tree.root.getValue();

    //ASSERT
    //assertThat(result).isEqualTo(1);

}}




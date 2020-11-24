package study.dataStructure;

public interface BinaryTree<Y> extends Tree<Y> {

    Position<Y> left(Position<Y> p);

    Position<Y> right(Position<Y> p);

    Position<Y> sibling(Position<Y> p);


}

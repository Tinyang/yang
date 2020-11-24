package study.dataStructure;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractBinaryTree<Y> extends AbstractTree<Y> implements BinaryTree<Y> {
    @Override
    public Position<Y> sibling(Position<Y> p) {
        Position<Y> parent = parent(p);
        if (null == parent) { //p is the root position
            return null;
        } else if (left(parent) == p) {
            return right(parent);
        } else {
            return left(parent);
        }
    }

    @Override
    public Iterable<Position<Y>> children(Position<Y> p) {
        List<Position<Y>> snapshot = new ArrayList<>(2);
        if (left(p) != null) {
            snapshot.add(left(p));
        }
        if (right(p) !=  null) {
            snapshot.add(right(p));
        }
        return snapshot;
    }

    @Override
    public int numChildren(Position<Y> p) {
        int count = 0;
        if (left(p) != null) {
            count ++;
        }
        if (right(p) != null) {
            count ++;
        }
        return count;
    }

}

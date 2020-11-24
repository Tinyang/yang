package study.dataStructure;

import java.util.Iterator;

public abstract class AbstractTree<Y> implements Tree<Y> {

    @Override
    public boolean isInternal(Position<Y> p) {
        return numChildren(p) > 0;
    }

    @Override
    public boolean isExternal(Position<Y> p) {
        return numChildren(p) == 0;
    }

    @Override
    public boolean isRoot(Position<Y> p) {
        return p == root();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    public int depth(Position<Y> p) {
        if (isRoot(p)) {
            return 0;
        } else {
            return depth(parent(p)) + 1;
        }
    }

    public int heightBad() {
        int tempHeight = 0;
        Iterator<Position<Y>> iterator = positions().iterator();
        while (iterator.hasNext()) {
            Position<Y> position = iterator.next();
            if (isExternal(position)) {
                int currentPositionDepth = depth(position);
                tempHeight = currentPositionDepth > tempHeight ? currentPositionDepth : tempHeight;
            }
        }
        return tempHeight;
    }

    public int height() {
        return height(root());
    }

    public int height(Position<Y> p) {
        int height = 0;
        for(Position<Y> position : children(p)) {
            if ((height(position) + 1) > height) {
                height = height(position) + 1;
            }
        }
        return height;
    }
}

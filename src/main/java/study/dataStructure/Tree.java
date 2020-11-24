package study.dataStructure;

import java.util.Iterator;

public interface Tree<Y> extends Iterable<Y> {

    Position<Y> root();

    Position<Y> parent(Position<Y> p);

    Iterable<Position<Y>> children(Position<Y> p);

    int numChildren(Position<Y> p);

    boolean isInternal(Position<Y> p);

    boolean isExternal(Position<Y> p);

    boolean isRoot(Position<Y> p);

    int size();

    boolean isEmpty();

    Iterator<Y> iterator();

    Iterable<Position<Y>> positions();

    int depth(Position<Y> p);

    int height(); //maximum of the depths of its positions

}

package sum.gary

/**
  * Created by gary on 2017/4/30.
  */
class EmptySet extends IntSet{
  override def incl(y: Int): IntSet = new NonEmptySet(y,new EmptySet,new EmptySet)

  override def contains(y: Int): Boolean = false

  override def union(otherSet: IntSet): IntSet = otherSet

  override def toString():String=""
}

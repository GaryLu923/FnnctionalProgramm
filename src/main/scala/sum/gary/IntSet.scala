package sum.gary

/**
  * Created by gary on 2017/4/30.
  */
abstract class IntSet {
  def incl(y:Int):IntSet
  def contains(y:Int):Boolean
  def union(otherSet:IntSet):IntSet
}

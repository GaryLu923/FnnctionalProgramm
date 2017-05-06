package sum.gary

/**
  * Created by gary on 2017/4/30.
  */
class NonEmptySet(elem:Int,left:IntSet,right:IntSet) extends IntSet{
  override def incl(y: Int): IntSet =
    if(y<elem) new NonEmptySet(elem,left incl y ,right)
    else if(y>elem)new NonEmptySet(elem,left,right incl y)
    else this

  override def contains(y: Int): Boolean = ???

  override def union(otherSet: IntSet): IntSet = ???

  override def toString():String=s"{"+left+elem+right+"}"
}

package sum

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner



/**
  * Created by gary.lu on 2017/4/23.
  * Testing sumMethod and sumProduct
  */

@RunWith(classOf[JUnitRunner])
class SumSuite extends FunSuite{
  import Main._
  test("test sum method"){
    assert(sumMethod(p=>p*p)(f=>(f))(10,20).isInstanceOf[Long])
  }
  test("test sumProduct"){
    println(sumProduct(5))
    assert(sumProduct(5).isInstanceOf[Long])
  }
}

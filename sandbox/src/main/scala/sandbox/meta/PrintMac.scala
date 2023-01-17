package sandbox.meta

import scala.quoted._

object PrintMac {
  transparent inline def apply(inline any: Any): Any = ${ printImpl('any) }
  def printImpl(expr: Expr[Any])(using Quotes): Expr[Any] = {
    import quotes.reflect._
    println("================== The Short Version ================")
    println(expr.show)
    println("================== The Long Version ================")
    println(Printer.TreeStructure.show(expr.asTerm.underlyingArgument))
    expr
  }
}
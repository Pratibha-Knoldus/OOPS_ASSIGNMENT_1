package Api

import classes.{DoubleQueue, SquareQueue}



object Main {
  def main(args: Array[String]): Unit = {
    //Initialization the DoubleQueue class's methods
    val doubleQueue = new DoubleQueue
    println("The double queue is:-")
    doubleQueue.enqueue(25)
    doubleQueue.enqueue(95)
    doubleQueue.enqueue(89)
    doubleQueue.enqueue(78)
    doubleQueue.enqueue(45)
    doubleQueue.enqueue(69)

    for(value <- doubleQueue.queue) print(value+"=>")
    println()

    doubleQueue.dequeue()
    for(value <- doubleQueue.queue) print(value+"=>")
    println()

    doubleQueue.dequeue()
    for(value <- doubleQueue.queue) print(value+"=>")
    println()

    doubleQueue.dequeue()
    for(value <- doubleQueue.queue) print(value+"=>")
    println()

    //Initializing the SquareQueue class's methods
    val squareQueue = new SquareQueue
    println("The squared queue is:-")
    squareQueue.enqueue(1)
    squareQueue.enqueue(2)
    squareQueue.enqueue(3)
    squareQueue.enqueue(4)
    squareQueue.enqueue(5)
    squareQueue.enqueue(6)
    squareQueue.enqueue(7)
    squareQueue.enqueue(8)
    squareQueue.enqueue(9)

    for(value <- squareQueue.queue) print(value+"=>")
    println()

    squareQueue.dequeue()
    for(value <- squareQueue.queue) print(value+"=>")
    println()

    squareQueue.dequeue()
    for(value <- squareQueue.queue) print(value+"=>")
    println()

    squareQueue.dequeue()
    for(value <- squareQueue.queue) print(value+"=>")
    println()

    squareQueue.dequeue()
    for(value <- squareQueue.queue) print(value+"=>")
    println()
    println(squareQueue.front)
    println(squareQueue.rear)
  }
}
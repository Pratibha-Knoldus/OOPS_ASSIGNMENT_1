package Traits

trait Queue {
  var queue:List[Int] = List()
  var front:Int = -1
  var rear:Int = -1

  //Method to add an element in the queue
  def enqueue(key:Int):Unit={
  }

  // Method to remove an key from queue.
  def dequeue():Unit={
    // If queue is empty, return NULL.
    if (this.front == -1) {
      println("Queue is empty")
      return
    }

    // Store previous front and move front one node ahead
    queue = queue.drop(1)
    if(queue.isEmpty) this.front = -1
    else this.front = this.front + 1

    // If front becomes NULL, then change rear also as NULL
    if (this.front == -1)
      this.rear = -1
  }


}

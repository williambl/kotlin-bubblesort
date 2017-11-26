fun main(args: Array<String>) {
    var array : Array<Int> = arrayOf(0,5,4,3,1,2);
    array = mergeSort(array)
}

fun mergeSort (array: Array<Int>): Array<Int> {
    var done : Boolean = false

    while (done == false) {
        var index: Int = 0
        done = true
        while (index < array.size-1) { // Move through the array

            if (array[index] > array[index + 1]) { // If the next item is larger than current

                // Swap them
                val tmp = array[index]
                array[index] = array[index + 1]
                array[index + 1] = tmp

                // Mark as not done
                done = false
            }

            //print the array
            for (element in array) {
                print(element.toString() + " ")
            }
            println()
            index++
        }
    }
    return(array)
}
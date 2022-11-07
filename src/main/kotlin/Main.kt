fun main() {
    miniMaxSum(arrayOf(1, 2, 3, 4, 5))
}

fun miniMaxSum(arr: Array<Int>) {
    arr.sort()
    var minSum = 0L
    var maxSum = 0L
    val index = 4
    for (i in 0 until arr.size - 1) {
        minSum += arr[i]
        maxSum += arr[index - i]
    }
    print("$minSum $maxSum")
}
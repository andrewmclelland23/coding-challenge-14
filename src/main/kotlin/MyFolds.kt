class MyFolds {

    fun myFold(intList: List<Int>, acc: String, func: (String, Int) -> String): String {
        var currentAcc = acc
        intList.forEach() {
            currentAcc = func(currentAcc, it)
        }
        return currentAcc
    }

    fun <listType, returnType> foldAnyType(list: List<listType>, acc: returnType,
                                                  func: (returnType, listType) -> returnType): returnType {
        var currentAcc : returnType = acc
        list.forEach() {
            currentAcc = func(currentAcc, it)
        }
        return currentAcc
    }
}
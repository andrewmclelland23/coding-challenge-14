import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MyFoldsTest {

    private val classUnderTest = MyFolds()
    val addEvens = fun(acc: MutableList<Int>, element: Int) : MutableList<Int>{
        if(element % 2 == 0) { acc.add(element) }
        return acc
    }

    @Test
    fun myFold() {
        assertEquals(
            "The result is 1234", classUnderTest.myFold(listOf(1,2,3,4), "The result is ", { acc, element -> acc + element.toString() }))
    }

    @Test
    fun `foldAnyType with int list and string acc`() {
        assertEquals("The result is 1234",
            classUnderTest.foldAnyType(listOf(1,2,3,4), "The result is ", { acc, element -> acc + element.toString() }))
    }
    @Test
    fun `foldAnyType with string list and string acc`() {
        assertEquals("Team wicker devs were Andy Miles Hosam Pavel Matt",
            classUnderTest.foldAnyType(listOf("Andy","Miles","Hosam","Pavel", "Matt"), "Team wicker devs were", { acc, element -> "$acc $element" }))
    }

    @Test
    fun `foldAnyType to filter out odd numbers `() {
        assertEquals(listOf<Int>(2,4,6,8,10),
            classUnderTest.foldAnyType(listOf<Int>(1,2,3,4,5,6,7,8,9,10), mutableListOf(), addEvens))
    }
}
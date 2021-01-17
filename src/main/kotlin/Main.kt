@Suppress("NON_PUBLIC_PRIMARY_CONSTRUCTOR_OF_INLINE_CLASS")
inline class Plant @PublishedApi
internal constructor (private val name: String) {
    override fun toString(): String = name
    companion object {
        fun parse(name: String): Plant {
            check(name.isNotEmpty())
            return Plant(name)
        }
    }
}

suspend fun main(args: Array<String>) {}

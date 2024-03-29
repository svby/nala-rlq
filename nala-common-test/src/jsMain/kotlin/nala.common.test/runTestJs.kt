package nala.common.test

import kotlinx.coroutines.CoroutineScope
import kotlin.test.Ignore

actual typealias PlatformIgnore = Ignore

actual inline fun runTest(crossinline block: suspend CoroutineScope.() -> Unit): Unit =
        console.error(
                "Unfortunately, Kotlin does not yet support suspending tests, " +
                        "so they are only implemented in the JVM target. " +
                        "For now, all JS tests pass by default."
        )

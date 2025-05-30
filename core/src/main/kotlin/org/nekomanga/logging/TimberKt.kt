package org.nekomanga.logging

import timber.log.Timber

object TimberKt {
    @JvmStatic
    inline fun v(t: Throwable? = null, message: () -> String) = log { Timber.v(t, message()) }

    @JvmStatic
    inline fun d(t: Throwable? = null, message: () -> String) = log { Timber.d(t, message()) }

    @JvmStatic
    inline fun i(t: Throwable? = null, message: () -> String) = log { Timber.i(t, message()) }

    @JvmStatic
    inline fun w(t: Throwable? = null, message: () -> String) = log { Timber.w(t, message()) }

    @JvmStatic fun w(t: Throwable?) = Timber.w(t)

    @JvmStatic
    inline fun e(t: Throwable? = null, message: () -> String) = log { Timber.e(t, message()) }

    @JvmStatic fun e(t: Throwable?) = Timber.e(t)

    @JvmStatic
    inline fun wtf(t: Throwable? = null, message: () -> String) = log { Timber.wtf(t, message()) }

    @JvmStatic fun asTree(): Timber.Tree = Timber.asTree()

    @JvmStatic fun plant(tree: Timber.Tree) = Timber.plant(tree)

    @JvmStatic fun tag(tag: String): Timber.Tree = Timber.tag(tag)

    @JvmStatic fun uproot(tree: Timber.Tree) = Timber.uproot(tree)

    @JvmStatic fun uprootAll() = Timber.uprootAll()

    @JvmStatic fun DebugTree() = Timber.DebugTree()
}

/** @suppress */
@PublishedApi
internal inline fun log(block: () -> Unit) {
    if (Timber.treeCount > 0) block()
}

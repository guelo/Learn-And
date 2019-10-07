package com.gaali.player

interface IPlayerLog {

    fun d(tag: String?, message: String, throwable: Throwable? = null)
    fun e(tag: String?, message: String, throwable: Throwable? = null)
    fun i(tag: String?, message: String)
    fun w(tag: String?, message: String)
}
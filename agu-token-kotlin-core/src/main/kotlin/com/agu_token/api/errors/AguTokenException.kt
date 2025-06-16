package com.agu_token.api.errors

open class AguTokenException(message: String? = null, cause: Throwable? = null) :
    RuntimeException(message, cause)

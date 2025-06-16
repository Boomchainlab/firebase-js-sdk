// File generated from our OpenAPI spec by Stainless.

package com.agu_token.api.errors

import com.agu_token.api.core.JsonValue
import com.agu_token.api.core.http.Headers

abstract class AguTokenServiceException
protected constructor(message: String, cause: Throwable? = null) :
    AguTokenException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}

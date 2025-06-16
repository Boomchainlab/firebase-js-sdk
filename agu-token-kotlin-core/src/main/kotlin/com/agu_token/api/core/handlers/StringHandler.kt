@file:JvmName("StringHandler")

package com.agu_token.api.core.handlers

import com.agu_token.api.core.http.HttpResponse
import com.agu_token.api.core.http.HttpResponse.Handler

internal fun stringHandler(): Handler<String> = StringHandlerInternal

private object StringHandlerInternal : Handler<String> {
    override fun handle(response: HttpResponse): String =
        response.body().readBytes().toString(Charsets.UTF_8)
}

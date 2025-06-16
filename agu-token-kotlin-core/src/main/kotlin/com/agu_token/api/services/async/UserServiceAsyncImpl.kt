// File generated from our OpenAPI spec by Stainless.

package com.agu_token.api.services.async

import com.agu_token.api.core.ClientOptions
import com.agu_token.api.core.JsonValue
import com.agu_token.api.core.RequestOptions
import com.agu_token.api.core.checkRequired
import com.agu_token.api.core.handlers.emptyHandler
import com.agu_token.api.core.handlers.errorHandler
import com.agu_token.api.core.handlers.jsonHandler
import com.agu_token.api.core.handlers.stringHandler
import com.agu_token.api.core.handlers.withErrorHandler
import com.agu_token.api.core.http.HttpMethod
import com.agu_token.api.core.http.HttpRequest
import com.agu_token.api.core.http.HttpResponse
import com.agu_token.api.core.http.HttpResponse.Handler
import com.agu_token.api.core.http.HttpResponseFor
import com.agu_token.api.core.http.json
import com.agu_token.api.core.http.parseable
import com.agu_token.api.core.prepareAsync
import com.agu_token.api.models.user.User
import com.agu_token.api.models.user.UserCreateParams
import com.agu_token.api.models.user.UserCreateWithListParams
import com.agu_token.api.models.user.UserDeleteParams
import com.agu_token.api.models.user.UserLoginParams
import com.agu_token.api.models.user.UserLogoutParams
import com.agu_token.api.models.user.UserRetrieveParams
import com.agu_token.api.models.user.UserUpdateParams

class UserServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    UserServiceAsync {

    private val withRawResponse: UserServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UserServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserServiceAsync =
        UserServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(params: UserCreateParams, requestOptions: RequestOptions): User =
        // post /user
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: UserRetrieveParams,
        requestOptions: RequestOptions,
    ): User =
        // get /user/{username}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(params: UserUpdateParams, requestOptions: RequestOptions) {
        // put /user/{username}
        withRawResponse().update(params, requestOptions)
    }

    override suspend fun delete(params: UserDeleteParams, requestOptions: RequestOptions) {
        // delete /user/{username}
        withRawResponse().delete(params, requestOptions)
    }

    override suspend fun createWithList(
        params: UserCreateWithListParams,
        requestOptions: RequestOptions,
    ): User =
        // post /user/createWithList
        withRawResponse().createWithList(params, requestOptions).parse()

    override suspend fun login(params: UserLoginParams, requestOptions: RequestOptions): String =
        // get /user/login
        withRawResponse().login(params, requestOptions).parse()

    override suspend fun logout(params: UserLogoutParams, requestOptions: RequestOptions) {
        // get /user/logout
        withRawResponse().logout(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UserServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): UserServiceAsync.WithRawResponse =
            UserServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<User> =
            jsonHandler<User>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun create(
            params: UserCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<User> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("user")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<User> =
            jsonHandler<User>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: UserRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<User> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("username", params.username())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("user", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override suspend fun update(
            params: UserUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("existingUsername", params.existingUsername())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("user", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable { response.use { updateHandler.handle(it) } }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override suspend fun delete(
            params: UserDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("username", params.username())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("user", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable { response.use { deleteHandler.handle(it) } }
        }

        private val createWithListHandler: Handler<User> =
            jsonHandler<User>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun createWithList(
            params: UserCreateWithListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<User> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("user", "createWithList")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { createWithListHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val loginHandler: Handler<String> = stringHandler().withErrorHandler(errorHandler)

        override suspend fun login(
            params: UserLoginParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("user", "login")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable { response.use { loginHandler.handle(it) } }
        }

        private val logoutHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override suspend fun logout(
            params: UserLogoutParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("user", "logout")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable { response.use { logoutHandler.handle(it) } }
        }
    }
}

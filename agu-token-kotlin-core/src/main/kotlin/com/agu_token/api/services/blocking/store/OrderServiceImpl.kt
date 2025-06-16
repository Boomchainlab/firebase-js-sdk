// File generated from our OpenAPI spec by Stainless.

package com.agu_token.api.services.blocking.store

import com.agu_token.api.core.ClientOptions
import com.agu_token.api.core.JsonValue
import com.agu_token.api.core.RequestOptions
import com.agu_token.api.core.checkRequired
import com.agu_token.api.core.handlers.emptyHandler
import com.agu_token.api.core.handlers.errorHandler
import com.agu_token.api.core.handlers.jsonHandler
import com.agu_token.api.core.handlers.withErrorHandler
import com.agu_token.api.core.http.HttpMethod
import com.agu_token.api.core.http.HttpRequest
import com.agu_token.api.core.http.HttpResponse
import com.agu_token.api.core.http.HttpResponse.Handler
import com.agu_token.api.core.http.HttpResponseFor
import com.agu_token.api.core.http.json
import com.agu_token.api.core.http.parseable
import com.agu_token.api.core.prepare
import com.agu_token.api.models.Order
import com.agu_token.api.models.store.order.OrderCreateParams
import com.agu_token.api.models.store.order.OrderDeleteParams
import com.agu_token.api.models.store.order.OrderRetrieveParams

class OrderServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    OrderService {

    private val withRawResponse: OrderService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OrderService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): OrderService =
        OrderServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun create(params: OrderCreateParams, requestOptions: RequestOptions): Order =
        // post /store/order
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: OrderRetrieveParams, requestOptions: RequestOptions): Order =
        // get /store/order/{orderId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun delete(params: OrderDeleteParams, requestOptions: RequestOptions) {
        // delete /store/order/{orderId}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OrderService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): OrderService.WithRawResponse =
            OrderServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val createHandler: Handler<Order> =
            jsonHandler<Order>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: OrderCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Order> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("store", "order")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val retrieveHandler: Handler<Order> =
            jsonHandler<Order>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: OrderRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Order> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("orderId", params.orderId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("store", "order", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override fun delete(
            params: OrderDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("orderId", params.orderId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("store", "order", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable { response.use { deleteHandler.handle(it) } }
        }
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.agu_token.api.services.blocking.store

import com.agu_token.api.core.ClientOptions
import com.agu_token.api.core.RequestOptions
import com.agu_token.api.core.http.HttpResponse
import com.agu_token.api.core.http.HttpResponseFor
import com.agu_token.api.models.Order
import com.agu_token.api.models.store.order.OrderCreateParams
import com.agu_token.api.models.store.order.OrderDeleteParams
import com.agu_token.api.models.store.order.OrderRetrieveParams
import com.google.errorprone.annotations.MustBeClosed

interface OrderService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): OrderService

    /** Place a new order in the store */
    fun create(
        params: OrderCreateParams = OrderCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Order

    /** @see [create] */
    fun create(requestOptions: RequestOptions): Order =
        create(OrderCreateParams.none(), requestOptions)

    /**
     * For valid response try integer IDs with value <= 5 or > 10. Other values will generate
     * exceptions.
     */
    fun retrieve(
        orderId: Long,
        params: OrderRetrieveParams = OrderRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Order = retrieve(params.toBuilder().orderId(orderId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        params: OrderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Order

    /** @see [retrieve] */
    fun retrieve(orderId: Long, requestOptions: RequestOptions): Order =
        retrieve(orderId, OrderRetrieveParams.none(), requestOptions)

    /**
     * For valid response try integer IDs with value < 1000. Anything above 1000 or nonintegers will
     * generate API errors
     */
    fun delete(
        orderId: Long,
        params: OrderDeleteParams = OrderDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().orderId(orderId).build(), requestOptions)

    /** @see [delete] */
    fun delete(params: OrderDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see [delete] */
    fun delete(orderId: Long, requestOptions: RequestOptions) =
        delete(orderId, OrderDeleteParams.none(), requestOptions)

    /** A view of [OrderService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): OrderService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /store/order`, but is otherwise the same as
         * [OrderService.create].
         */
        @MustBeClosed
        fun create(
            params: OrderCreateParams = OrderCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Order>

        /** @see [create] */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<Order> =
            create(OrderCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /store/order/{orderId}`, but is otherwise the same
         * as [OrderService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            orderId: Long,
            params: OrderRetrieveParams = OrderRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Order> =
            retrieve(params.toBuilder().orderId(orderId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: OrderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Order>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(orderId: Long, requestOptions: RequestOptions): HttpResponseFor<Order> =
            retrieve(orderId, OrderRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /store/order/{orderId}`, but is otherwise the
         * same as [OrderService.delete].
         */
        @MustBeClosed
        fun delete(
            orderId: Long,
            params: OrderDeleteParams = OrderDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().orderId(orderId).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: OrderDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see [delete] */
        @MustBeClosed
        fun delete(orderId: Long, requestOptions: RequestOptions): HttpResponse =
            delete(orderId, OrderDeleteParams.none(), requestOptions)
    }
}

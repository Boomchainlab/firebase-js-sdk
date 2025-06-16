// File generated from our OpenAPI spec by Stainless.

package com.agu_token.api.client

import com.agu_token.api.core.ClientOptions
import com.agu_token.api.core.getPackageVersion
import com.agu_token.api.services.async.PetServiceAsync
import com.agu_token.api.services.async.PetServiceAsyncImpl
import com.agu_token.api.services.async.StoreServiceAsync
import com.agu_token.api.services.async.StoreServiceAsyncImpl
import com.agu_token.api.services.async.UserServiceAsync
import com.agu_token.api.services.async.UserServiceAsyncImpl

class AguTokenClientAsyncImpl(private val clientOptions: ClientOptions) : AguTokenClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: AguTokenClient by lazy { AguTokenClientImpl(clientOptions) }

    private val withRawResponse: AguTokenClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val pet: PetServiceAsync by lazy { PetServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val store: StoreServiceAsync by lazy {
        StoreServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val user: UserServiceAsync by lazy { UserServiceAsyncImpl(clientOptionsWithUserAgent) }

    override fun sync(): AguTokenClient = sync

    override fun withRawResponse(): AguTokenClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AguTokenClientAsync =
        AguTokenClientAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun pet(): PetServiceAsync = pet

    override fun store(): StoreServiceAsync = store

    override fun user(): UserServiceAsync = user

    override fun close() = clientOptions.httpClient.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AguTokenClientAsync.WithRawResponse {

        private val pet: PetServiceAsync.WithRawResponse by lazy {
            PetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val store: StoreServiceAsync.WithRawResponse by lazy {
            StoreServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val user: UserServiceAsync.WithRawResponse by lazy {
            UserServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AguTokenClientAsync.WithRawResponse =
            AguTokenClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun pet(): PetServiceAsync.WithRawResponse = pet

        override fun store(): StoreServiceAsync.WithRawResponse = store

        override fun user(): UserServiceAsync.WithRawResponse = user
    }
}

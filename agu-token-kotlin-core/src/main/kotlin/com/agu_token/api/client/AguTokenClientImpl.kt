// File generated from our OpenAPI spec by Stainless.

package com.agu_token.api.client

import com.agu_token.api.core.ClientOptions
import com.agu_token.api.core.getPackageVersion
import com.agu_token.api.services.blocking.PetService
import com.agu_token.api.services.blocking.PetServiceImpl
import com.agu_token.api.services.blocking.StoreService
import com.agu_token.api.services.blocking.StoreServiceImpl
import com.agu_token.api.services.blocking.UserService
import com.agu_token.api.services.blocking.UserServiceImpl

class AguTokenClientImpl(private val clientOptions: ClientOptions) : AguTokenClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: AguTokenClientAsync by lazy { AguTokenClientAsyncImpl(clientOptions) }

    private val withRawResponse: AguTokenClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val pet: PetService by lazy { PetServiceImpl(clientOptionsWithUserAgent) }

    private val store: StoreService by lazy { StoreServiceImpl(clientOptionsWithUserAgent) }

    private val user: UserService by lazy { UserServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): AguTokenClientAsync = async

    override fun withRawResponse(): AguTokenClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AguTokenClient =
        AguTokenClientImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun pet(): PetService = pet

    override fun store(): StoreService = store

    override fun user(): UserService = user

    override fun close() = clientOptions.httpClient.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AguTokenClient.WithRawResponse {

        private val pet: PetService.WithRawResponse by lazy {
            PetServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val store: StoreService.WithRawResponse by lazy {
            StoreServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val user: UserService.WithRawResponse by lazy {
            UserServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AguTokenClient.WithRawResponse =
            AguTokenClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun pet(): PetService.WithRawResponse = pet

        override fun store(): StoreService.WithRawResponse = store

        override fun user(): UserService.WithRawResponse = user
    }
}

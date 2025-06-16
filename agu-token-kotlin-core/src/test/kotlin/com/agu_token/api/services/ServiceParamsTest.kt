// File generated from our OpenAPI spec by Stainless.

package com.agu_token.api.services

import com.agu_token.api.client.AguTokenClient
import com.agu_token.api.client.okhttp.AguTokenOkHttpClient
import com.agu_token.api.models.Order
import com.agu_token.api.models.store.StoreListInventoryParams
import com.agu_token.api.models.store.order.OrderCreateParams
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import java.time.OffsetDateTime
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ServiceParamsTest {

    private lateinit var client: AguTokenClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            AguTokenOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun listInventory() {
        val storeService = client.store()
        stubFor(get(anyUrl()).willReturn(ok("{}")))

        storeService.listInventory(
            StoreListInventoryParams.builder()
                .putAdditionalHeader("Secret-Header", "42")
                .putAdditionalQueryParam("secret_query_param", "42")
                .build()
        )

        verify(
            getRequestedFor(anyUrl())
                .withHeader("Secret-Header", equalTo("42"))
                .withQueryParam("secret_query_param", equalTo("42"))
        )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val orderService = client.store().order()
        stubFor(post(anyUrl()).willReturn(ok("{}")))

        orderService.create(
            OrderCreateParams.builder()
                .order(
                    Order.builder()
                        .id(10L)
                        .complete(true)
                        .petId(198772L)
                        .quantity(7)
                        .shipDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(Order.Status.APPROVED)
                        .build()
                )
                .putAdditionalHeader("Secret-Header", "42")
                .putAdditionalQueryParam("secret_query_param", "42")
                .build()
        )

        verify(
            postRequestedFor(anyUrl())
                .withHeader("Secret-Header", equalTo("42"))
                .withQueryParam("secret_query_param", equalTo("42"))
        )
    }
}

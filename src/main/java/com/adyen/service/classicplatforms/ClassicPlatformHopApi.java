/*
 * Hosted onboarding API
 * This API is used for the classic integration. If you are just starting your implementation, refer to our [new integration guide](https://docs.adyen.com/marketplaces-and-platforms) instead.  The Hosted onboarding API provides endpoints that you can use to generate links to Adyen-hosted pages, such as an [onboarding page](https://docs.adyen.com/marketplaces-and-platforms/classic/hosted-onboarding-page) or a [PCI compliance questionnaire](https://docs.adyen.com/marketplaces-and-platforms/classic/platforms-for-partners). You can provide these links to your account holders so that they can complete their onboarding.  ## Authentication Your Adyen contact will provide your API credential and an API key. To connect to the API, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication. For example:  ``` curl -U \"ws@MarketPlace.YOUR_PLATFORM_ACCOUNT\":\"YOUR_WS_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ``` When going live, you need to generate new web service user credentials to access the [live endpoints](https://docs.adyen.com/development-resources/live-endpoints).  ## Versioning The Hosted onboarding API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://cal-test.adyen.com/cal/services/Hop/v6/getOnboardingUrl ```
 *
 * The version of the OpenAPI document: 6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.adyen.service.classicplatforms;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.constants.ApiConstants;
import com.adyen.model.marketpayhop.GetOnboardingUrlRequest;
import com.adyen.model.marketpayhop.GetOnboardingUrlResponse;
import com.adyen.model.marketpayhop.GetPciUrlRequest;
import com.adyen.model.marketpayhop.GetPciUrlResponse;
import com.adyen.model.marketpayhop.ServiceError;
import com.adyen.model.RequestOptions;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.Resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ClassicPlatformHopApi extends Service {

    public static final String API_VERSION = "6";

    protected String baseURL;

    /**
    * Hosted Onboarding Page constructor in {@link com.adyen.service package}.
    * @param client {@link Client }  (required)
    */
    public ClassicPlatformHopApi(Client client) {
        super(client);
        this.baseURL = createBaseURL("https://cal-test.adyen.com/cal/services/Hop/v6");
    }

    /**
    * Hosted Onboarding Page constructor in {@link com.adyen.service package}.
    * Please use this constructor only if you would like to pass along your own url for routing or testing purposes. The latest API version is defined in this class as a constant.
    * @param client {@link Client }  (required)
    * @param baseURL {@link String }  (required)
    */
    public ClassicPlatformHopApi(Client client, String baseURL) {
        super(client);
        this.baseURL = baseURL;
    }

    /**
    * Get a link to a Adyen-hosted onboarding page
    *
    * @param getOnboardingUrlRequest {@link GetOnboardingUrlRequest }  (required)
    * @return {@link GetOnboardingUrlResponse }
    * @throws ApiException if fails to make API call
    */
    public GetOnboardingUrlResponse getOnboardingUrl(GetOnboardingUrlRequest getOnboardingUrlRequest) throws ApiException, IOException {
        return getOnboardingUrl(getOnboardingUrlRequest, null);
    }

    /**
    * Get a link to a Adyen-hosted onboarding page
    *
    * @param getOnboardingUrlRequest {@link GetOnboardingUrlRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link GetOnboardingUrlResponse }
    * @throws ApiException if fails to make API call
    */
    public GetOnboardingUrlResponse getOnboardingUrl(GetOnboardingUrlRequest getOnboardingUrlRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = getOnboardingUrlRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/getOnboardingUrl", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return GetOnboardingUrlResponse.fromJson(jsonResult);
    }

    /**
    * Get a link to a PCI compliance questionnaire
    *
    * @param getPciUrlRequest {@link GetPciUrlRequest }  (required)
    * @return {@link GetPciUrlResponse }
    * @throws ApiException if fails to make API call
    */
    public GetPciUrlResponse getPciQuestionnaireUrl(GetPciUrlRequest getPciUrlRequest) throws ApiException, IOException {
        return getPciQuestionnaireUrl(getPciUrlRequest, null);
    }

    /**
    * Get a link to a PCI compliance questionnaire
    *
    * @param getPciUrlRequest {@link GetPciUrlRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link GetPciUrlResponse }
    * @throws ApiException if fails to make API call
    */
    public GetPciUrlResponse getPciQuestionnaireUrl(GetPciUrlRequest getPciUrlRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = getPciUrlRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/getPciQuestionnaireUrl", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return GetPciUrlResponse.fromJson(jsonResult);
    }
}
package kr.ac.kumoh.s20160250.mydust.data.services

import kr.ac.kumoh.s20160250.mydust.BuildConfig
import kr.ac.kumoh.s20160250.mydust.data.models.tmcoordinates.TmCoordinatesResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface KakaoLocalApiService {

    @Headers("Authorization: KakaoAK ${BuildConfig.KAKAO_API_KEY} ")
    @GET("/v2/local/geo/transcoord.json?output_coord=TM")
    suspend fun getTmCoordinates(
        @Query("x") longitude: Double,
        @Query("y") latitude: Double

    ) :Response<TmCoordinatesResponse>
}
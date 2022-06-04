package br.com.restfull.restfullkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val builder: Retrofit = Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service: RestServices = builder.create(RestServices::class.java)

        service.listsUsers().enqueue(object: Callback<List<Base>>
        {
            override fun onResponse(
                call: Call<List<Base>>,
                response: Response<List<Base>>)
            {
                if (response.code() == 200)
                {
                    println ("VALUES OF REST: \n${response.body()}")
                }
            }

            override fun onFailure(call: Call<List<Base>>, t: Throwable)
            {
                throw t
            }
        })  // End listUsers.enqueue
    }
}
package br.com.lidiane.ondeeh.network

import br.com.lidiane.ondeeh.model.Endereco
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path
import java.util.*

interface EnderecoAPI {

    @GET("/ws/{cep}/json/")
    fun pesquisar(@Path("cep")cep: String) : Observable<Endereco>


}
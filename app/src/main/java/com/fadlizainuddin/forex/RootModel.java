package com.fadlizainuddin.forex;

import com.google.gson.annotations.SerializedName;
//RootModel bersifat induk nya yang dimana untuk menyimpan datanya.
//Setiap data JSON yang memakai kurung kurawal atau {} disebut MODEL.
public class RootModel {
//  baris 7 adalah data yang digunakan pada data JSON nya,
//  @SerializedName berguna untuk membuat nama Model dapat berbeda dengan datanya, dan SerializedName harus nempel dengan variabel nya.
    @SerializedName("rates")
    private RatesModel ratesModel;

    public RootModel() {}

    public RatesModel getRatesModel() {
        return ratesModel;
    }

    public void setRatesModel(RatesModel ratesModel) {
        this.ratesModel = ratesModel;
    }
}

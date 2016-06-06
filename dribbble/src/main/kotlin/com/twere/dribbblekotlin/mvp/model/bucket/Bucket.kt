package com.twere.dribbblekotlin.mvp.model.bucket

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.twere.dribbblekotlin.mvp.model.user.User
import java.util.Date

data class Bucket(
    @SerializedName("id") @Expose var id: Int,
    @SerializedName("name") @Expose var name: String,
    @SerializedName("description") @Expose var description: String,
    @SerializedName("shots_count") @Expose var shotsCount: Int,
    @SerializedName("created_at") @Expose var createdAt: Date,
    @SerializedName("updated_at") @Expose var updatedAt: Date,
    @SerializedName("user") @Expose var user: User) {

}
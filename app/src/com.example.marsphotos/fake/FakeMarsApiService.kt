package com.example.marsphotos.data


class FakeMarsApiService : MarsApiService {


    override suspend fun getPhotos(): List<MarsPhoto> {
        return FakeDataSource.photosList
    }
}
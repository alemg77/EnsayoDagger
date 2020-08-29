package com.a6.ensayodagger.di2

import javax.inject.Inject


class UserRepository @Inject constructor(
    private val localDataSource: UserLocalDataSource,
    private val remoteDataSource: UserRemoteDataSource
) { }
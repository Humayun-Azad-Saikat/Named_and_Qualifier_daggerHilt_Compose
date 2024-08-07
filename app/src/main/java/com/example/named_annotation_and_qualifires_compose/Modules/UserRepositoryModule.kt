package com.example.named_annotation_and_qualifires_compose.Modules

import com.example.named_annotation_and_qualifires_compose.SQLrepository
import com.example.named_annotation_and_qualifires_compose.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.migration.DisableInstallInCheck

@DisableInstallInCheck
@Module
class UserRepositoryModule {

//    @Provides
//    fun getFirebaseRepository(): UserRepository {
//        return FirebaseRepository()
//    }

    @Provides
    fun getSQLrepository(sqLrepository: SQLrepository): UserRepository {
        return sqLrepository
    }
}
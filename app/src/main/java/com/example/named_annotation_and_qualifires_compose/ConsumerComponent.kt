package com.example.named_annotation_and_qualifires_compose

import com.example.named_annotation_and_qualifires_compose.Modules.NotificaionServiceModule
import com.example.named_annotation_and_qualifires_compose.Modules.UserRepositoryModule
import dagger.Component


@Component(modules = [UserRepositoryModule::class, NotificaionServiceModule::class])
interface ConsumerComponent {


    fun injectMainAC(mainActivity: MainActivity)

}
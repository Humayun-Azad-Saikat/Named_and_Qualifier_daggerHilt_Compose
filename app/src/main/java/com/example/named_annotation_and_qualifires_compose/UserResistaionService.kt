package com.example.named_annotation_and_qualifires_compose

import com.example.named_annotation_and_qualifires_compose.Qualifiers_For_Dagger.EmailQualifier
import javax.inject.Inject

class UserResistaionService @Inject constructor(
    private val userRepository: UserRepository,
    @EmailQualifier()private val notificationService: NotificationService
) {

    fun resisterUser(email:String,password:String){
        userRepository.saveUser("saikat","codedash00@gmail.com")
        notificationService.send("saikat","system","email body")
    }
}
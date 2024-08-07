package com.example.named_annotation_and_qualifires_compose.Modules

import com.example.named_annotation_and_qualifires_compose.Qualifiers_For_Dagger.EmailQualifier
import com.example.named_annotation_and_qualifires_compose.EmailService
import com.example.named_annotation_and_qualifires_compose.MessageService
import com.example.named_annotation_and_qualifires_compose.NotificationService
import dagger.Module
import dagger.Provides
import dagger.hilt.migration.DisableInstallInCheck
import javax.inject.Named

@DisableInstallInCheck
@Module
class NotificaionServiceModule {

    @Named("message")
    @Provides
    fun getMessageService(): NotificationService {
        return MessageService()
    }

    @EmailQualifier //for solving typing mistake problem we created own qualifier insted of @Named annotation
    @Provides
    fun getEmail():NotificationService{
        return EmailService()
    }
}
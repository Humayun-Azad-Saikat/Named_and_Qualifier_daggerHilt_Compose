package com.example.named_annotation_and_qualifires_compose.Qualifiers_For_Dagger

import java.lang.annotation.Documented
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import javax.inject.Qualifier


@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
//above 3 lines are copied from @Named annotation class
annotation class EmailQualifier()

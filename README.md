com.companyName.appName.config -> 
I use config for my classes which are annotated with @Configuration.

com.companyName.appName.dao.model -> 
I use dao.model for all my entities from the DB.

com.companyName.appName.dao.repository -> 
I use dao.repository for all the repositories used with spring-data-jpa.

com.companyName.appName.dao.repository.impl -> 
I use dao.repository.impl for all customized implementations of repositories. 
For example to autowire the entityManager.

com.companyName.appName.service -> 
I use service for all my service interfaces

com.companyName.appName.service.impl -> 
I use service.impl for all my implementations of services

com.companyName.appName.controller -> 
I use controller for all my controllers.

com.companyName.appName.view.model -> 
I use view.model for all my frontend specific models which are no enitites.

com.companyName.appName.view.form -> 
I use view.form for all my frontend specific forms which has to be submitted and validated.

com.companyName.appName.util -> 
I use util for utility stuff.
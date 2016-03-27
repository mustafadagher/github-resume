# Github Resume Project #

This project is a Spring Boot service that creates your resume based on your GitHub repos/activity. 

* Created based on the [resume.github.com](Link URL) project
https://github.com/resume/resume.github.com

* The Repository contains to Spring Boot projects, one for the REST API (github-resume-service), and the other is a web client that consumers the REST API (github-resume-client)

### Using it ###

* First, start the service api, it runs on port 8090
* You may use the API through pointing to "/resumeAPI/{username}"
* to use the web client run it on a tomcat server or as a spring boot app, it starts on [localhost:8080](Link URL), point to "/resume" and use it. 

### Author ###

* Mustafa Dagher (dagher.mustafa@gmail.com)
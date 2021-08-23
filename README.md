# Jenkins as Code Test Project 

## General info
This project is made to explore endless possibilities that jcasc and job-DSL plugins provide to Jenkins.

## Technologies

* jenkins:lts-jdk11 with plugins listed in jenkins_config/plugins.txt
* docker with slightly changed jenkins official image
* groovy - for writing jenkins jobs scripts
* git - for version control and providing repositories with projects to be built using jenkins

## Setup
To run this project you need docker. 

First, create a text file with admin password in your desired location and provide path to it in docker-compose.yml file.

Next run `docker compose up` (`docker-compose` has been integrated with docker-cli but in case of problems it can still be used.)
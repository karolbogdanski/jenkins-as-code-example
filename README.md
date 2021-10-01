# Jenkins as Code Example Project 

## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Setup](#setup)

## General info
This project is made to explore endless possibilities that jcasc and job-DSL plugins provide to Jenkins.
I am still learnig and so are you (i guess) so feel free to report any issues and tips.
Topics I tried to cover here are: creating docker agents, sending mail notifications, setting up jobs and piplines, wrapping the whole configuration with the Infrastucture as Code principle.

## Technologies

* jenkins:lts-jdk11 with plugins listed in jenkins_config/plugins.txt
* docker with slightly changed jenkins official image
* groovy - for writing jenkins jobs scripts
* git - for version control and providing repositories with projects to be built using jenkins

## Setup
To run this project you need docker. 

First, create a text file with admin password in your desired location and provide path to it in docker-compose.yml file.

You may encounter problems with connecting to agent - check where your docker host is listening and provide the right port in casc.yaml file in cloud section.
On docker-for-mac you may have to open a terminal and type `socat TCP-LISTEN:2377,reuseaddr,fork UNIX-CONNECT:/var/run/docker.sock &`, where 2377 is a port I use. 
On docker-for-windows the right port should be displayed in settings section of docker GUI.

Next run `docker compose up` (`docker-compose` has been integrated with docker-cli but in case of problems it can still be used.)
